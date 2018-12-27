package com.caochengyin;

import com.caochengyin.model.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.runtime.StatelessKnowledgeSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2018/12/27
 * @description Drools测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config-test.xml")
public class DroolsTest {

    @Resource(name = "simpleRuleKSession")
    private StatelessKnowledgeSession session;

    @Test
    public void t1(){
        System.out.println("测试可行");
    }


    @Test
    public void t2(){
        Person p1 = new Person("白展堂", 68);
        Person p2 = new Person("李大嘴", 32);
        Person p3 = new Person("佟湘玉", 18);
        Person p4 = new Person("郭芙蓉", 8);
        Person p5 = new Person("祝无双", 66);

        System.out.println("before p1 : " + p1);
        System.out.println("before p2 : " + p2);
        System.out.println("before p3 : " + p3);
        System.out.println("before p4 : " + p4);
        System.out.println("before p5 : " + p5);
        session.execute(p1);
        session.execute(p2);
        session.execute(p3);
        session.execute(p4);
        session.execute(p5);

        System.out.println("after p1 : " + p1);
        System.out.println("after p2 : " + p2);
        System.out.println("after p3 : " + p3);
        System.out.println("after p4 : " + p4);
        System.out.println("after p4 : " + p5);
    }

    private KieSession getSession(){
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        return kieClasspathContainer.newKieSession("simpleRuleKSession");
    }


}
