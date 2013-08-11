package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 06/08/13
 * Time: 17:51
 * To change this template use File | Settings | File Templates.
 */
@WebService(name = "ZipCodeService", targetNamespace = "http://localhost/zipcode")
public interface ZipCodeService {

    @WebMethod(operationName = "getState")
    @WebResult(name = "state")
    public State getState(@WebParam(name = "zipcode") Integer zipcode);

    @WebMethod(operationName = "addZipcode")
    public void addZipcode(@WebParam(name = "state") State state,
                           @WebParam(name = "zipcodes") List<Integer> zipcodes);

}
