# Assignment 3: Software Quality Engineering
This is a repository for assignment 3 of the Software Quality Engineering course at the [Ben-Gurion University](https://in.bgu.ac.il/), Israel.

## Assignment Description
In this assignment, we tested an open-source software called Moodle (https://download.moodle.org/releases/latest/).

Moodle is a learning platform designed to provide educators, administrators and learners with a single robust, secure and integrated system to create personalised learning environments. It is designed to support a wide range of learning activities, including online quizzez, fourms and assignment submissions. It is written in PHP and uses MySQL database to store data and is widely used in schools and universities.

## Installation
There are a couple ways to install Moodle I will explain one of them. 
First of all you need to download Moodle, you can open the link listed above at that page you can find another link called "Moodle installer package for" click on the one that is the same as your device, in my case windows. After that download the last stable version and extract it, then run the "Start Moodle.exe" file and it will set up moodle , you can run "Stop Moodle.exe" to stop it, after that open your browser the moodle instalation can be in a couple of url's in our case it was at "localhost/Moodle" but it can also be at "http;//127.0.0.1" after you open the url you will be redirected to a moodle instalation page, then you just follow the instalation and fill in the needed fields and you are finished.
Here are 2 links that show how to install Moodle(we followed the second one):
1)https://www.youtube.com/watch?v=WuYWftpNONo&t=8s
2)https://www.youtube.com/watch?v=_S_GNTfMztw&t=842s

## What we tested

We tested the comment modle that allows for viewing comments and deleting them. We chose to test the following user stories: 

*User story:*A student views a comment of a forum

*Preconditions:* There is a course with a forum, comment and a student.

*Expected outcome:* The Student can view the comment.

*User story:*A teacher delets that comment

*Preconditions:* There is a course with a forum and a comment.

*Expected outcome:* The student views the comment and the teacher cannot delete it.
$$

## How we tested
We used two different testing methods:
1. [Cucumber](https://cucumber.io/), a BDD testing framework.
2. [Provengo](https://provengo.tech/), a story-based testing framework.

Each of the testing methods is elaborated in its own directory. 

## Results
Update all README.md files (except for d-e, see Section 1). Specifically, replace all $$*TODO*…$$ according to the instructions inside the $$.
