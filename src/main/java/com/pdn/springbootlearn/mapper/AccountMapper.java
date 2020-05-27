package com.pdn.springbootlearn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pdn.springbootlearn.beans.Account;
import org.springframework.stereotype.Repository;

/**
 * @author pdn
 */
@Repository
public interface AccountMapper extends BaseMapper<Account> {
    /**
     * 根据id获得账户
     * @param id 账户id
     * @return 账户
     *  @Select("select * from account where id=#{id}")
     *     Account getAccountById(Integer id);
     */

}
