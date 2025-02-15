package com.vikas.JWT_SetUp.Project.repository;

import com.vikas.JWT_SetUp.Project.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
