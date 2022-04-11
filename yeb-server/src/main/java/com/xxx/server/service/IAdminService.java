package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.Admin;
import com.xxx.server.pojo.Menu;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gpower
 * @since 2022-03-15
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param code
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);

    /**
     * 根据用户id查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);

    /**
     * 获取所有操作员
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(String keywords);

    RespBean updateAdminRole(Integer adminId, Integer[] rids);
}
