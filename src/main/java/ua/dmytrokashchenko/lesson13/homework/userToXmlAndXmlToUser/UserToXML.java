package ua.dmytrokashchenko.lesson13.homework.userToXmlAndXmlToUser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class UserToXML {
    public static void userToXml(User user, String fileName){
        try {
            JAXBContext context = JAXBContext.newInstance(User.class);

            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File file = new File(fileName);

            marshaller.marshal(user, file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
