package com.lagou.dao;

import com.lagou.domain.Menu;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface MenuMapper {
    /*

   查询所有父子菜单信息
     */
    List<Menu> findSubMenuListBypid(int pid);
}
