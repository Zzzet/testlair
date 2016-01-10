package com.serious.controller.rest;

import com.serious.entity.Test;
import com.serious.service.TestlairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/projects/{projectName}/tests", method = RequestMethod.POST)
    ResponseEntity<Test> createTest(@PathVariable String projectName, @RequestBody Test test) {
        testlairService.saveTest(test);
        return new ResponseEntity<Test>(test, HttpStatus.OK);
    }

    @RequestMapping(value = "/projects/{projectName}/tests/{testName}", method = RequestMethod.PUT)
    ResponseEntity<Test> updateTest(@PathVariable String projectName, @PathVariable String testName, @RequestBody Test test) {
        testlairService.updateTest(projectName, testName, test);
        return new ResponseEntity<Test>(test, HttpStatus.OK);
    }

    @RequestMapping(value = "/projects/{projectName}/tests/{testName}", method = RequestMethod.DELETE)
    ResponseEntity deleteTest(@PathVariable String projectName, @PathVariable String testName) {
        testlairService.deleteTest(projectName, testName);
        return new ResponseEntity(HttpStatus.OK);
    }
}
