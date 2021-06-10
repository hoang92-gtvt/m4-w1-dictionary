package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("controller") // Scan đến thư mục controller

public class WebConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver haResolever(){
        InternalResourceViewResolver resolverChild = new InternalResourceViewResolver();
        resolverChild.setPrefix("/WEB/views");
        resolverChild.setSuffix(".jsp");
        return resolverChild;

    }

}
