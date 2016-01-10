package com.serious.controller.rest;

import com.serious.entity.Project;
import com.serious.entity.Test;
import com.serious.service.TestlairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zzz on 1/3/16.
 */
@RestController
@EnableAutoConfiguration
public class ProjectRestController {
    @Autowired
    TestlairService testlairService;

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    Iterable<Project> getProjects() {
        return testlairService.getProjects();
    }

    @RequestMapping(value = "/projects", method = RequestMethod.POST)
    ResponseEntity<Project> createProject(@RequestBody Project project) {
        testlairService.saveProject(project);
        return new ResponseEntity<Project>(project, HttpStatus.OK);
    }

    @RequestMapping(value = "/projects/{projectName}", method = RequestMethod.GET)
    Project getProject(@PathVariable String projectName) {
        return testlairService.getProjectByName(projectName);
    }

    @RequestMapping(value = "/projects/{projectName}", method = RequestMethod.PUT)
    ResponseEntity<Project> updateProject(@PathVariable String projectName, @RequestBody Project project) {
        testlairService.updateProject(projectName, project);
        return new ResponseEntity<Project>(project, HttpStatus.OK);
    }

    @RequestMapping(value = "/projects/{projectName}", method = RequestMethod.DELETE)
    ResponseEntity deleteProject(@PathVariable String projectName) {
        testlairService.deleteProject(projectName);
        return new ResponseEntity(HttpStatus.OK);
    }
}
