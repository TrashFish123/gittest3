package com.lagou.dao;

import com.lagou.domain.User;
import com.lagou.domain.UserVo;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface UserMapper {

    /**
查询所有用户
*/
     List<User> findAllUserByPage(UserVo userVo);
    /**
     * 用户登录
     */
    User login(User user);


}
