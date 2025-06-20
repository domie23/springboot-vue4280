package com.project.demo.controller;

import com.project.demo.entity.PsychologicalExperiment;
import com.project.demo.service.PsychologicalExperimentService;
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
 * 心理实验：(PsychologicalExperiment)表控制层
 *
 */
@RestController
@RequestMapping("/psychological_experiment")
public class PsychologicalExperimentController extends BaseController<PsychologicalExperiment, PsychologicalExperimentService> {

    /**
     * 心理实验对象
     */
    @Autowired
    public PsychologicalExperimentController(PsychologicalExperimentService service) {
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
