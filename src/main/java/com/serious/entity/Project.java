package com.serious.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zzz on 1/3/16.
 */
@Data
@Entity
public class Project {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique=true)
    private String name;

    private String description;

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project() {
    }

}
