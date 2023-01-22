/* @provengo summon selenium */


/**
 *  The ComposeQueryUsername event defines the selenium actions for writing
 *  the query that was given in the parameter e.
 */
defineEvent(SeleniumSession, "ComposeQueryUsername", function(session, e) {
    bp.log.info(e);
    session.writeText("//input[@name='username']", e.text);
})
/**
 *  The ComposeQueryPassword event defines the selenium actions for writing
 *  the query that was given in the parameter e.
 */
defineEvent(SeleniumSession, "ComposeQueryPassword", function(session, e) {
    bp.log.info(e);
    session.writeText("//input[@name='password']", e.text);
})
/**
 * StartLogin event defines the selenium action for clicking the login button.
 */
defineEvent(SeleniumSession, "StartLogin", function(session, e) {
    session.click("//button[@id='loginbtn']");
})


/**
 * ComposeQueryCourse event defines the path between the welcome page after login until the opened comment.
 *  The comment will be Deleted only by the title name "Important"
 */

defineEvent(SeleniumSession, "ComposeQueryCourse", function(session, e) {
    session.click("//a[@href='http://localhost/moodle/my/courses.php']");
    session.click("//span[@class='multiline']");
    session.click("//a[@href='http://localhost/moodle/mod/forum/view.php?id=2']");
    session.click("//a[@title='Important']");

})

/**
 * The StartSearch event defines the selenium action for clicking the search button.
 */
defineEvent(SeleniumSession, "DeleteComment", function(session, e) {
    session.click("//a[@href='http://localhost/moodle/mod/forum/post.php?delete=9']");
    // session.click("//button[@class='btn btn-primary']");

    // session.click("//*[@id=\"p1\"]/div[1]/div/div/div[2]/div[2]/div/a[3]");
    // session.click("//*[@id=\"single_button63c58f224802912\"]");
    // http://localhost/moodle/mod/forum/post.php?delete=2
    // session.click("/html/body/div[3]/div[4]/div/div[3]/div/section/div[2]/div/div/div[3]/div/div[2]/form/button");

    // single_button63c58f224802912
    // //*[@id="p1"]/div[1]/div/div/div[2]/div[2]/div/a[3]
    // session.click("//input[@name='single_button63c550007ee3112']");
    // session.contextClick('//button[@class=" aalink stretched-link"]').click();

})

defineEvent(SeleniumSession, "DeleteConfirm", function(session, e) {
    session.click("//button[@class='btn btn-primary']");
})