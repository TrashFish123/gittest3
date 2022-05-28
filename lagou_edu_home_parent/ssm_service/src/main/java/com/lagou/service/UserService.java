package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.User;
import com.lagou.domain.UserVo;

/**
 * @author 张岩
 * @version 1.0
 */
public interface UserService {
    /*
查询所有用户
*/
     PageInfo findAllUserByPage(UserVo userVo);

    /**
     * 用户登录
     */
    User login(User user) throws Exception;

}
