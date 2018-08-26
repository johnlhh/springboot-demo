package com.smartzhe.demo.domain.dao;

import com.smartzhe.demo.aop.Master;
import com.smartzhe.demo.domain.entity.Account;

import java.util.List;
import java.util.Map;

public interface AccountMapper {
    /**
     * 根据条件统计账户个数
     *
     * @param params
     */
    int countByMap(Map params);

    /**
     * 根据条件分页查询账户
     *
     * @param params
     */
    @Master
    List<Account> findByMap(Map params);

    /**
     * 根据主键删除账户
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增账户
     *
     * @param record
     */
    int insert(Account record);

    /**
     * 根据主键获取账户
     *
     * @param id
     */
    Account selectByPrimaryKey(Integer id);

    /**
     * 根据主键来更新部分账户信息
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Account record);
}