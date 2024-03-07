package com.xworkz.technologymanagementsystem.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class TechnologyWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Invoking get root config class method");
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Invoking getServletConfigClasses method");
        return new Class[]{TechnologyConfiguration.class};
    }

    protected String[] getServletMappings() {
        System.out.println("Invoking getServletMappings method");
        return new String[]{"/"};
    }
}
