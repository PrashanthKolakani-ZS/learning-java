package me.ujjawal.learning_java.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StudentServiceDemo {

        private static Logger logger = LogManager.getLogger(UsingMockito.StudentService.class);

        private StudentDaoDemo studentDao;

        StudentServiceDemo(StudentDaoDemo studentDao) {
            this.studentDao = studentDao;
        }

        UsingMockito.Student createStudent(String firstName, String lastName) {
            if(null == firstName) {
                throw new IllegalArgumentException("firstName shouldn't be null");
            }
            UsingMockito.Student student = new UsingMockito.Student();
            student.setFirstName(firstName.trim());
            if(null != lastName) {
                student.setLastName(lastName.trim());
            }
            UsingMockito.Student result = studentDao.save(student);
            logger.debug("created " + result);
            return result;
        }

        UsingMockito.Student getStudent(Integer id) {
            UsingMockito.Student student = studentDao.getById(id);
            return student;
        }
}
