import br.com.fiap.mp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
    http.authorizeHttpRequests((requests) -> requests.anyrequest().authenticated()).formLogin((form) -> form.loginPage("/login").permitAll());
    http.csrf((crsf) -> crsf.disable());

    return http.build();
  }

  @Bean
  public UserDetailsService userDetailService(){
    UserDetails user = User.withDefaultPasswordEncoder().username("lerolero").password("12345").roles("ADM").build();
    return new InMemoryUserDetailsManager(user);
  }
}
