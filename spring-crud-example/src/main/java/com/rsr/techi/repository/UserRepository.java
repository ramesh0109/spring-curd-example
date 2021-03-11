package com.rsr.techi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsr.techi.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
