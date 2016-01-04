package com.serious.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zzz on 1/3/16.
 */
@Entity
public class Project {
    @Id
    @GeneratedValue
    @Getter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project() {
    }

}
