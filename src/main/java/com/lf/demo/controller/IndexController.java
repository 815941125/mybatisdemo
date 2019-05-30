package com.lf.demo.controller;

import com.lf.demo.entity.SystemStaff;
import com.lf.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/30
 * @desc
 * @see
 * @since 1.0
 */
@RestController
public class IndexController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/index")
    public SystemStaff getIndex() {
        return staffService.getStaffById(1L);
    }
}
