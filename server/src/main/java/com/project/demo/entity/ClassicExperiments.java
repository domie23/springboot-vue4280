package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 经典实验：(ClassicExperiments)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ClassicExperiments")
public class ClassicExperiments implements Serializable {

    // ClassicExperiments编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classic_experiments_id")
    private Integer classic_experiments_id;

    // 实验名称
    @Basic
    private String experiment_name;
    // 实验类型
    @Basic
    private String experiment_type;
    // 封面图片
    @Basic
    private String cover_photo;
    // 实验视频
    @Basic
    private String experimental_video;
    // 发布日期
    @Basic
    private Timestamp release_date;
    // 备注详情
    @Basic
    private String notes_details;

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
