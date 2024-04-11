package com.example.GYM.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.GYM.Model.Register;


public interface registerRepository extends JpaRepository<Register,Long> {

	
	Register findById(Integer id);
	Register findByEmail(String email);

	
}
