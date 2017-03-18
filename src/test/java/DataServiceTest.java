import model.Adress;
import model.Company;
import model.StreetPrefix;
import model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.DataService;

import java.util.List;

/**
 * Created by RENT on 2017-03-14.
 */
public class DataServiceTest {
    private String xmlUser = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><User><login>kowalski</login><password>abc123</password></User>";
    private User userFromLoad;
    private User userXML;
    private DataService dataService;
    private Company company;

    @Before
    public void setUp() throws Exception {
        company = new Company();
        company.setName("Biedronka");
        company.setAdress(new Adress("Cwiartki","3","4","60-666","Poznan","Poland", StreetPrefix.STREET));
        company.setNip("324534526");
        company.setRegon("567456246");
        dataService = new DataService();
        userXML = new User("kowalski", "abc123");
    }

    public void loadData() {
        userFromLoad = dataService.loadData();
    }

    public void saveData() {
        dataService.saveData(xmlUser);
    }

    @Test
    public void saveAndLoadData() {
        saveData();
        loadData();
        Assert.assertTrue(userFromLoad.equals(userXML));
    }

    @Test
    public void printCompanyInfo(){
        List<String> companyInfo = dataService.printCompanyInfo(company);
        boolean resultAssert = true;
        resultAssert &= companyInfo.get(0).equals("Biedronka");
        System.out.println("resultAssert" + resultAssert);
        resultAssert &= companyInfo.get(1).equals("ul.Cwiartki 3/4\n60-666 Poznan");
        System.out.println("resultAssert" + resultAssert);
        resultAssert &= companyInfo.get(2).equals("324534526");
        System.out.println("resultAssert" + resultAssert);

        for (String line: companyInfo){
            System.out.println(line);
        }
//        System.out.println(companyInfo.toString());

        Assert.assertTrue(resultAssert);
    }

}
