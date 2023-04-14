package me.ujjawal.learning_java.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceDemoTest {

    @Mock
    StudentDaoDemo studentDaoDemo;

    @Test
    void createStudent() {
        UsingMockito.Student student = new UsingMockito.Student();
        student.setId(1);
        student.setFirstName("Prashanth");
        student.setLastName("Kolakani");
        Mockito.when(studentDaoDemo.save(Mockito.any(UsingMockito.Student.class))).thenReturn(student);
        StudentServiceDemo studentServiceDemo = new StudentServiceDemo(studentDaoDemo);
        UsingMockito.Student result = studentServiceDemo.createStudent("Prashanth", "Kolakani");
        assertEquals(1, result.getId());
        assertEquals("Prashanth", result.getFirstName());
        assertEquals("Kolakani", result.getLastName());

    }

    @Test
    void createStudentInvalidFirstName() {
        UsingMockito.Student student = new UsingMockito.Student();
        student.setId(1);
        student.setFirstName("Prashanth");
        student.setLastName("Kolakani");
        StudentServiceDemo studentServiceDemo = new StudentServiceDemo(studentDaoDemo);
        assertThrows(IllegalArgumentException.class, ()->studentServiceDemo.createStudent(null, "Kolakani"));

    }

    @Test
    void getStudent() {
    }
}
