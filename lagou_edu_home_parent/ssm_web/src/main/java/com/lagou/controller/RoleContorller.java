package com.lagou.controller;

import com.lagou.domain.Menu;
import com.lagou.domain.ResponseResult;
import com.lagou.domain.Role;
import com.lagou.domain.RoleMenuVo;
import com.lagou.service.MenuService;
import com.lagou.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 张岩
 * @version 1.0
 */
@RestController
@RequestMapping("/role")
public class RoleContorller {
     @Autowired
    private RoleService roleService;
    /**
    查询所有角色（根据条件）
     */
    @RequestMapping("/findAllRole")
    public ResponseResult findAllRole(@RequestBody Role role){

        List<Role> allRole = roleService.findAllRole(role);

        ResponseResult responseResult = new ResponseResult(true, 200, "查询成功", allRole);


        return   responseResult;


    }

    /**
     * 查询所有菜单列表
     */

    @Autowired
    private MenuService menuService;
    @RequestMapping("/findAllMenu")
    public ResponseResult findAllMenu(){
        ///-1 表示查询所有菜单数据
        List<Menu> subMenuListByPid = menuService.findSubMenuListByPid(-1);

        Map<String, Object> map = new HashMap<>();

        map.put("parentMenuList",subMenuListByPid);

        ResponseResult responseResult = new ResponseResult(true, 200, "查询菜单成功", map);

        return  responseResult;


    }


    /**
     * 查询角色关联菜单列表ID
     * */
    @RequestMapping("/findMenuByRoleId")
    public ResponseResult findMenuByRoleId(Integer roleId){
        List<Integer> menuList = roleService.findMenuByRoleId(roleId);
        ResponseResult result = new ResponseResult(true,200,"响应成功",menuList);
        return result;
    }


    /**
     * 为角色分配菜单
     */
    @RequestMapping("/RoleContextMenu")
    public ResponseResult RoleCoentextMenu(@RequestBody RoleMenuVo roleMenuVo){

        roleService.roleContextMenu(roleMenuVo);

        return new ResponseResult(true,200,"响应成功",null);



    }






}
