package com.project.demo.controller;

import com.project.demo.entity.ExpertInformation;
import com.project.demo.service.ExpertInformationService;
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
 * 专家信息：(ExpertInformation)表控制层
 *
 */
@RestController
@RequestMapping("/expert_information")
public class ExpertInformationController extends BaseController<ExpertInformation, ExpertInformationService> {

    /**
     * 专家信息对象
     */
    @Autowired
    public ExpertInformationController(ExpertInformationService service) {
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
