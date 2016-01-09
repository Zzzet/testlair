package com.serious.controller.rest;

import com.serious.entity.Test;
import com.serious.service.TestlairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zzz on 1/3/16.
 */
@RestController
@EnableAutoConfiguration
public class TestRestController {
    @Autowired
    TestlairService testlairService;

    @RequestMapping(value = "/projects/{projectName}/tests", method = RequestMethod.GET)
    List<Test> getTests(@PathVariable String projectName) {
       return testlairService.getTestsForProject(projectName);
    }

    @RequestMapping(value = "/projects/{projectName}/tests/{testName}", method = RequestMethod.GET)
    Test getTest(@PathVariable String projectName, @PathVariable String testName) {
        return testlairService.getTest(projectName, testName);
     }

    @RequestMapping(value = "/projects/{projectName}/tests/{testName}", method = RequestMethod.POST)
    String createTest(@PathVariable String projectName, @PathVariable String testName) {
        return "create test " + testName + "for project " + projectName;
    }

    @RequestMapping(value = "/projects/{projectName}/tests/{testName}", method = RequestMethod.PUT)
    String updateTest(@PathVariable String projectName, @PathVariable String testName) {
        return "update test " + testName + "for project " + projectName;
    }

    @RequestMapping(value = "/projects/{projectName}/tests/{testName}", method = RequestMethod.DELETE)
    String deleteTest(@PathVariable String projectName, @PathVariable String testName) {
        return "delete test " + testName + "for project " + projectName;
    }
}
