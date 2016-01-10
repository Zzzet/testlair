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

    //todo обновлять только нужное поле
    public void updateProject(String name, Project updatedProject) {
        Project oldProj = getProjectByName(name);
        updatedProject.setId(oldProj.getId());

        if (updatedProject.getDescription() == null) updatedProject.setDescription(oldProj.getDescription());
        if (updatedProject.getName() == null) updatedProject.setName(oldProj.getName());

        saveProject(updatedProject);
    }

    public void updateTest(String projectName, String name, Test updatedTest) {
        Test oldTest = getTest(projectName, name);
        updatedTest.setId(oldTest.getId());

        if (updatedTest.getProjectId() == null) updatedTest.setProjectId(oldTest.getProjectId());
        if (updatedTest.getName() == null) updatedTest.setName(oldTest.getName());
        if (updatedTest.getDescription() == null) updatedTest.setDescription(oldTest.getDescription());
        if (updatedTest.getText() == null) updatedTest.setText(oldTest.getText());

        saveTest(updatedTest);
    }

    public Test getTest(String projectName, String testName) {
        return testRepo.findByNameAndProjectId(testName, getProjectByName(projectName));
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

    public List<Test> getTestsForProject(String projectName) {
        Project project = projectRepo.findByName(projectName);
        return testRepo.findByProjectId(project);
    }

    public void deleteProject(String projectName) {
        projectRepo.delete(getProjectByName(projectName));
    }

    public void deleteTest( String projectName, String name) {
        testRepo.delete(getTest(projectName, name));
    }
}
