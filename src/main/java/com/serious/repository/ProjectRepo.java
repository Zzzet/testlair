package com.serious.repository;

import com.serious.entity.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zzz on 1/3/16.
 */
public interface ProjectRepo extends CrudRepository<Project, Long> {
}
