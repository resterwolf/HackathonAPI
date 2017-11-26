package com.hackathon.api.HttpServlets;

import com.hackathon.api.model.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ChangeRating extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/xml;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        String email = req.getParameter("email");
        String rating = req.getParameter("new_rating");
        double doubleRating;

        // not parameter email
        if (email == null || email.isEmpty()) {
            writer.write(XmlBuilder.makeErrorXmlString(Errors.EmailIParamsNotExist));
            writer.flush();
            return;
        }

        // not parameter Password
        if (rating == null || rating.isEmpty()) {
            writer.write(XmlBuilder.makeErrorXmlString(Errors.RatingParamIsNotExist));
            writer.flush();
            return;
        }

        // rating cant parsed
        try {

            doubleRating = Float.parseFloat(rating);

        } catch (NumberFormatException ex) {
            writer.write(XmlBuilder.makeErrorXmlString(Errors.RatingParseFailed));
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

        user.addRating(doubleRating);

        writer.write(XmlBuilder.makeUserProfileXmlString(user));
        writer.flush();



    }
}
