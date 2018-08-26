package com.smartzhe.demo.web.controller;

import com.smartzhe.demo.domain.entity.Account;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by luohuahua on 18/8/26.
 */
@RestController
@RequestMapping(value = "/test",method = RequestMethod.POST)
public class TestController {

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @RequestMapping("/get")
    public Account get(@RequestParam("id") Integer id) {

        Account account = new Account();
        account.setEmail("649220839@qq.com");
        account.setName("john");
        account.setMobile("13817006323");
        account.setPassword("123456");
        account.setTimeCreate(new Date());
        account.setTimeUpdate(new Date());
        account.setLastLoginTime(new Date());
        return account;
    }
}
