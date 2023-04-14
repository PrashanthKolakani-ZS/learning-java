package me.ujjawal.learning_java.testing;

import java.util.concurrent.atomic.AtomicInteger;

public class StudentDaoDemo {
    private AtomicInteger studentIdSequence;

    StudentDaoDemo() {
        studentIdSequence = new AtomicInteger();
    }

    UsingMockito.Student save(UsingMockito.Student student) {
        student.setId(studentIdSequence.incrementAndGet());
        System.out.println("Inside StudentDaoDemo");
        //insert into student(first_name, last_name) values('','');
        throw new UnsupportedOperationException();
    }

    UsingMockito.Student getById(Integer id) {
        throw new UnsupportedOperationException();
    }
}
