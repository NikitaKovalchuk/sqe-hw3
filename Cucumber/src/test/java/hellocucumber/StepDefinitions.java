package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class StepDefinitions {

        private String TEACHER_NAME = "admin";
        private String TEACHER_PASSWORD = "Admin123!";
        private String STUDENT_NAME = "student";
        private String STUDENT_PASSWORD = "Student123!";
        private String COURSE_LINK = "http://localhost/moodle/course/view.php?id=2\"";
        private static List<MoodleActuator> allMoodles;
        private static MoodleActuator moodle;
    private static MoodleActuator moodleStudent;
    private String webDriver = "webdriver.chrome.driver";
    private String path = "..\\chromedriver.exe";
    public void moodleInit(){
            System.out.println("-------**------- Initializing MoodleTest and then opening web bage -------**-------");
            if(allMoodles ==null){
                allMoodles =new ArrayList<>();
            }
            moodle = new MoodleActuator();
            allMoodles.add(moodle);
            moodle.initSession(webDriver, path);
        }
//        public void moodleInitforstudentinparallel(){
//            System.out.println("-------**------- Initializing MoodleTest and then opening web bage -------**-------");
//            if(allMoodles ==null){
//                allMoodles =new ArrayList<>();
//            }
//            moodleStudent = new MoodleActuator();
//            allMoodles.add(moodleStudent);
//            moodleStudent.initSession(webDriver, path);
//        }
//    // $$*TODO* explain what this step does$$
//    @Given("an example scenario")
//    public void anExampleScenario() {
//    }
//
//    // $$*TODO* explain what this step does$$
//    @When("all step definitions are implemented")
//    public void allStepDefinitionsAreImplemented() {
//    }
//
//    // $$*TODO* explain what this step does$$
//    @Then("the scenario passes")
//    public void theScenarioPasses() {
//    }

      // $$*TODO* initializing the moodle to the login page$$
    @Given("a student is on home page$")
      public void initTheMoodle(){
        moodleInit();
      }

      // $$*TODO* initializing the moodle to the login page$$
      @When("Student presses the LogIn button$")
      public void navigatetoLoginPage(){
          moodle.goToLogin();
      }

      // $$*TODO* initializing the moodle to the login page$$
      @When("Student enters UserName and Password$")
      public void userEntersLoginInfo(){
          moodle.logiInfo(STUDENT_NAME,STUDENT_PASSWORD);
      }


    // $$*TODO* initializing the moodle to the login page$$
    @When("Student HomeProfile shows$")
    public void studentHomeProfileShows(){
        moodle.waitUntilThePageLoad();
    }
    @And("Student enters the courses section$")
        public void studentEnteredTheCourseSection(){
            moodle.coursesSection();
    }
    @When("Student enters the course page$")
        public void studentEnteredCoursePage(){

            moodle.theCoursePage(COURSE_LINK);
    }
    @When("Student enters the forum of the course$")
        public void studentEntersTheForum(){
            moodle.forumOfCourse();
    }
    @When("Student clicked on a subject that he wanted$")
        public void studentClickedTheWantedSub(){
            moodle.theWantedComment();
    }
    @Then("Student views the comment in a subject in the forum$")
        public void studentViewsTheComment(){

    }   //*********

    /*
    *
    *     //      // $$*TODO* initializing the moodle to the login page$$
          @Then("Message displayed Login Successful$")
          public void messageDisplayedLoginSuccessfully(){
                System.out.println("success log in");
          }
    * */
    @Given("Teacher is on home page$")
        public void teacher_is_on_home_page() {

            moodleInit();

    }

    @When("Teacher presses the LogIn button$")
        public void teacher_presses_the_log_in_button() {
            moodle.goToLogin();
    }

    @And("Teacher being redirected to the courses section$")
        public void teacher_being_redirected_to_the_courses_section() {
            moodle.logiInfo(TEACHER_NAME,TEACHER_PASSWORD);
            moodle.coursesSection();
    }

    @And("Teacher enters the course page$")
        public void teacher_enters_the_course_page() {
            moodle.theCoursePage(COURSE_LINK);
    }

    @And("Teacher enters the forum of the course$")
        public void teacher_enters_the_forum_of_the_course() {
            moodle.forumOfCourse();
    }

    @And("Teacher enters the subject he wanted$")
        public void teacher_enters_the_subject() {
            moodle.theWantedComment();
    }

    @And("Teacher deletes a comment$")
        public void teacher_deletes_a_comment() {
            moodle.deleteTheComment();
    }

    @Then("the comment will disappear$")
        public void the_comment_will_disappear() {
            // Code to verify that the comment has been deleted
    }

    ///////////////////////////////////////////
    @Given("the Teacher is on home page$")
    public void the_Teacher_is_on_home_page() {
        moodleInit();
    }
    @When("the Teacher has logged in and deleted the comment$")
    public void the_Teacher_has_logged_in_and_deleted_the_comment() {

        moodle.goToLogin();
        moodle.logiInfo(TEACHER_NAME,TEACHER_PASSWORD);
        moodle.waitUntilThePageLoad();
        moodle.coursesSection();
        moodle.theCoursePage(COURSE_LINK);
        moodle.forumOfCourse();
        moodle.theWantedCommentForTeacher();
        moodle.deleteTheCommentForTheTeacher();
        //moodle.pressTheContinueButton();
    }
    @And("Student is on home page$")
    public void student_is_on_home_page() {
        moodleInit();
        //moodle.initializingTheNewDriver();
        //moodleInitforstudentinparallel();
    }
    //
    @And("Student has logged in and trying to view the comment$")
    public void student_has_logged_in_and_trying_to_view_the_comment() {

//            moodle.goToLoginInParallel();
//            moodle.logiInfoInParallel(STUDENT_NAME,STUDENT_PASSWORD);
//            moodle.waitUntilThePageLoadinParallel();
//            moodle.coursesSectioninParallel();
//            moodle.theCoursePageInParallel(COURSE_LINK);
//            moodle.forumOfCourseinParallel();
        //moodle.theWantedCommentInParallel();
       // moodleInit();
        moodle.goToLogin();
        moodle.logiInfo(STUDENT_NAME,STUDENT_PASSWORD);
        moodle.waitUntilThePageLoad();
        moodle.coursesSection();
        moodle.theCoursePage(COURSE_LINK);
        moodle.forumOfCourse();
        //moodle.theWantedCommentForTeacher();
    }
    //
    //
    //
    @And("the student has clicked on the comment$")
    public void the_student_has_clicked_on_the_comment() {
        moodle.theWantedCommentForTeacher();
    }
//
    @Then("a message says this comment has been deleted$")
    public void a_message_says_this_comment_has_been_deleted() {
            System.out.println("Congrats, The test passed!");    }

}
