
package attainittech.prototypeo365login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug = false)
public class PrototypeO365LoginApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(PrototypeO365LoginApplication.class, args);
	}
}
