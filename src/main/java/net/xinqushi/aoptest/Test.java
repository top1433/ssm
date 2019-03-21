package net.xinqushi.aoptest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/spring-conf.xml");
        Girl girl = ctx.getBean(Girl.class);
        girl.sleep("haha");
        girl.dance("haha");
        Boy boy = ctx.getBean(Boy.class);
        boy.sleep("haha");
        boy.play("haha");
    }
}
