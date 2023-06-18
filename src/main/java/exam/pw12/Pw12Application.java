package exam.pw12;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class Pw12Application implements CommandLineRunner {

    private static FileHasherService fileHasherService;

    public Pw12Application(
            FileHasherService fileHasherService
    ) {
        Pw12Application.fileHasherService = fileHasherService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Pw12Application.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            fileHasherService.run(args);

            fileHasherService.hashFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
