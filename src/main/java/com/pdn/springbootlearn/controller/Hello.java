package com.pdn.springbootlearn.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pdn.springbootlearn.beans.Account;
import com.pdn.springbootlearn.mapper.AccountMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author pdn
 */

@RestController
public class Hello {

    @Resource(name = "accountMapper")
    private AccountMapper accountMapper;

    @RequestMapping("/success")
    public Page say() {
        Page<Account> page = new Page<>(1, 2);
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.like("name", "p");
        Page<Account> accountPage = accountMapper.selectPage(page, wrapper);
        System.out.println(accountPage.getTotal());
        accountPage.getRecords().forEach(System.out::println);
        return page;
    }
}
