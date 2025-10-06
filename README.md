Ticket: Automate Login Flow (Selenium Setup)
-------------------------------------------
Our product has a login feature. This is the most critical user flow (business impact).
We want to automate it using Selenium + TestNG.

🛠 Task
------

Setup Selenium + TestNG in your project.

Add Maven dependencies:

<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.23.0</version>
</dependency>

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
    <scope>test</scope>
</dependency>


Wrote a test to:
--------------

Open browser.

Navigate to https:https://www.demoblaze.com/

Enter valid username + password 

Click Login.

Assert you land on the Products page (check URL or heading).

QNA
---

What locator strategy did you use (id, css, xpath)? id, css 

Why login is a good first candidate for UI automation? its critical and gives access to other module

If the login test fails, what is the business impact? no purchase resulting in no business
