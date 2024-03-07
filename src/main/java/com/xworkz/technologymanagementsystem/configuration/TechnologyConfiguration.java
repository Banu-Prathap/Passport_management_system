package com.xworkz.technologymanagementsystem.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.technologymanagementsystem")
public class TechnologyConfiguration {
    public TechnologyConfiguration(){
        System.out.println("Constructor of TechnologyConfiguaration is invoked");
    }
    @Bean
    public ViewResolver getViewResolver(){

        return new InternalResourceViewResolver("/",".jsp");
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean bean= new LocalContainerEntityManagerFactoryBean();
        bean.setPersistenceUnitName("com.xworkz");
        return bean;
    }
}
