package edu.neumont;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import edu.neumont.jaxb.Service;
import edu.neumont.order.PostOrder;
import edu.neumont.restaurants.GetRestaurants;

/**
 * Created with IntelliJ IDEA. User: Berwyn Codeweaver Date: 30/07/13 Time:
 * 17:54 To change this template use File | Settings | File Templates.
 */
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doPost(req, resp);
        String action = req.getParameter("method");
        try {
            JAXBContext context;
            Service service = ServiceManager.getService();
            if (action.equals("getRestaurants")) {
                context = JAXBContext.newInstance(GetRestaurants.class);
                context.createMarshaller().marshal(service,
                        resp.getOutputStream());
            } else if (action.equals("order")) {
                context = JAXBContext.newInstance(PostOrder.class);
                PostOrder order = (PostOrder) context.createUnmarshaller().unmarshal(req.getInputStream());
                context = JAXBContext.newInstance();
            } else {
                resp.setStatus(422);
                return;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
