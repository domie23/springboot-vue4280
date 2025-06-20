package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 专家用户：(ExpertUsers)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ExpertUsers")
public class ExpertUsers implements Serializable {

    // ExpertUsers编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expert_users_id")
    private Integer expert_users_id;

    // 专家姓名
    @Basic
    private String expert_name;
    // 专家性别
    @Basic
    private String expert_gender;
    // 专家年龄
    @Basic
    private String expert_age;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
