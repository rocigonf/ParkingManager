package com.rociojorge.parkingmanagerDemo.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {
    

    private UserRepository repository = new UserRepository();
        
    public String displayUsers(Model model) {
        model.addAttribute("users", repository.getAll());
        return "userlist";
        
    }
}
