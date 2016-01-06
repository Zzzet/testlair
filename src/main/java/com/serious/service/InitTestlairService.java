package com.serious.service;

import com.serious.entity.Project;
import com.serious.entity.Test;
import com.serious.repository.ProjectRepo;
import com.serious.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by zzz on 1/4/16.
 */
@Service
public class InitTestlairService {
    @Autowired
    public ProjectRepo projectRepo;
    @Autowired
    public TestRepo testRepo;

    @PostConstruct
    public void init() {
        Project proj = new Project("SERIOUS", "very very serious project");
        Test test = new Test (proj, "Very serious functionality", "blah blah", "serious steps");
        projectRepo.save(proj);
        testRepo.save(test);

        proj = new Project("IMPORTANT", "Hi");
        test = new Test (proj, "Very important functionality", "blah blah", "important steps");
        projectRepo.save(proj);
        testRepo.save(test);

    }
}
