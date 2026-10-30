package com.vitthal.cafe;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet {
    private Map<String, Integer> menu = new LinkedHashMap<>();

    @Override
    public void init() {
        menu.put("Masala Chai", 40);
        menu.put("Cold Coffee", 120);
        menu.put("Veg Sandwich", 90);
        menu.put("Brownie", 110);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><head><title>Cafe Menu</title></head><body>");
        out.println("<h1>Today's Menu</h1>");
        out.println("<table border='1' cellpadding='6'>");
        out.println("<tr><th>Item</th><th>Price</th></tr>");
        for (Map.Entry<String, Integer> e : menu.entrySet()) {
            out.println("<tr><td>" + e.getKey() + "</td><td>Rs." + e.getValue() + "</td></tr>");
        }
        out.println("</table>");
        out.println("<p><a href='index.html'>Back</a></p>");
        out.println("</body></html>");
    }
}
