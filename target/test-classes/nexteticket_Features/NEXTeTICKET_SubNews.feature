Feature: This is a Subscription featuree 

@NexT1
Scenario: Verify Subscribe To Newsletterr displayed in the HomePage
Given Launch <"URL"> Next
Then Scroll down till Subscribe To Newsletter
Then Verify Subscribe To Newsletterr displayed in the HomePage

@NexT2
Scenario: Verify Email field is displaying under Subscribe to Newsletter
Given Launch <"URL"> Next
Then Scroll down till Subscribe To Newsletter
Then Verify Email field is displaying under Subscribe to Newsletter

@NexT3
Scenario: Verify Send button is displaying under Subscribe to Newsletter
Given Launch <"URL"> Next
Then Scroll down till Subscribe To Newsletter
Then Verify Send button is displaying under Subscribe to Newsletter

@NexT4
Scenario: Verify Success massage(Your submission was successful) display when send with email
Given Launch <"URL"> Next
Then Scroll down on HomePage and enter email and click send
Then Verify Your submission was successful this message appears when sent email 

@NexT5
Scenario: Verify Error message (Please fill out this field) should appear when sent without email. 
Given Launch <"URL"> Next
Then Scroll down till Subscribe To Newsletter
Then Click send button without entering the email 
Then Verify Please fill out this field this Error messages appears when sent without email