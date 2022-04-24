package com.LPSBookStore.LPSBookStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.LPSBookStore.LPSBookStore.Entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
	@Query(value = "SELECT u FROM Client u WHERE u.email = :email and u.password = :password")
	Client findClientByLogin(
	  @Param("email") String email, 
	  @Param("password") String password);
}
