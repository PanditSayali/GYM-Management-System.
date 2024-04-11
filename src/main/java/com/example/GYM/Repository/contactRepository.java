package com.example.GYM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GYM.Model.Contact;

public interface contactRepository extends JpaRepository<Contact,Long>{

	

}
