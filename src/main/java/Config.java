import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ImportResource("file:src\\main\\java\\spring-conf.xml")
public class Config {


    @Bean
    public Person person(){

        return  new Person();
    }

    @Bean("aaa")
    public Integer getNum(){
        return 111;
    }

}
