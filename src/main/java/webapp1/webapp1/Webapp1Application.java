package webapp1.webapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = {"controller"})
public class Webapp1Application {

	public static void main(String[] args) {

		try
		{
			//SpringApplication app = new SpringApplication(Webapp1Application.class);
			//app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
			//app.run(args);
			SpringApplication.run(Webapp1Application.class);
			System.out.println("testing");
		}
		catch(Exception exc)
		{
			System.out.println(exc.getMessage());
			exc.printStackTrace();
		}


	}

}
