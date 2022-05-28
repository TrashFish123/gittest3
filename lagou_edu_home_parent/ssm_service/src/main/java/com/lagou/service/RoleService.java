package com.lagou.service;

import com.lagou.domain.Role;
import com.lagou.domain.RoleMenuVo;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface RoleService {
    /*
    查询所有角色（条件）
     */
    List<Role> findAllRole(Role role);

    /*
   根据ID查询角色关联的菜单信息
    */
    List<Integer> findMenuByRoleId(Integer roleid);
    /*
    为角色分配菜单
     */
    void roleContextMenu(RoleMenuVo roleMenuVo);
}
