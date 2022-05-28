package com.lagou.service;

import com.lagou.domain.Test;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface TestService {
    /*
    查询所有
     */

    List<Test> findAllTest();
}
