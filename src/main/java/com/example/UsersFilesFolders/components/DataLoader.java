package com.example.UsersFilesFolders.components;

import com.example.UsersFilesFolders.models.File;
import com.example.UsersFilesFolders.models.Folder;
import com.example.UsersFilesFolders.models.User;
import com.example.UsersFilesFolders.repositories.FileRepository;
import com.example.UsersFilesFolders.repositories.FolderRepository;
import com.example.UsersFilesFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args){

        User uPuck = new User("Puck");
        userRepository.save(uPuck);

        User uMaisie = new User("Maisie");
        userRepository.save(uMaisie);

        User uTruffles = new User("Truffles");
        userRepository.save(uTruffles);

        File games = new File("Parsec", "exe", 20);
        fileRepository.save(games);

        Folder smartStuff = new Folder("Smart Stuff", uPuck);
        folderRepository.save(smartStuff);

        games.setFolder(smartStuff);
        fileRepository.save(games);

        Folder bestThings = new Folder("Best Things", uMaisie);
        folderRepository.save(bestThings);

        Folder biscuits = new Folder("Buscuits", uTruffles);
        folderRepository.save(biscuits);

        File java = new File("Homework", "java", 5);
        fileRepository.save(java);
        java.setFolder(smartStuff);
        fileRepository.save(java);

        File cats = new File("I love cats", "doc", 2);
        fileRepository.save(cats);
        cats.setFolder(bestThings);
        fileRepository.save(cats);

        File needsFood = new File("I always run out", "xls", 10);
        needsFood.setFolder(biscuits);
        fileRepository.save(needsFood);

    }
}
