package com.template.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.template.spring.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
