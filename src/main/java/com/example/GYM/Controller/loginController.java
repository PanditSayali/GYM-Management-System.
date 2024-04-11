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
import com.example.GYM.Model.login;
import com.example.GYM.Repository.loginRepository;


@RestController
@CrossOrigin("*")	
public class loginController {
	
	@Autowired
	loginRepository gymrepo;

	@PostMapping("/loginPage")
	public login loginpage(@RequestBody login logininfo) {
		return gymrepo.save(logininfo);
	}
	
	@GetMapping("/logindata")
	public List<login> Logindata() {
	return gymrepo.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteValue(@PathVariable int id) {
	    gymrepo.deleteById((long)id);
	    return "Record Deleted";
	}
	
	@RequestMapping( path = "/setValue/{id}/{password}" ,method = RequestMethod.PUT)
	public String updatePassword(@PathVariable Integer id , @PathVariable String password) {
		login logininfo = gymrepo.findById(id);

		if (logininfo != null) {
			logininfo.setPassword(password);
			gymrepo.save(logininfo);
			return "record Updated";
		} else {
			return "error";
		}
	}

}
