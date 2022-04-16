package com.pisceslatte.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.AfterTestClass;

public class Test1 {

    @BeforeEach
    public void prepareData(){
        System.out.println("prepare some data..");
    }

    @Test
    public void doTestA() {
        System.out.println("do TestA");
    }

    @Test
    public void doTestB() {
        System.out.println("do TestB");
    }

    @AfterEach
    public void recordData(){
        System.out.println("record test result data..");
    }
}
