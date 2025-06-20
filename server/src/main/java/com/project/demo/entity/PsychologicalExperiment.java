package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 心理实验：(PsychologicalExperiment)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PsychologicalExperiment")
public class PsychologicalExperiment implements Serializable {

    // PsychologicalExperiment编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psychological_experiment_id")
    private Integer psychological_experiment_id;

    // 实验名称
    @Basic
    private String experiment_name;
    // 实验类型
    @Basic
    private String experiment_type;
    // 封面图片
    @Basic
    private String cover_photo;
    // 发布用户
    @Basic
    private Integer publish_users;
    // 老师姓名
    @Basic
    private String teachers_name;
    // 发布日期
    @Basic
    private Timestamp release_date;
    // 实验详情
    @Basic
    private String experimental_details;

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
