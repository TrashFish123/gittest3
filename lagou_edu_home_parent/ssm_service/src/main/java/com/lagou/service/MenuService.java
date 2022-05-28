package com.lagou.service;

import com.lagou.domain.Menu;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface MenuService {
    List<Menu> findSubMenuListByPid(int pid);
}
