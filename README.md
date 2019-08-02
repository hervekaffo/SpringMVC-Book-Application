# SpringMVC-Book-ApplicationJPA2
Spring MVC Book Application

1. The program uses a databases named mcvdb I created with MySql server(User : root and
password: )
2. I created my project using the source code of part2-assignment1 spring-mvc-webbapp-1 in
which I added the securities features and the delete book functionality.
3. I created the folder main\resources\META-INF\sql where I put my shema.sql corresponding to
my database shema and test-data.sql to insert some data; the select * from book shows the
following result
4. Configuring the Spring-mvc-webbapp-2 security
- I added a new Controller SecurityController.java in the controller package in which I
handled the login fail.
- I added the file security-context.xml in which I defined the authentication manager. I
created a username:user and password: user for testing purpose.
- I imported the security-context.xml into the root-context.xml.
5. Adding the Login functionality to the spring-mvc-webbapp-2 application
- In the header.jspx , I make sure only a logged user can create a new book or see the
update book or Delete book 
- I used user/user as username/password for testing purpose
- I added the login form in the menu.jspx
After building and deploying My application, I tested the login functionality. Those are the result
bellow:
- I entered a wrong username and password
- Now I entered the good username and password user/user and I don’t see the login failure
anymore and I have the welcome and logout link available.
- After being logged in, I clicked the book with ID = 4 and got this Book Information
dialog, I can see the Update Book and Delete Book link:
I can see the Update Book and Delete Book link:
- If I click the same book without getting logged in, I can’t see the Update Book and
Delete Book link:
- Now if I’m logged and I click the new book link , I can add a book . 
- I can see the new book inside the database
- I can also delete the book I just added.
I first select the book 
When I click the delete Book link, I have the following result:
And the book is not in the database anymore
- Using Annotations to Secure Controller Methods
• url access :
I added the <annotation-driven validator="validator"/> and <security:global-methodsecurity pre-post-annotations="enabled"/> in the servelet-context.xml and the annotation
@PreAuthorize("isAuthenticated()") to the appropriate methods on the BookController.java,
I have the following result.
When I enter the URL http://localhost:8088/spring-mvc-webapp-2/books?form I have the
following result 
I got redirected to the home login page.
- At anytime of the application, if I click the logout link, I got redirected to the home login
page : 

