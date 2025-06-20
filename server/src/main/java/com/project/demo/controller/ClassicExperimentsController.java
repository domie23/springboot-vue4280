package com.project.demo.controller;

import com.project.demo.entity.ClassicExperiments;
import com.project.demo.service.ClassicExperimentsService;
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
 * 经典实验：(ClassicExperiments)表控制层
 *
 */
@RestController
@RequestMapping("/classic_experiments")
public class ClassicExperimentsController extends BaseController<ClassicExperiments, ClassicExperimentsService> {

    /**
     * 经典实验对象
     */
    @Autowired
    public ClassicExperimentsController(ClassicExperimentsService service) {
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
