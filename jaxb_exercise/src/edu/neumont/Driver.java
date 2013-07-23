package edu.neumont;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 22/07/13
 * Time: 18:04
 * To change this template use File | Settings | File Templates.
 */
public class Driver {

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Library.class);
        Unmarshaller um = context.createUnmarshaller();
        Library li = (Library) um.unmarshal(new File("jaxb_exercise/src/library.xml"));
        System.out.println();
    }

}
