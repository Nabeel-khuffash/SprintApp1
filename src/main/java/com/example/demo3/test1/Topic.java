package com.example.demo3.test1;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String descreption;

    public Topic(String t1, String t2, String t3) {
        id=t1;
        name=t2;
        descreption=t3;
    }
}
