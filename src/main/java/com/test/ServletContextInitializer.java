package com.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextInitializer implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        throw new RuntimeException("Failed initialization");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
