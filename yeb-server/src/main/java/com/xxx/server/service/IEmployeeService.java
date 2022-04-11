package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.Employee;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Gpower
 * @since 2022-03-15
 */
public interface IEmployeeService extends IService<Employee> {
    /**
     * 查询所有员工（分页）
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 获取工号
     * @return
     */
    RespBean maxWorkId();

    /**
     *  添加员工
     * @return
     */
    RespBean addEmp(Employee employee);

    List<Employee> getEmployee(Integer id);
}
