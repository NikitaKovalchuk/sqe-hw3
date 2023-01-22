/* @provengo summon selenium */

// A student views a comment of a forum, a teacher delets that comment

/**
 * A student views a comment of a forum
 * This story opens a new browser window for login to moodle
 * add the relevant data
 * open myCourse window, and The course and Forum and view a comment.
 */
story('Login to Moodle as a Student and view the comment in the Forum1', function () {
    let s = new SeleniumSession().start('http://localhost/moodle/login/index.php')
    s.composeQueryUsername({ text: 'student' })
    s.composeQueryPassword({ text: 'Student123!' })
    s.startLogin()
    s.composeQueryCourse()
})


/**
 * a teacher deletes that comment
 * open browser window, and log in to the Moodle account.
 * and delete a comment in the forum.
 */
story('Login to Moodle as Admin and delete the comment', function () {
    let s = new SeleniumSession().start('http://localhost/moodle/login/index.php')
    s.composeQueryUsername({ text: 'Admin' })
    s.composeQueryPassword({ text: 'Admin123!' })
    s.startLogin()
    s.composeQueryCourse()
    s.deleteComment()
    s.deleteConfirm()
})



