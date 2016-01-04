package com.serious.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by zzz on 1/3/16.
 */
@Entity
public class Test {
    @Id
    @GeneratedValue
    @Getter
    private Long id;
//    @Getter
//    @Setter
//    private Long version;
    @Getter
    @Setter
    @ManyToOne
    private Project projectId;

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private String text;

    public Test(Project projectId, String name, String description, String text) {
        this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.text = text;
    }

}
