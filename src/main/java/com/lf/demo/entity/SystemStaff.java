package com.lf.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/30
 * @desc
 * @see
 * @since 1.0
 */
@Data
public class SystemStaff {


    /**
     * 账号状态 正常
     */
    public static final Integer ACCOUNT_STATE_NORMAL = 1;
    /**
     * 账号状态 冻结
     */
    public static final Integer ACCOUNT_STATE_FROZEN = 2;

    /**
     * 管理员-是
     */
    public static final Integer IS_ADMIN_YES = 1;
    /**
     * 管理员-否
     */
    public static final Integer IS_ADMIN_NO = 0;


    /**
     * 主键
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码Hash值
     * <p>
     * 敏感信息禁止暴露给外部
     */
    private String passwordHash;
    /**
     * 员工邮箱
     * <p>
     * 非正式环境展示此数据需要进行数据脱敏
     */
    private String email;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 部门
     */
    private Long departmentId;
    /**
     * 职位
     */
    private Long positionId;
    /**
     * 账号状态
     * 账号状态为冻结时,禁止用户登录
     */
    private Integer accountState;
    /**
     * 是否管理员
     */
    private Integer identity;
    /**
     * 备注
     */
    private String memo;
    /**
     * 是否有效
     */
    private Integer valid;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private Long createStaffId;
    /**
     * 修改时间
     */
    private Date updateTime;

    public SystemStaff() {

    }

    public SystemStaff(String userName, String passwordHash, String email, String name, Long departmentId, Long positionId, Integer accountState, Integer identity, String memo, Integer valid, Long createStaffId) {
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.email = email;
        this.name = name;
        this.departmentId = departmentId;
        this.positionId = positionId;
        this.accountState = accountState;
        this.identity = identity;
        this.memo = memo;
        this.valid = valid;
        this.createStaffId = createStaffId;
    }


}


