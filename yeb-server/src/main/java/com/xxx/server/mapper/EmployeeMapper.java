package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xxx.server.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Gpower
 * @since 2022-03-15
 */
public interface EmployeeMapper extends BaseMapper<Employee> {
    /**
     * 查询所有员工（分页）
     * @param page
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    IPage<Employee> getEmployeeByPage(Page<Employee> page, @Param("size") Integer size, @Param("employee") Employee employee, @Param("beginDateScope") LocalDate[] beginDateScope);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);
}
