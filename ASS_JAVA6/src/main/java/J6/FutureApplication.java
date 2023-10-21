package J6;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FutureApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutureApplication.class, args);
		Runtime rt = Runtime.getRuntime();
	      try {
	    	  rt.exec("cmd /c start chrome.exe http://localhost:8080/product/list");
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	}

}
