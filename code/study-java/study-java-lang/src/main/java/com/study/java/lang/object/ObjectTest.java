package com.study.java.lang.object;

import org.junit.Test;

public class ObjectTest {
    @Test
    public void testStudentDo() {
        StudentDo studentDo = new StudentDo();
        studentDo.setId(1L);
        studentDo.setCount(0L);
        studentDo.setName("aaa");
        StudentDo studentDo1 = new StudentDo();
//        studentDo.setId(studentDo.getName(). + studentDo1.getId());
        studentDo1.setCount(studentDo.getCount() + studentDo1.getCount());
        StudentDo studentDo2 = new StudentDo();

        System.out.println("studentdo is:" +  studentDo);
    }
}
