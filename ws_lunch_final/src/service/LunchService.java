package service;

import model.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 10/08/13
 * Time: 19:35
 * To change this template use File | Settings | File Templates.
 */
@WebService(name = "LunchService", targetNamespace = "http://localhost/lunch")
public interface LunchService {

    @WebMethod(operationName = "getMenu")
    @WebResult(name = "service")
    public Service getMenu();

    @WebMethod(operationName = "orderMeal")
    public void orderMeal(@WebParam(name= "name") String name,
                          @WebParam(name = "mealId")Integer mealId,
                          @WebParam(name= "restaurantId")Integer restaurantId);
}
