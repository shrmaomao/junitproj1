package com.mao;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClaculateTest {

    @Test
    public void add() {
        Claculate claculate=new Claculate();
        int add=claculate.add(2,3);
        //使用断言机制,用来返回方法的结果是否符合预期
        Assert.assertEquals("加法有问题",5,add);
    }

    @Test
    public void substract() {
        Claculate claculate=new Claculate();
        int substract=claculate.substract(3,1);
        //使用断言机制,用来返回方法的结果是否符合预期

        Assert.assertEquals("减法有问题", 2, substract);
    }

    @Test
    public void mulyiply() {
        Claculate claculate=new Claculate();
        int mulyiply=claculate.mulyiply(2,3);
        //使用断言机制,用来返回方法的结果是否符合预期
        Assert.assertEquals("乘法有问题",5,mulyiply);

    }
    @Test
    public void divide() {
        Claculate claculate=new Claculate();
        int divide=claculate.divide(2,3);
        //使用断言机制,用来返回方法的结果是否符合预期
        Assert.assertEquals("除法有问题",1,divide);
    }
}