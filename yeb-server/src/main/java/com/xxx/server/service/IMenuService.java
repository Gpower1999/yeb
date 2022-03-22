package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gpower
 * @since 2022-03-15
 */
public interface IMenuService extends IService<Menu> {
    List<Menu> getMenusByAdminId();
}
