package com.example.UsersFilesFolders.repositories;

import com.example.UsersFilesFolders.models.File;
import com.example.UsersFilesFolders.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
