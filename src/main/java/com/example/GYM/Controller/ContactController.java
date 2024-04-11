package com.example.GYM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GYM.Model.Contact;
import com.example.GYM.Repository.contactRepository;

@CrossOrigin("*")
@RestController
public class ContactController {

	@Autowired
	contactRepository conRepo;
	
	@GetMapping("contactData")
	public List<Contact>getContact(){
		return conRepo.findAll();
	}
	
	@PostMapping("/contactus")
	public Contact getContactUs(@RequestBody Contact contact) {
		 return conRepo.save(contact);	
	}
	
	@RequestMapping("/deleteContact/{id}")
	public String deleteValue(@PathVariable int id) {
	    conRepo.deleteById((long)id);
	    return "Record Deleted";
	}
}
