package cn.edu.hit.l;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Method","POST,GET");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("admin")&&password.equals("123")){
            out.print("{\"code\":666,\"msg\":\"ok\"}");
        }
        else{
            out.print("{\"code\":888,\"msg\":\"用户名或密码错误\"}");
        }
    }

}

