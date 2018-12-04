package com.example.UsersFilesFolders;

import com.example.UsersFilesFolders.models.File;
import com.example.UsersFilesFolders.models.Folder;
import com.example.UsersFilesFolders.models.User;
import com.example.UsersFilesFolders.repositories.FileRepository;
import com.example.UsersFilesFolders.repositories.FolderRepository;
import com.example.UsersFilesFolders.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersFilesFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFileCreated(){
		User userD = new User("Della Mo'Bella");
		userRepository.save(userD);

		File file = new File("Musings and Writings", "Txt", 1);
		fileRepository.save(file);

		Folder folder = new Folder("Texts", userD);
		folderRepository.save(folder);
		file.setFolder(folder);
		fileRepository.save(file);
	}

}
