package com.purvesh.hotelbooking.repository;

import com.purvesh.hotelbooking.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Simpson Alfred
 */

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String role);


    boolean existsByName(String role);
}
