package com.ning.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
*   监听器的使用：
*       作用：监听作用域对象request,session,application的创建，销毁和内容的改变
*       使用：创建了一个实现了接口的java类
*       监听request--->ServletRequestListener 监听request对象的销毁和创建
*           requestDestroyed //销毁
*           requestInitialized  //创建
*           注意：形参可以获取监听的request对象
*       监听request--->ServletRequestAttributeListener 监听request作用域数据的变更
*           注意：形参可以获取被监听的数据
*
*       监听session--->HttpSessionListener 监听session的创建和销毁
*       在web.xml中配置监听器
*
*
* */
public class MyListener implements ServletRequestListener,ServletRequestAttributeListener,HttpSessionListener {
    //request对象销毁
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("我被销毁了");
    }
    //request对象创建
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("我被创建了");
    }
    //监听request作用域数据的添加
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("request中添加了一条数据-"+srae.getName()+":"+srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {

    }
    /*----------------------------------------------------------------------------------*/
    //监听session的创建
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session被创建了");
    }
    //监听session的销毁
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session被销毁了");
    }
}
