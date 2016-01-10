package com.serious.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by zzz on 1/3/16.
 */
@Entity
@Data
public class Test {
    @Id
    @GeneratedValue
    private Long id;
    //    @Getter
//    @Setter
//    private Long version;
    //todo нужно ли хранить тут Project или достачно projectName или id?
    @ManyToOne
    private Project projectId;
    private String name;
    private String description;
    private String text;

    public Test(Project projectId, String name, String description, String text) {
        this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.text = text;
    }

    public Test() {
    }
}
