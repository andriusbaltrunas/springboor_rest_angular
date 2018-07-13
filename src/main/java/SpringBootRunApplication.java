import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.spring.boot.example")
@EntityScan(basePackages = "com.spring.boot.example")
@EnableJpaRepositories(basePackages = "com.spring.boot.example")
public class SpringBootRunApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootRunApplication.class);
    }
}
