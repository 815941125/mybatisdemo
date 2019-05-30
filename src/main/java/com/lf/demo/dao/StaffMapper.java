package com.lf.demo.dao;

import com.lf.demo.entity.SystemStaff;
import org.apache.ibatis.annotations.Param;

/**
 * @author yikun.he
 * @version 1.0
 * @date 2018/6/29
 * @desc 员工Mapper
 * @see
 * @since 1.0
 */
public interface StaffMapper  {

    SystemStaff getStaffById(@Param("valid") Integer valid, @Param("id") Long id);


}