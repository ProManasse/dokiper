package com.crow.dokiperuserservice.repository;

import java.util.Optional;

import com.crow.dokiperuserservice.model.ERole;
import com.crow.dokiperuserservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
	  Optional<Role> findByName(ERole name);
}
