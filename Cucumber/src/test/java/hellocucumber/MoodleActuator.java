package hellocucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class MoodleActuator {

    public WebDriver driver;
    //public WebDriver driver1;
    private WebDriverWait wait;
    private WebDriverWait wait1;

    // we need to download the server to our laptop if we need this code to work ab

    public void initSession(String webDriver, String path) {
        webDriver = "webdriver.chrome.driver";//declaring the web driver
        path = "..\\chromedriver.exe"; //the web driver location
        System.setProperty(webDriver, path);// C:\Users\Abdalla\IdeaProjects\sqe-hw33333andthefinallyone

        // new chrome driver object
        this.driver = new ChromeDriver();
        //this.driver1 = new ChromeDriver();

        // new web driver wait -> waits until element are loaded (40 sec max)
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        //this.wait1 = new WebDriverWait(driver1, Duration.ofSeconds(60));


        // launch website -> localhost
        driver.get("http://localhost/moodle");
        //driver1.get("http://localhost/moodle");

        // maximize the window - some web apps look different in different sizes
        driver.manage().window().maximize();
       // driver1.manage().window().maximize();


        System.out.println("Driver setup finished for - " + driver.getTitle());
    }

    public void goToLogin(){
        // locate and click on web element -> login
        driver.findElement(By.linkText("Log in")).click();
    }
//    public void initializingTheNewDriver(){
//
//          this.driver1 = new ChromeDriver();
//          this.wait1 = new WebDriverWait(driver1, Duration.ofSeconds(60));
//          driver1.get("http://localhost/moodle");
//          driver1.manage().window().maximize();
//
//    }
//    public void goToLoginInParallel(){
//
//        driver1.findElement(By.linkText("Log in")).click();
//    }
    public void logiInfo(String userName,String password){
        //find the username element and fell it with the username
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']"))).sendKeys(userName);
        //find the password element and fell it with the passwword
        driver.findElement(By.xpath("//*[@name='password' and @type='password']")).sendKeys(password);

        // click the login button
        driver.findElement(By.id("loginbtn")).click();
    }
//    public void logiInfoInParallel(String userName,String password){
//        //find the username element and fell it with the username
//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']"))).sendKeys(userName);
//        //find the password element and fell it with the passwword
//        driver1.findElement(By.xpath("//*[@name='password' and @type='password']")).sendKeys(password);
//
//        // click the login button
//        driver1.findElement(By.id("loginbtn")).click();
//    }
    public void waitUntilThePageLoad(){
        new WebDriverWait(driver, Duration.ofSeconds(40));
    }
    //public void waitUntilThePageLoadinParallel(){new WebDriverWait(driver1, Duration.ofSeconds(40));}
    public void coursesSection(){
        //driver.findElement(By.id(" My courses ")).click();
        driver.findElement(By.linkText("My courses")).click();
    }
//    public void coursesSectioninParallel(){
//        //driver.findElement(By.id(" My courses ")).click();
//        driver1.findElement(By.linkText("My courses")).click();
//    }

    public void theCoursePage(String id){

    driver.navigate().to(id);

    }
//    public void theCoursePageInParallel(String id){
//
//        driver1.navigate().to(id);
//
//    }
    public void forumOfCourse(){
        driver.navigate().to("http://localhost/moodle/mod/forum/view.php?id=1");
    }
//    public void forumOfCourseinParallel(){
//        driver1.navigate().to("http://localhost/moodle/mod/forum/view.php?id=1");
//    }
    public void theWantedComment(){
        //driver.findElement(By.xpath("//a[@href='http://localhost/moodle/mod/forum/discuss.php?d=1']")).click();;
        // "http://localhost/moodle/mod/forum/discuss.php?d=1"
        //driver.navigate().to("http://localhost/moodle/mod/forum/discuss.php?d=2");
        //driver.findElement(By.id("yui_3_17_2_1_1673993504830_46")).click();
        //driver.findElement(By.xpath("//*[@id=\"discussion-list-63c71db30e53b63c71db2c11ce7\"]/div[2]/table/tbody/tr/th/div/a")).click();
        //driver.findElement(By.xpath("//*[@id='dicussion-list-63c7210857c9263c72107f11d37']/div[2]/table/tbody/tr/th/div/a")).click();
        // //*[@id="discussion-list-63c71db30e53b63c71db2c11ce7"]/div[2]/table/tbody/tr/th/div/a
        //*[@id="discussion-list-63c7210857c9263c72107f11d37"]/div[2]/table/tbody/tr/th/div/a
        //*[@id="discussion-list-63c72141d67e263c721419cb907"]/div[2]/table/tbody/tr/th/div/a
        //driver.findElement(By.cssSelector("a.w-100.h-100.d-block[href='http://localhost/moodle/mod/forum/discuss.php?d=2']")).click();
        driver.findElement(By.linkText("hi there")).click();


    }

//    public void theWantedCommentInParallel(){
//       // driver1.findElement(By.cssSelector("a.w-100.h-100.d-block[href='http://localhost/moodle/mod/forum/discuss.php?d=4'][title='parallel']")).click();
//        //driver1.findElement(By.cssSelector("a.w-100.h-100.d-block[href='http://localhost/moodle/mod/forum/discuss.php?d=4'][title='parallel']")).click();
//        //driver1.findElement(By.linkText("parallel")).click();
//        driver1.navigate().to("http://localhost/moodle/mod/forum/discuss.php?d=4");
//
//
//    }
    public void theWantedCommentForTeacher(){
        driver.navigate().to("http://localhost/moodle/mod/forum/discuss.php?d=5");
    }
    public void deleteTheComment(){
        //driver.findElement(By.id("yui_3_17_2_1_1673996620735_52")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='single_button63c72ac6512d412']"))).click();
        //driver.findElement(By.linkText("Delete")).click();
        // driver.findElement(By.cssSelector("a[data-region='post-action'][href='http://localhost/moodle/mod/forum/post.php?delete=4']")).click();
        List<WebElement> deleteLinks = driver.findElements(By.cssSelector("a[data-region='post-action'][href*='delete']"));
        for (WebElement link : deleteLinks) {
            if (link.getAttribute("href").contains("delete=9")) {
                continue;
            } else{
                link.click();
            break;}
            }
        driver.findElement(By.cssSelector("button.btn.btn-primary[type='submit']")).click();
    }
    public void deleteTheCommentForTheTeacher(){
        driver.findElement(By.linkText("Delete")).click();
           //driver.find_element_by_id("single_button63c80f44d20a112").click();
        //driver.find_element_by_class_name("btn btn-primary")
        //driver.findElement(By.cssSelector("button[id='single_button63c82cb790dc812']")).click();

    }
    public void pressTheContinueButton(){
        //driver.findElement(By.cssSelector("button[id='single_button63c82d885efee12']")).click();
        driver.findElement(By.linkText("Continue")).click();
    }



}

//BRB after implementing the steps class
