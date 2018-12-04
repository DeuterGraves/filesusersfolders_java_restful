package com.example.UsersFilesFolders.repositories;

import com.example.UsersFilesFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
