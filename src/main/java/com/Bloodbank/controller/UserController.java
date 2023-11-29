package com.Bloodbank.controller;


import com.Bloodbank.dao.UserRepo;
import com.Bloodbank.entities.Donor;
import com.Bloodbank.entities.Recipient;
import com.Bloodbank.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    //methode for adding common data to responce
    @ModelAttribute
    public void addCommonData(Model model,Principal principal){
        String userName = principal.getName();
        System.out.println("USERNAME "+userName);

        //get the user using email
        User user = userRepo.getUserByUserEmail(userName);
        System.out.println("USER "+user);

        model.addAttribute("user", user);

    }

    //dashboard home
    @RequestMapping("/index")
    public String dashboard(Model model, Principal principal){

        model.addAttribute("title","User Dashboard");

        return "normal/user_dashboard";
    }

    //open add form handler

    @GetMapping("/add-donor")
    public String openAddDonorForm(Model model){

        model.addAttribute("title","Add Details");
        model.addAttribute("form",new Donor());
        return "normal/add_donor";
        }

        //processing add details donorform

    @PostMapping("/process-donor")
    public String processForm(@ModelAttribute Donor donor, Principal principal){
        try {
            String name = principal.getName();
            User user = this.userRepo.getUserByUserEmail(name);

            user.getDonors().add(donor);
            this.userRepo.save(user);

            System.out.println("DATA " + donor);

            System.out.println("Added to data base");
        }catch (Exception ex){
            System.out.println("ERROR "+ex.getMessage());
            ex.printStackTrace();
        }

        return "normal/add_donor";

    }

    //add details recipient form
    @GetMapping("/add-recipient")
    public String openAddRecipientForm(Model model){

        model.addAttribute("title","Add Details");
        model.addAttribute("form",new Donor());
        return "normal/add_donor";
    }

    //processing add details form

    @PostMapping("/process-recipient")
    public String processForm(@ModelAttribute Recipient recipient, Principal principal){
        try {
            String name = principal.getName();
            User user = this.userRepo.getUserByUserEmail(name);

            user.getRecipients().add(recipient);
            this.userRepo.save(user);

            System.out.println("DATA " + recipient);

            System.out.println("Added to data base");
        }catch (Exception ex){
            System.out.println("ERROR "+ex.getMessage());
            ex.printStackTrace();
        }

        return "normal/add_recipient";

    }




}
