package ua.dmytrokashchenko.lesson6.t4.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ua.dmytrokashchenko.lesson6.t4.domain.Student;
import ua.dmytrokashchenko.lesson6.t4.repository.StudentRepository;

import static org.junit.Assert.*;

public class StudentServiceImplTest {
//    private
//    private StudentServiceImpl studentService = new StudentServiceImpl();

//    @RunWith(MockitoJUnitRunner.class)
//    public class StudentServiceImplTest {
//
//    }



    private StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
    private StudentServiceImpl studentService = new StudentServiceImpl(studentRepository);

    @After
    public void resetMock() {

    }
    @Ignore
    @Test
    public void test1() {
//        Student student = Student.builder().withId(1L).build();
//        Student student1 = studentService.register(student);
////        Mockito.when(studentRepository.save(any(Student.class))).thenReturn(student);  ???
//        Assert.assertNotNull(student1);
    }

}