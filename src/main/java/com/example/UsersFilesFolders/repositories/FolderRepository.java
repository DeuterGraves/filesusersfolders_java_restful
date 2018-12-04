package com.example.UsersFilesFolders.repositories;

import com.example.UsersFilesFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
