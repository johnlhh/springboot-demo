package com.smartzhe.demo.web.controller;

import com.smartzhe.demo.domain.entity.Account;
import com.smartzhe.demo.service.AccountService;
import com.smartzhe.demo.utils.Pagination;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by luohuahua on 18/8/26.
 */
@RestController
@RequestMapping(value = "/account",method = RequestMethod.POST)
public class AccountController {

    @Autowired
    private AccountService accountService;

    @ApiOperation(value = "获取用户详细信息", notes = "")
    @RequestMapping("/get")
    public Pagination<Account> get(@RequestParam("id") Integer id) {

        return  Pagination.success(accountService.getById(id));
    }

    @ApiOperation(value = "获取用户详细信息", notes = "")
    @RequestMapping("/delete")
    public Pagination<Integer> delete(@RequestParam("id") Integer id) {
        return  Pagination.success(accountService.deleteById(id));
    }

    @ApiOperation(value = "获取用户详细信息", notes = "")
    @RequestMapping("/update")
    public Pagination<Integer> update(Account account) {
        return  Pagination.success(accountService.update(account));
    }

    @ApiOperation(value = "获取用户详细信息", notes = "")
    @RequestMapping("/add")
    public Pagination<Integer> add(Account account) {
        return  Pagination.success(accountService.add(account));
    }
}
