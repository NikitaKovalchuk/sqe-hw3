Feature: Login

#  Scenario: Testing how a case where a user adds a product to the cart
#    Given an example scenario
#    When all step definitions are implemented
#    Then the scenario passes

#  Scenario: Successful logged in
#    Given User is on home Page
#    When User Navigate to LogIn Page
#    And User enters UserName and Password
##    And Welcome back, <WelcomeWord>! message displays
#    Then Message displayed Login Successful

#  Scenario: Student enters the Course Section
#    Given a student is loggedIn
#    And Student is on Courses Home Page
#    When User Navigate to Course Name
#    Then a page of the Course Site must be oppened
#
#  Scenario: Student views a comment
#    Given a student is loggedIn
#    And the student is viewing an assignment
#    When the student clicks on the "View Comments" button
#    Then the student should see a list of comments on the assignment
#
#  Scenario: Teacher deletes a comment
#    Given a teacher is logged in
#    And the teacher is viewing an assignment with comments
#    When the teacher clicks on the "Remove" button for a comment
#    Then the comment should be removed from the assignment
#    And a message should be displayed confirming the deletion

    Scenario: a Student views a comment
      Given a student is on home page
      When Student presses the LogIn button
      And Student enters UserName and Password
      And Student HomeProfile shows
      And Student enters the courses section
      And Student enters the course page
      And Student enters the forum of the course
      And Student clicked on a subject that he wanted
      Then Student views the comment in a subject in the forum

    Scenario: the teacher deletes the comment
      Given Teacher is on home page
      When Teacher presses the LogIn button
      And Teacher being redirected to the courses section
      And Teacher enters the course page
      And Teacher enters the forum of the course
      And Teacher enters the subject he wanted
      And Teacher deletes a comment
      Then the comment will disappear

    Scenario: the Student views a comment that the teacher has deleted
      Given the Teacher is on home page
      When the Teacher has logged in and deleted the comment
      And Student is on home page
      And Student has logged in and trying to view the comment
      And the student has clicked on the comment
      Then a message says this comment has been deleted