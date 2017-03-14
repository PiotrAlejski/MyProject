import junit.framework.TestCase;
import model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import xml.XMLFactory;

/**
 * Created by RENT on 2017-03-13.
 */
public class XMLFactoryTest {
    private java.lang.String login;
    private String password;
    private String xmlUserKnown;
    private String xmlUser;
    private User userFormXml;

    public XMLFactoryTest() {
    }

    @Before
    public void setUp() throws Exception {
        login = "kowalski";
        password = "abc123";
        xmlUserKnown = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><User><login>kowalski</login><password>abc123</password></User>";
    }

    @Test
    public void objectToXML() {
        XMLFactory<User> xmlFactory = new XMLFactory<User>(User.class);
        User user = new User(login, password);
//        String xmlUser = xmlFactory.objectToXML(user);
//        System.out.println(xmlUser);
        Assert.assertTrue(user.equals(xmlUser));
    }

    @Test
    public void xmlToObject() {
        XMLFactory<User> xmlFactory = new XMLFactory<User>(User.class);
        User userFormXml = xmlFactory.xmlToObject(xmlUser);
        User user = new User(login, password);
        Assert.assertTrue(user.equals(userFormXml));
    }
}
