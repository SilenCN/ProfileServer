package com.xiaoxing.profile.servlet;

import com.google.gson.Gson;
import com.xiaoxing.profile.model.Profile;
import com.xiaoxing.profile.server.ProfileManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * Created by silen on 17-2-26.
 */
@WebServlet("/ModifyProfile")
public class ModifyProfileServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  super.service(req, resp);
        String message = URLDecoder.decode(req.getParameterValues("message")[0].intern(), "UTF-8");
        Profile profile = new Gson().fromJson(message, Profile.class);
        resp.getWriter().print(ProfileManager.modifyProfile(profile));
    }

}
