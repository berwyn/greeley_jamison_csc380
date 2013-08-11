package servlet;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;
import service.ZipCodeServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 06/08/13
 * Time: 18:27
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/services/*")
public class ZipCodeServlet extends CXFNonSpringServlet {

    @Override
    protected void loadBus(ServletConfig sc) {
        super.loadBus(sc);    //To change body of overridden methods use File | Settings | File Templates.

        Bus bus = getBus();
        BusFactory.setDefaultBus(bus);
        Endpoint.publish("/zipcode", new ZipCodeServiceImpl());
    }
}
