package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 报名管理：(RegistrationManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RegistrationManagement")
public class RegistrationManagement implements Serializable {

    // RegistrationManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registration_management_id")
    private Integer registration_management_id;

    // 实验名称
    @Basic
    private String experiment_name;
    // 实验类型
    @Basic
    private String experiment_type;
    // 发布用户
    @Basic
    private Integer publish_users;
    // 老师姓名
    @Basic
    private String teachers_name;
    // 报名用户
    @Basic
    private Integer registered_users;
    // 学生姓名
    @Basic
    private String student_name;
    // 报名日期
    @Basic
    private Timestamp registration_date;
    // 报名备注
    @Basic
    private String registration_notes;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
