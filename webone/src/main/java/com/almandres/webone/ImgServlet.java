package com.almandres.webone;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ImgServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/jpeg");
        InputStream in = getServletContext().getResourceAsStream("/images/cat.png");
        OutputStream out = response.getOutputStream();

        byte[] buffer = new byte[1024];
        int count;
        while ((count = in.read(buffer)) >= 0) {
            out.write(buffer, 0, count);
        }
        in.close();
        out.close();
    }
}