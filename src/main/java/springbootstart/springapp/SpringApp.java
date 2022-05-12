package springbootstart.springapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApp {
    public static void main(String[] args)
    {
        try{

            SpringApplication.run(SpringApp.class,args);

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
