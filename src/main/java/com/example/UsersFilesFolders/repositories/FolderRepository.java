package com.example.UsersFilesFolders.repositories;

import com.example.UsersFilesFolders.models.Folder;
import com.example.UsersFilesFolders.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
