package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 专家信息：(ExpertInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ExpertInformation")
public class ExpertInformation implements Serializable {

    // ExpertInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expert_information_id")
    private Integer expert_information_id;

    // 专家用户
    @Basic
    private Integer expert_users;
    // 专家姓名
    @Basic
    private String expert_name;
    // 专家性别
    @Basic
    private String expert_gender;
    // 专家年龄
    @Basic
    private String expert_age;
    // 封面头像
    @Basic
    private String cover_avatar;
    // 擅长领域
    @Basic
    private String areas_of_expertise;
    // 专家简介
    @Basic
    private String expert_introduction;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
