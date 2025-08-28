package com.example.demo.bt.ungdungquanlysanpham.controller;

import com.example.demo.bt.ungdungquanlysanpham.model.Product;
import com.example.demo.bt.ungdungquanlysanpham.service.ProductServiceImpl;
import com.example.demo.bt.ungdungquanlysanpham.service.ProuctService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServervlet", value = "/ungdungquanlysanpham/product")
public class ProductServervlet extends HttpServlet {

    private ProuctService prouctService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(req, resp);
                break;
            case "edit":
                showUpdate(req, resp);
                break;
            case "delete":
                showDelete(req, resp);
                break;
            case "detail":
                showDetail(req, resp);
                break;
            default:
                showHome(req, resp);
                break;
        }
    }

    private void showDelete(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = (Product) prouctService.findById(id);
        req.setAttribute("product", product);

        try {
            req.getRequestDispatcher("/ungdungquanlysanpham/delete.jsp").forward(req, resp);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    private void showDetail(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = (Product) prouctService.findById(id);
        req.setAttribute("product", product);
        try {
            req.getRequestDispatcher("/ungdungquanlysanpham/detail.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void showUpdate(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = (Product) prouctService.findById(id);
        req.setAttribute("product", product);
        try {
            req.getRequestDispatcher("/ungdungquanlysanpham/edit.jsp").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/ungdungquanlysanpham/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showHome(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("products", prouctService.findAll());
        try {
            request.getRequestDispatcher("/ungdungquanlysanpham/home.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(req, resp);
                break;
            case "edit":
                update(req, resp);
                break;
            case "delete":
                delete(req, resp);
                break;
            case "search":
                search(req, resp);
                break;
            default:
                break;
        }
    }

    private void search(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("SearchName");
        List<Product> products = prouctService.searchByName(name);
        req.setAttribute("products", prouctService.searchByName(name));
        try {
            req.getRequestDispatcher("/ungdungquanlysanpham/home.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        prouctService.remove(id);
        try {
            resp.sendRedirect("/ungdungquanlysanpham/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        Double price = Double.valueOf(req.getParameter("price"));
        String description = req.getParameter("description");
        String producer = req.getParameter("manufacturer");
        Product product = Product.builder().name(name).price(price).description(description).manufacturer(producer).build();
        prouctService.update(id, product);
        try {
            resp.sendRedirect("/ungdungquanlysanpham/product");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void create(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        Double price = Double.valueOf(req.getParameter("price"));
        String description = req.getParameter("description");
        String producer = req.getParameter("manufacturer");
        Product product = Product.builder().name(name).price(price).description(description).manufacturer(producer).build();
        prouctService.save(product);
        try {
            resp.sendRedirect("/ungdungquanlysanpham/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}