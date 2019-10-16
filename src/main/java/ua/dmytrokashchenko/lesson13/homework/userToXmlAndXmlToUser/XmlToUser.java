package ua.dmytrokashchenko.lesson13.homework.userToXmlAndXmlToUser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlToUser {
    public static User xmlToUser(String fileName) {

        File file = new File(fileName);
//        JAXBContext context;
        User user = null;
        try {
            JAXBContext context = JAXBContext.newInstance(User.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            user = (User) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return user;
    }
}
