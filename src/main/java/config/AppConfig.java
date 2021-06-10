package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer  {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("luong chay 1");
        return new Class[]{WebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("luong chay 2");
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("luong chay 3");
        return new String[]{"/"};
    }
}
