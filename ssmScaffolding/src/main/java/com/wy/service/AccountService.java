package com.wy.service;

import com.wy.base.BaseService;
import com.wy.dao.AccountMapper;
import com.wy.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService extends BaseService<Account> {
    @Autowired
    private AccountMapper accountMapper;
}
