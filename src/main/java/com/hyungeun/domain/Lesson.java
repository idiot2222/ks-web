package com.hyungeun.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int quota;
    private int stock; // 재고 필드

    @OneToMany(mappedBy = "lesson")
    private List<Course> courses = new ArrayList<>();

    public Lesson() {
    }

    @Builder
    public Lesson(String name, int quota) {
        this.name = name;
        this.quota = quota;
    }


    public int getStock() { // 재고값 갱신
        stock = quota - courses.size();
        return stock;
    }
}
