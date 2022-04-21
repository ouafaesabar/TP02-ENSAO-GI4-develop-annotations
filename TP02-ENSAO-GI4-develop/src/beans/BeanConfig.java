package beans;

import com.ensa.gi4.datatabase.DaoFactoryImp;
import com.ensa.gi4.modele.Materiel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {
    @Bean
    public DaoFactoryImp materielDAO()
    {
        return new DaoFactoryImp();
    }
    
}
