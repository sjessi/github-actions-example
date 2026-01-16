package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Start {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot and CICD!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
}

//echo "# github-actions-example" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/sjessi/github-actions-example.git
//git push -u origin main