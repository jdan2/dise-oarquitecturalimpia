package multimodul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.example.recursos"})
@EntityScan("com.example.recursos.service")
public class ModularApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModularApplication.class, args);
    }
}
