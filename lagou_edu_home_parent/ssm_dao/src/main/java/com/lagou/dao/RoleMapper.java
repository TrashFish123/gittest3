package com.lagou.dao;

import com.lagou.domain.Role;
import com.lagou.domain.Role_menu_relation;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface RoleMapper {
    /*
    查询所有角色&条件查询
     */
    List<Role> findAllRole(Role role);
    /*
    根据ID查询角色关联的菜单信息
     */
    List<Integer> findMenuByRoleId(Integer roleid);
    /*
    删除中间表关联关系
     */
    void deleteRoleContextMenu(Integer rid);

    /*
    为角色分配菜单信息
     */
    void roleContextMenu(Role_menu_relation role_menu_relation);
}

