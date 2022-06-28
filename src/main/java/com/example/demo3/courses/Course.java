package com.example.demo3.courses;

import com.example.demo3.topics.Topic;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String descreption;

    @ManyToOne
    private Topic topic;

    public Course(String t1, String t2, String t3, String t4) {
        id=t1;
        name=t2;
        descreption=t3;
        topic=new Topic(t4,"","");
    }
}
