package com.lyl.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyl.core.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
