package com.ning.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求信息
        //处理请求信息
        request.setAttribute("str","监听器的认识");
        HttpSession hs = request.getSession();
        hs.invalidate();
        //相应处理结果
        response.getWriter().write("this is my listener");
    }
}
