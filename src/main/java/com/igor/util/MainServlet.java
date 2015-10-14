package com.igor.util;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by Igor Holyak
 * Date: 14.10.15
 */
public class MainServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        File file = new File(getServletContext().getRealPath("") + File.separator + "upload");
        System.out.println(file.list());
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<head>");
        printWriter.print("<title>My folder upload</title>");
        printWriter.print("<body>");
        printWriter.print(file.list());
        printWriter.print("</body>");
        printWriter.print("</head>");
        printWriter.print("</html>");
    }
}
