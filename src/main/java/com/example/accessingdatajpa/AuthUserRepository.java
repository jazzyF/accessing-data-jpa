package com.example.accessingdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRepository extends JpaRepository<AuthUser, Integer> {
    AuthUser findByUsername(String userName);
    AuthUser findByLastName(String lastName);
}
