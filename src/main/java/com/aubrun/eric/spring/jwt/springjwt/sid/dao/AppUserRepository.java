package com.aubrun.eric.spring.jwt.springjwt.sid.dao;

import com.aubrun.eric.spring.jwt.springjwt.sid.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUsername(String username);
}
