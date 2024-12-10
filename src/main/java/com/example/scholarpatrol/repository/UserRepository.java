package com.example.scholarpatrol.repository;

import com.example.scholarpatrol.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
