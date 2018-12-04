package com.example.UsersFilesFolders.repositories;

import com.example.UsersFilesFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
