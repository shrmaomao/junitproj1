package com.mao;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class DBTestTest {
    @BeforeClass
    public static void setUpAll(){
        System.out.println("setUpAll 执行一次  ");
    }
    @AfterClass
    public  static void tearDownAll(){
        System.out.println("tearDownALL 执行了一次");
    }
/*
每个方法执行之前执行一次
 */
    @Before
    public void setUp() throws Exception {
        System.out.println("setUp 执行一次");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown 执行一次");
    }

    @Test
    public void query() {
        DBTest dbTest=new DBTest();
        List<String> query=dbTest.query();
        Assert.assertEquals("查询结果为空",null,query);
    }

    @Test
    public void update() {
        DBTest dbTest=new DBTest();
        int update=dbTest.update();
        Assert.assertEquals("更新失败",1,update);
    }
}