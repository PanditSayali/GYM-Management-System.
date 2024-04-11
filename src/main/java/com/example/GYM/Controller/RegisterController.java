package com.example.GYM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.GYM.Model.Register;
import com.example.GYM.Repository.registerRepository;


@RestController
@CrossOrigin("*")
@RequestMapping("/registration")
public class RegisterController {
	
	@Autowired
	registerRepository regisRepo;

	@GetMapping("/registerData")
	public List<Register> getRegister() {
		return regisRepo.findAll();
	}
	
	@PostMapping("/register")
	public Register getregisterData(@RequestBody Register data) {
		return regisRepo.save(data);
	}
	
	@DeleteMapping("/deleteRecord/{id}")
	public String deleteValue(@PathVariable int id) {
	    regisRepo.deleteById((long)id);
	    return "Record Deleted";
	}
	

	@PutMapping("/Update/{id}/{contact}")
	public String updateContact(@PathVariable Integer id, @PathVariable String contact) {
		Register updation = regisRepo.findById(id);
	    if (updation != null ) {
	    	updation.setContact(contact);
	    	regisRepo.save(updation);
	        return "record updated";
	        } else {
	        return "Member not found";
	    }
	}
	@PutMapping(path="/UpdatePassword/{id}/{password}")

		public String updatePassword(@PathVariable Integer id , @PathVariable String password) {
		Register updation = regisRepo.findById(id);
	    if (updation != null ) {
	    	updation.setPassword(password);
	    	regisRepo.save(updation);
	        return "register";
	        } else {
	        return "Member not found";
	    }
	}
	@PutMapping("/UpdatePayment/{id}/{payment}")
	public String updatePayment(@PathVariable Integer id, @PathVariable String payment) {

		Register updation = regisRepo.findById(id);
	    if (updation != null ) {
	    	updation.setPayment(payment);
	    	regisRepo.save(updation);
	        return "record updated";
	        } else {
	        return "Member not found";
	    }
	}

}
