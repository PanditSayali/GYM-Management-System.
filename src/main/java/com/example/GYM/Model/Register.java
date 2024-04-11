package com.example.GYM.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Register")
public class Register{
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String email;

	private String password;
	
	private String contact;
	
	private String gender;
	
	private String age;
	
	private String membership;
	
	private String DOJ;
	
	private String Payment;
	
	public Register() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public String getPayment() {
		return Payment;
	}

	public void setPayment(String payment) {
		Payment = payment;
	}

	public Register(long id, String name, String email, String password, String contact, String gender, String age,
			String membership, String dOJ, String payment) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.gender = gender;
		this.age = age;
		this.membership = membership;
		this.DOJ = DOJ;
		this.Payment = payment;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contact=" + contact + ", gender=" + gender + ", age=" + age + ", membership=" + membership
				+ ", DOJ=" + DOJ + ", Payment=" + Payment + "]";
	}

}
