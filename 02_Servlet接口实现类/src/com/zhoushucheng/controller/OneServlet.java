package com.zhoushucheng.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
    抽象类的作用:
        降低接口实现类对接口实现过程难度，
        将接口中不需要使用的抽象方法交给抽象类进行完成，
        这样接口实现类只需要对接口中它所需要的方法进行重写。
    Servlet接口：共有5个抽象方法
        init
        getServletConfig
        getServletInfo
        destory----------这四个方法对于Servlet接口实现类没用

        service()----有用

              extends                     extends                        implements
    OneServlet------>(abstract)HttpServlet------>(abstract)GennericServlet----->Servlet接口

    Tomcat根据Servlet规范调用Servlet接口实现类规则：
        1.Tomcat有权创建Servlet接口实现类实例对象
            Servlet oneServlet = new oneServlet();
        2.Tomcat根据实例对象调用Service()方法处理当前请求
            oneServlet.service();

    通过父类决定在何种情况下调用子类中的方法----【设计模式】----模板设计模式
    如：
        HttpServlet:
            doGet()   doPost()
            service () {
                if (请求方式 == GET) {
                    this.doGet();
                } else if (请求方式 == POST) {
                    this.doPost();
                }
            }

        OneServlet: doGet()   doPost()

        Tomcat: Servlet oneServlet = new oneServlet();
                oneServlet.service;
*/
public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet类针对浏览器发送GET请求方式处理");
        System.out.println("doGet,doGet,doGet!!!!!");
        System.out.println("test, test, test, test, version, test!");
        System.out.println("hello git4!");
        System.out.println("master test!");
        System.out.println("hot-fix test!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet类针对浏览器发送POST请求方式处理");
        System.out.println("Pull test!!!");
    }
}
