package in.techmahindra.anydomain.sts.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import in.techmahindra.anydomain.sts.service.impl.CUserResourceImpl;

@SpringBootApplication
@ComponentScan(basePackageClasses = CUserResourceImpl.class)
public class StsApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(StsApplication.class, args);
	}
}
