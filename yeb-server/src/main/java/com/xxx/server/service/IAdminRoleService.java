package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.AdminRole;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gpower
 * @since 2022-03-15
 */
public interface IAdminRoleService extends IService<AdminRole> {
    @Override
    boolean saveOrUpdate(AdminRole entity);
}
