package nsotien.controller;/*
java by nsotien tv .......
Name : nsotien
Time : 15:02
Date : 06/12/2022
*/

import nsotien.entity.User;
import nsotien.repository.UserRepository;
import nsotien.sevice.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserSevice userSevice;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/new")
    public String add() {
        return "user/create_user";
    }

    @PostMapping("/upload")
    public String add(@RequestParam("files") MultipartFile[] files) throws IllegalStateException, IOException {
        System.out.println(files.length);
        for (MultipartFile file : files)
            if (!file.isEmpty()) {
                final String UPLOAD_FOLDER = "/Users/nsotien/Desktop/Project/";

                String filename = file.getOriginalFilename();
                File newFile = new File(UPLOAD_FOLDER + filename);

                file.transferTo(newFile);
            }

        return "redirect:/user/list";
    }

    @PostMapping("/new")
    public String add(
            @ModelAttribute User user,
            @RequestParam("file") MultipartFile file)
            throws IllegalStateException, IOException {

        if (!file.isEmpty()) {
            final String UPLOAD_FOLDER = "/Users/nsotien/Desktop/Project/";

            String filename = file.getOriginalFilename();
            File newFile = new File(UPLOAD_FOLDER + filename);

            file.transferTo(newFile);

            user.setAvatar(filename);// save to db
        }

        userRepository.save(user);
        return "redirect:/user/search";
    }
}
