package service;

import model.User;
import org.apache.commons.io.FileUtils;
import xml.XMLFactory;

import java.io.File;
import java.io.IOException;

/**
 * Created by RENT on 2017-03-13.
 */
public class DataService {
    private  File file;
    private Object XmlString;
    private java.lang.String xmlString;

    public DataService() {
        this.file = new File ("C:\\Users\\RENT\\Desktop\\data\\data.dat");
    }

    public void saveData() {
        try {
            FileUtils.touch(file);
            FileUtils.writeStringToFile(file, xmlString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //stringa zapisać do pliku za pomocą FileUtils.WriteStringToFile(file, XmlString);
    }
    public User loadData(){
        User user = null;
        XMLFactory<User> xmlFactory = new XMLFactory<User>(User.class);
        String xml = null;
        try {
            xml = FileUtils.readFileToString(file,"UTF-8");
            user = xmlFactory.xmlToObject(xml);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
