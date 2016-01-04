package com.serious.repository;

import com.serious.entity.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by zzz on 1/3/16.
 */
public interface TestRepo extends CrudRepository<Test, Long> {
    Test findByIdAndProjectId(Long id, Long projectId);

    List<Test> findByProjectId(Long projectId);
}
