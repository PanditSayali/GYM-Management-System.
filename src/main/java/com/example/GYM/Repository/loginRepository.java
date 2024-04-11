package com.example.GYM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GYM.Model.login;

public interface loginRepository extends JpaRepository<login,Long>{

	login findById(Integer id);
}
