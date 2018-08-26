package com.smartzhe.demo.service;

import com.smartzhe.demo.domain.dao.AccountMapper;
import com.smartzhe.demo.domain.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by luohuahua on 18/8/26.
 */
@Service
public class DemoService {

    @Autowired
    private AccountMapper accountMapper;


    @Transactional
    public void demo() {
        System.out.println("1.Insert--------------");
        List<Integer> orderIds = new ArrayList<>(10);
        for (int i = 0; i < 1; i++) {
            Account account = new Account();
            account.setEmail("649220839@qq.com");
            account.setName("john");
            account.setMobile("13817006323");
            account.setPassword("123456");
            account.setTimeCreate(new Date());
            account.setTimeUpdate(new Date());
            account.setLastLoginTime(new Date());
            accountMapper.insert(account);
            orderIds.add(account.getId());
        }


        List<Account> result = accountMapper.findByMap(null);
        System.out.println(result.size());

        System.out.println("2.Delete--------------");
        for (Integer each : orderIds) {
            accountMapper.deleteByPrimaryKey(each);
            int i = 1/0;
        }


    }
}
