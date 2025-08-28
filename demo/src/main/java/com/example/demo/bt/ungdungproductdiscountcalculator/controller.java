package com.example.demo.bt.ungdungproductdiscountcalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "productDiscountCalculator", value = "/ungdungproductdiscountcalculator/discount")
public class controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/bt/ungdungproductdiscountcalculator/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("rate");
        float price = Float.parseFloat(req.getParameter("price"));
        float discount = Float.parseFloat(req.getParameter("discount"));

        float discountAmount = price * discount * 0.01f;

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Discount Amount: " + discount + "</h1>");
        writer.println("<h1>Discount Price: " + discountAmount + "</h1>");
        writer.println("</html>");
    }
}
