package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.server.pojo.Department;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Gpower
 * @since 2022-03-15
 */
public interface DepartmentMapper extends BaseMapper<Department> {
    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments(Integer parenrId);

    void addDep(Department dep);

    void deleteDep(Department dep);
}
