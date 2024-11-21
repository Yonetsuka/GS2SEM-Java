/*Nome:Cássio Eid Kobayashi Yonetsuka
Rm:99678

Nome: Allan Von Ivanov
Rm:98705 */
package br.com.fiap.solaris;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    /*
    @Autowired
    private DataSource dataSource;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((requests) -> requests
                .anyRequest().authenticated()
        ).formLogin((form)->form
                .loginPage("/login")
                .permitAll()
        );
        http.csrf((csrf)-> csrf.disable());
        return http.build();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        UserDetails user =
                User.builder()
                        .username("usuario")
                        .password(encoder.encode("senha"))
                        .roles("ADM")
                        .build();
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(encoder)
                .withUser(user);
    }*/
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((requests) -> requests
                .anyRequest().authenticated()
        ).formLogin((form)->form
                .loginPage("/login")
                .permitAll()
        );
        http.csrf((csrf)-> csrf.disable());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("rm99678")
                        .password("12345")
                        .roles("ADM")
                        .build();
        return new InMemoryUserDetailsManager(user);
    }
}
