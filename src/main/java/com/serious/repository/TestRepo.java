package com.serious.repository;

import com.serious.entity.Project;
import com.serious.entity.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by zzz on 1/3/16.
 */
public interface TestRepo extends CrudRepository<Test, Long> {
    Test findByIdAndProjectId(Test test, Project project);
    Test findByNameAndProjectId(String name, Project project);

    List<Test> findByProjectId(Project project);
    void deleteByNameAndProjectId(String name, Project project);
}
