Feature: Account feature

Background: user is successfully launch browser and website
Given user opens "chrome" browser and exe "C:\\Users\\UMESH\\Desktop\\automationpracticewebsite\\automationpractice\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
Given user enters url "http://automationpractice.com/index.php"
Given user click on signin button


@SmokeTest
Scenario: To verify authentication functionality with valid emailid
When user enter "ahireumesh@gmail.com" as  emailid
When user click on Create an account button
Then validate account page
When user click on Mr. radio button
When user enter "umesh" as firstname
When user enter "ahire" as lastname
When user enter "password" as password
When user enter "XYZ Tech" as company
When user enter "Nimbut Corner,Baramati" as Address
When user enter "Baramati" as city
When user select "Florida" as state
When user enter "32003" as Zip
When user select "United States" as country
When user enter "8788100181" as mobileno
When user click on Register button
Then validate authenticate page

