package com.aubrun.eric.spring.jwt.springjwt.sid.dao;

import com.aubrun.eric.spring.jwt.springjwt.sid.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

    AppRole findByRole(String role);
}
