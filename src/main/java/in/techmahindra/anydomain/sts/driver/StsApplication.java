package in.techmahindra.anydomain.sts.driver;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import in.techmahindra.anydomain.sts.service.impl.CUserResourceImpl;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackageClasses = CUserResourceImpl.class)
@EnableSwagger2
public class StsApplication 
{
	private Logger logger = Logger.getLogger(this.getClass().toString());

	public static void main(String[] args) 
	{
		SpringApplication.run(StsApplication.class, args);
	}
}
	