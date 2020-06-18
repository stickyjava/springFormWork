package com.gazecode.controller.form;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.gazecode.model.Contact;

@Controller
@SessionAttributes
public class ContactController {
 
    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public ModelAndView addContact(@ModelAttribute("contact")
                            Contact contact, BindingResult result) {
    	ModelAndView model =  new ModelAndView("contact", "command", contact);
    	
        System.out.println("First Name:" + contact.getFirstname() + 
                    ", Last Name:" + contact.getLastname() +
                    ", email: " + contact.getEmail() +
                    ", Telephone: " + contact.getTelephone()
        		);
        
        return model;
    }
     
    @RequestMapping("/contacts")
    public ModelAndView showContacts() {
         
        return new ModelAndView("contact", "command", new Contact());
    }
    
//    @RequestMapping("/")
//    public String welcome() {
//         
//    	return "redirect:contacts.html";
//    }
}
