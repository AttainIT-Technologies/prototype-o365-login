
package attainittech.prototypeo365login.config;

import com.azure.spring.aad.webapp.AADWebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class AADOAuth2LoginSecurityConfig extends AADWebSecurityConfigurerAdapter
{
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        super.configure(http);
        http.authorizeRequests()
                .anyRequest().authenticated();
        // Custom configuration goes here in the future
    }
}
