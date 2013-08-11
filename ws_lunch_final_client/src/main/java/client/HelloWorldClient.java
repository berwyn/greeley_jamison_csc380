package client;

import org.apache.cxf.wsn.jaxws.GetResourcePropertyService;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 10/08/13
 * Time: 22:48
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      org.apache.cxf.wsn.client.Publisher service = new GetResourcePropertyService().getPort();
      //invoke business method
      service.keyExchangeToken();  
  }
}