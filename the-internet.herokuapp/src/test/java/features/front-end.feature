Feature: testing Important features

Scenario: verify if Entry ad is working 
       Given We have to go the the url of UAT
       When User will click on entry ad link
       Then We will close the ad popped in the screen
       And We will get the title of URL
       
Scenario: Verify Javascript alerts
      Given We have to go the the url of UAT
      When User will click on javascript alert link
      Then click on jsalert and accept it
      When click on jsPrompt and enter "Shashwat is chutiya"
      Then click on accept 