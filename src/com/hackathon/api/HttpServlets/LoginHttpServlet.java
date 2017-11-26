package com.hackathon.api.HttpServlets;

import com.hackathon.api.model.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class LoginHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/xml;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // not parameter email
        if (email == null || email.isEmpty()) {
            writer.write(XmlBuilder.makeErrorXmlString(Errors.EmailIParamsNotExist));
            writer.flush();
            return;
        }

        // not parameter password
        if (password == null || password.isEmpty()) {
            writer.write(XmlBuilder.makeErrorXmlString(Errors.PasswordParamIsNotExist));
            writer.flush();
            return;
        }

        UserList users = UsersHolder.getUsers();
        User user = users.getUserByEmail(email);

        // user not found
        if (user == null) {
            writer.write(XmlBuilder.makeErrorXmlString(Errors.UserIsNotFound));
            writer.flush();
            return;
        }

        // if password is not match
        if (!user.getPassword().equals(password)) {
            writer.write(XmlBuilder.makeErrorXmlString(Errors.PasswordIsIncorrect));
            writer.flush();
            return;
        }


        writer.write(XmlBuilder.makeUserProfileXmlString(user));
        writer.flush();

    }

}
