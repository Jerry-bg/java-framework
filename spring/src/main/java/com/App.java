package com;

import com.kons.beans.User;
import com.kons.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml");

        UserService userService=(UserService)context.getBean("userService");
        User user=userService.obtainUserById(1);

        System.out.println(user.getPerson_name());
    }

}
