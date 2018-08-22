package com.forezp.serviceribbon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ServiceRibbonApplicationTests {

    int c;

    public ServiceRibbonApplicationTests(){
        Student s =  new Student(1,200);
    }

    public void contextLoads() {

    }
    @Test
    public void main() {
        ServiceRibbonApplicationTests s =  new ServiceRibbonApplicationTests();
        System.out.println(c);
    }

    class Student{
        int a;
        int b;
        public Student(int a,int b){
            this.a=a;
            this.b=b;
            c = a*b;
        }
    }
}
