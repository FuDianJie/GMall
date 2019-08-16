package com.fu.gmall.user.controller;

import com.fu.gmall.user.bean.UmsMember;
import com.fu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        String uri = request.getRequestURI();
        System.out.println("url = " + uri);
        return "hello User";
    }

    @RequestMapping("getAllUser")
    public List<UmsMember> getAllUser(){
        List<UmsMember> allUser = userService.getAllUser();
        return allUser;
    }

    @GetMapping("getAddressByMemberId")
    public List<UmsMember> getAddressByMemberId(@RequestParam String memberId){
        List<UmsMember> list = userService.getAddressByMemberId(memberId);
        return list;
    }

}
