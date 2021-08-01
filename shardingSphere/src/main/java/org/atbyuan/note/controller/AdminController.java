package org.atbyuan.note.controller;

import org.atbyuan.note.entity.User;
import org.atbyuan.note.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author atbyuan
 * @date 2021/8/1 15:03
 **/
@RestController
@RequestMapping("/admin")
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @PostMapping("/save")
    public User save(@RequestParam("mobile") String mobile) {
        return adminService.save(mobile);
    }

    @GetMapping("get")
    public User get(@RequestParam("id") Integer id) {
        return adminService.get(id);
    }
}