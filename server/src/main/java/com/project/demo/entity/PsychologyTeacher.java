package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 心理老师：(PsychologyTeacher)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PsychologyTeacher")
public class PsychologyTeacher implements Serializable {

    // PsychologyTeacher编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psychology_teacher_id")
    private Integer psychology_teacher_id;

    // 老师姓名
    @Basic
    private String teachers_name;
    // 老师性别
    @Basic
    private String teacher_gender;
    // 老师教龄
    @Basic
    private String teachers_teaching_experience;












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
