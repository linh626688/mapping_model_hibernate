package mapping;

import mapping.service.impl.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        StudentServiceImpl studentService = new StudentServiceImpl();
        System.out.println(studentService.findAll());
    }
}
