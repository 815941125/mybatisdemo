package com.lf.demo.service.impl;

import com.lf.demo.dao.StaffMapper;
import com.lf.demo.entity.SystemStaff;
import com.lf.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/30
 * @desc
 * @see
 * @since 1.0
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public SystemStaff getStaffById(Long id) {
        return staffMapper.getStaffById(1, id);
    }
}
