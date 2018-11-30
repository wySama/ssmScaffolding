package com.wy.controller;

import com.wy.dto.Account;
import com.wy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/queryById")
    @ResponseBody
    public Account queryById() throws Exception {
        Account account = accountService.queryById(8);
        return account;
    }
}
