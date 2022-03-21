package com.xxx.server.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * TODO
 * 用户登录实体类
 * @author Gpower
 * @date 2022/3/20 15:02
 */
@Data
@EqualsAndHashCode(callSuper = false)
//@Accessors用于配置getter和setter方法
@Accessors(chain = true)
@ApiModel(value = "AdminLogin对象", description = "")
@AllArgsConstructor
@NoArgsConstructor
public class AdminLoginParam {
    @ApiModelProperty(value = "用户名",required = true)
    private String username;
    @ApiModelProperty(value = "密码",required = true)
    private String password;
}
