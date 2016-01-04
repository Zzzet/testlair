package com.serious.controller;

import com.serious.entity.Project;
import com.serious.service.TestlairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zzz on 1/3/16.
 */
@RestController
@EnableAutoConfiguration
public class ProjectController {
    @Autowired
    TestlairService testlairService;

    @RequestMapping("/projects")
    Iterable<Project> getProjects() {
        return testlairService.getProjects();
    }


    @RequestMapping(value = "/projects/{projectName}", method = RequestMethod.GET)
    String getProject(@PathVariable String projectName) {
        return "get project " + projectName;
    }

    @RequestMapping(value = "/projects/{projectName}", method = RequestMethod.POST)
    String createProject(@PathVariable String projectName) {
        return "create project " + projectName;
    }

    @RequestMapping(value = "/projects/{projectName}", method = RequestMethod.PUT)
    String updateProject(@PathVariable String projectName) {
        return "update project " + projectName;
    }

    @RequestMapping(value = "/projects/{projectName}", method = RequestMethod.DELETE)
    String deleteProject(@PathVariable String projectName) {
        return "delete project " + projectName;
    }


}
