SpringFormHandeling Simplest Example
====================================

This project demos the simplest Spring application form handeling example.

The model class is
    - Contact.java
        -- firstName
        -- lastName
        -- email
        -- telephone

The controller is 
    - ContactController.java

This controller has methods to handle request to /, /contacts, and post request to addContact url.

### Note
- Spring is configured to scan for annotations in com.gazecode package. So it will find the controller
- There may be unnecessary spring files not relevant for this project.
- 

### Output
- Run the Project from Maven Build with the goal "jetty:run"
- access the location localhost:8080
- The form will be displayed, which is contact.jsp
- The form will be submitted to "addContact.html"
- The form fields are automatically binded to the ContactController's addContact method, which is configured to handle post requests on that url
- The fields in the form will be printed in the console, and again the same page is thrown with the same data in the forms...
-- Simple huh...
