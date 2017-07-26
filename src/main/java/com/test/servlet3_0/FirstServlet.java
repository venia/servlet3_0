package com.test.servlet3_0;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(description = "My First Servlet", urlPatterns = { "/FirstServlet" , "/FirstServlet.do"}, initParams = {@WebInitParam(name="id",value="1"),@WebInitParam(name="name",value="pankaj")})
public class FirstServlet extends HttpServlet {
    private static Logger log = Logger.getLogger(MyServlet.class.getName());
    private static final long serialVersionUID = 1L;
    public static final String HTML_START="<html><body>";
    public static final String HTML_END="</body></html>";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        log.info("Registered: [FirstServlet]");
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("==================[ServletConfig]===================");
        if (this.getServletConfig() == null) {
            System.out.println("NULL = YES");
        } else {
            System.out.println("NULL = NO");
        }
        System.out.println("==================[ServletConfig]===================");
        Enumeration names = this.getServletConfig().getInitParameterNames();
        while (names.hasMoreElements()) {
            String name = (String)names.nextElement();
            System.out.println("=====================================");
            System.out.println("Name init param:" + name);
            System.out.println("=====================================");
        }
        String id = this.getServletConfig().getInitParameter("id");
        String name = this.getServletConfig().getInitParameter("name");
        log.info(String.format("Init param ID: %s", id));
        log.info(String.format("Init param NAME: %s", name));
    }



    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Date date = new Date();
        out.println(HTML_START + "<h2>Hi There!</h2><br/><h3>Date="+date +"</h3>"+HTML_END);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}