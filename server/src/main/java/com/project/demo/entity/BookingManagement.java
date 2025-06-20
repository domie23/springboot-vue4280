package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 预约管理：(BookingManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "BookingManagement")
public class BookingManagement implements Serializable {

    // BookingManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_management_id")
    private Integer booking_management_id;

    // 专家用户
    @Basic
    private Integer expert_users;
    // 专家姓名
    @Basic
    private String expert_name;
    // 预约用户
    @Basic
    private Integer appointment_users;
    // 学生姓名
    @Basic
    private String student_name;
    // 预约时间
    @Basic
    private Timestamp time_of_appointment;
    // 预约备注
    @Basic
    private String appointment_notes;



    // 审核状态
    @Basic
    private String examine_state;











    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
