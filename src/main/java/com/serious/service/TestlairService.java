package com.serious.service;

import com.serious.entity.Project;
import com.serious.entity.Test;
import com.serious.repository.ProjectRepo;
import com.serious.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zzz on 1/3/16.
 */

@Service
public class TestlairService {
    @Autowired
    public ProjectRepo projectRepo;
    @Autowired
    public TestRepo testRepo;

    public void saveTest(Test test) {
        testRepo.save(test);
    }

    public void saveProject(Project proj) {
        projectRepo.save(proj);
    }

    public Test getTest(Long testId, Long projectId) {
       return testRepo.findByIdAndProjectId(testId, projectId);
    }

    public List<Test> getTestsForProject(String projectName) {
        Project project = projectRepo.findByName(projectName);
        return testRepo.findByProjectId(project);
    }

    public Project getProject(Long projectId) {
        return projectRepo.findOne(projectId);
    }

    public Project getProjectByName(String name) {
        return projectRepo.findByName(name);
    }

    public Iterable<Project> getProjects() {
        return projectRepo.findAll();
    }




}
