package com.serious.controller.view;

import com.serious.service.TestlairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Arthur on 1/3/16.
 */
@Controller
@EnableAutoConfiguration
public class ProjectController {
    @Autowired
    TestlairService testlairService;

    @RequestMapping("/projectsList")
    String getProjects() {
        return "projects";
    }



}
