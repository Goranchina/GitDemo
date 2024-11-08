package test;

import org.testng.annotations.*;

public class day3 {

    @BeforeClass
    public void beforeclass() {
        System.out.println("Before executing all methods in the class");
    }

    @Parameters({"URL", "APIKey/username"})
    @Test
    public void WebLoginCarLoan(String urlname, String key) {
        //selenium
        System.out.println("Weblogincar");
        System.out.println(urlname);
        System.out.println(key);
    }

    @BeforeMethod
    public void beforeevery() {
        System.out.println("I will execute before every test method in day 3 class");
    }

    @AfterMethod
    public void afterevery() {
        System.out.println("I will execute after every test method in day 3 class");
    }

    @AfterClass
    public void afterclass() {
        System.out.println("After executing all methods in the class");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan() {
        //Appium
        System.out.println("Mobilelogincar");
    }

    @BeforeSuite
    public void Bfsuite() {
        System.out.println("I am no 1");
    }

    @Test(enabled = false)
    public void MobileSignInCarLoan() {
        //Appium
        System.out.println("Mobile SIGN IN");
    }

    @Test(dataProvider = "getData")
    public void MobileSignOutCarLoan(String username, String password) {
        //Appium
        System.out.println("Mobile SIGN OUT");
        System.out.println(username);
        System.out.println(password);
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan", "MobileSignOutCarLoan"})
    public void APICarLoan() {
        //Rest API automation
        System.out.println("APIlogincar");
    }

    @DataProvider
    public Object[][] getData() {
        //1st combination - username and password - good credit history
        //2nd combination - username and password - no credit history
        //3rd combination - fraudelent credit history
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0] = "firstsetusername";
        data[0][1] = "firstpassword";
        //columns in the row are nothing but values for that particular combination

        //2nd set
        data[1][0] = "secondsetusername";
        data[1][1] = "secondpassword";

        //3rd set
        data[2][0] = "thirdsetusername";
        data[2][1] = "thirdpassword";

        return data;
    }
}
