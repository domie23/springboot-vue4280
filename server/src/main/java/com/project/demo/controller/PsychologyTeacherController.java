package com.project.demo.controller;

import com.project.demo.entity.PsychologyTeacher;
import com.project.demo.service.PsychologyTeacherService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 心理老师：(PsychologyTeacher)表控制层
 *
 */
@RestController
@RequestMapping("/psychology_teacher")
public class PsychologyTeacherController extends BaseController<PsychologyTeacher, PsychologyTeacherService> {

    /**
     * 心理老师对象
     */
    @Autowired
    public PsychologyTeacherController(PsychologyTeacherService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
