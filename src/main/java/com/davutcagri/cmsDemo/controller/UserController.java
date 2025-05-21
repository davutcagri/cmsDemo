package com.davutcagri.cmsDemo.controller;

import com.davutcagri.cmsDemo.dtos.UserDto;
import com.davutcagri.cmsDemo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public String save(@RequestBody UserDto user) {
        return userService.save(user);
    }
}
