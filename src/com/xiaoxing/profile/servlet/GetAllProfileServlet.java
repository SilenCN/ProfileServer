package com.xiaoxing.profile.servlet;

import com.google.gson.Gson;
import com.xiaoxing.profile.server.ProfileManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by silen on 17-2-26.
 */
@WebServlet("/GetAllProfile")
public class GetAllProfileServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //   super.service(req, resp);
        resp.getWriter().write(new Gson().toJson(ProfileManager.getAllProfile(Integer.parseInt(req.getParameterValues("userId")[0]))));
    }
}
