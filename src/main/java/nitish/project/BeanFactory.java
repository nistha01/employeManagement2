package nitish.project;

import nitish.project.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {



        @Bean
        public ArrayList<Employee> getDataSource()
        {
            return new ArrayList<>();
        }
    }

