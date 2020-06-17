package com.wzh.controller;

import com.wzh.pojo.User;
import com.wzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/allUsers")
    public String list(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("userList", users);
        return "allUser";
    }

    @RequestMapping("/toaddUser")
    public String toaddUser() {
        return "addUser";
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {
        System.out.println(user);
        userService.addUser(user);
        return "redirect:/user/allUsers";
    }

    @RequestMapping("/toupdateUser")
    public String toupdateUser(int id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "updateUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        System.out.println(user);
        userService.update(user);
        return "redirect:/user/allUsers";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(int id) {
        userService.deleteUser(id);
        return "redirect:/user/allUsers";
    }
}
