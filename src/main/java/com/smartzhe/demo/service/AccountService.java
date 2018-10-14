package com.smartzhe.demo.service;

import com.smartzhe.demo.domain.dao.AccountMapper;
import com.smartzhe.demo.domain.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luohuahua on 18/10/13.
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;


    public Account getById(Integer id){
       return accountMapper.selectByPrimaryKey(id);
    }

    public Integer deleteById(Integer id){
        Account account = getById(id);
        if(account == null){
            // FIXME: 18/10/13
            //throw new RuntimeException
        }
        if(accountMapper.deleteByPrimaryKey(id) != 1){
            //throw new RuntimeException
        }
        return id;
    }

    public Integer add(Account account){
        if( accountMapper.insert(account) != 1){
            //throw new RuntimeException
        }
        return account.getId();
    }

    public Integer update(Account account){
        if( accountMapper.updateByPrimaryKeySelective(account) != 1){
            //throw new RuntimeException
        }
        return account.getId();
    }
}
