package com.test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = {"/test/*"})
public class TestServlet extends HttpServlet {

}
