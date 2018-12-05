package com.example.UsersFilesFolders.projections;

import com.example.UsersFilesFolders.models.File;
import com.example.UsersFilesFolders.models.Folder;
import com.example.UsersFilesFolders.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile", types = Folder.class)
public interface EmbedFile {
    String getTitle();
    User getUser();
    File getFile();

}
