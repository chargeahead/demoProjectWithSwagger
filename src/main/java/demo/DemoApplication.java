package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration

@Import(SwaggerConfig.class)
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class DemoApplication {
  //Main
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
