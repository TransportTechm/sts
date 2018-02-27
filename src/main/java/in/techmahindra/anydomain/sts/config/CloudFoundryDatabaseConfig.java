package in.techmahindra.anydomain.sts.config;

import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
public class CloudFoundryDatabaseConfig {

	private Logger logger = Logger.getLogger(this.getClass().toString());
	@Bean
    public Cloud cloud() {
        return new CloudFactory().getCloud();
       
    }    

    @Bean
    public DataSource cleardb() {
        DataSource dataSource = cloud().getServiceConnector("test-clearDB", DataSource.class, null);
        
        
        return dataSource;
    }
}
