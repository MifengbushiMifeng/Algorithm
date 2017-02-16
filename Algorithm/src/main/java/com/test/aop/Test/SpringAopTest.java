package com.test.aop.Test;

import com.test.aop.PersonServer;
import com.test.serializable.Person;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by zhourh on 2/13/2017.
 */
public class SpringAopTest {

    @Test
    public void inteceptorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanAop.xml");
        PersonServer bean = (PersonServer) context.getBean("personServiceBean");
        bean.save("Jonathan TESTer");
    }

}
