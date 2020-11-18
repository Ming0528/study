package com.study.java.lang.object;

import lombok.Data;

@Data
public class StudentDo {
    private Long id;
    private long count;
    private String name;

    public StudentDo() {
        this.count = 0;
        this.name = "hhh";
    }
}
