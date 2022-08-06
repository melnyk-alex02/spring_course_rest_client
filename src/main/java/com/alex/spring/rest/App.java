package com.alex.spring.rest;

import com.alex.spring.rest.Configuration.MyConfig;
import com.alex.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        Employee employee = communication.getEmployee(8);

        communication.deleteEmployee(10);

        System.out.println(employee);
    }
}
