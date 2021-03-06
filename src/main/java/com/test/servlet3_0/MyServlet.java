package com.test.servlet3_0;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * Created by venya on 24.07.17.
 */
@WebServlet("/s")
public class MyServlet extends HttpServlet {
    private static Logger log = Logger.getLogger(MyServlet.class.getName());
    public MyServlet() {
        super();
        log.info("Registered: [MyServlet]");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("Hello Word");
    }
}