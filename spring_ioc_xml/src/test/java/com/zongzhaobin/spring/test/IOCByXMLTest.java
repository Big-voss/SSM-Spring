package com.zongzhaobin.spring.test;

import com.zongzhaobin.spring.pojo.Clazz;
import com.zongzhaobin.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0914 16:04
 */
public class IOCByXMLTest {
    @Test
    public void testIOC(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentOne = (Student) ioc.getBean("studentOne");
        System.out.println(studentOne);
    }

    @Test
    public void testDiBySet(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentTwo = ioc.getBean("studentTwo", Student.class);
        System.out.println(studentTwo);
    }

    @Test
    public void testDiByConstructor(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentThree = ioc.getBean("studentThree", Student.class);
        System.out.println(studentThree);
    }

    @Test
    public void testDiByExceptional(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentFor = ioc.getBean("studentFor", Student.class);
        System.out.println(studentFor);
    }

    @Test
    public void testDiByClazz(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentFive = ioc.getBean("studentFive", Student.class);
        System.out.println(studentFive);
    }

    @Test
    public void testDiByClazzInner(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentSix = ioc.getBean("studentSix", Student.class);
        System.out.println(studentSix);
    }

    @Test
    public void testDiByClazzInnerArry(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentSeven = ioc.getBean("studentSeven", Student.class);
        System.out.println(studentSeven);
    }

    @Test
    public void testDiByClazzInnerList(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz clazz = ioc.getBean("clazzInnerList", Clazz.class);
        System.out.println(clazz);
    }

    @Test
    public void testDiByClazzUtilList(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz clazz = ioc.getBean("clazzUtilList", Clazz.class);
        System.out.println(clazz);
    }

    @Test
    public void testDiByMap(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentEight = ioc.getBean("studentEight", Student.class);
        System.out.println(studentEight);
    }

    @Test
    public void testDiByUtilMap(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentNine = ioc.getBean("studentNine", Student.class);
        System.out.println(studentNine);
    }

}
