package com.example.UsersFilesFolders.projections;

import com.example.UsersFilesFolders.models.File;
import com.example.UsersFilesFolders.models.Folder;
import com.example.UsersFilesFolders.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    double getSize();
    Folder getFolder();
}
