package com.projeto1.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1.projeto1.entities.User;

/* poderia colocar uma @Repository ? sim mais nao é necessario por que ela ja está herdando do JPA */
public interface UserRepository  extends JpaRepository <User , Long>{

}

