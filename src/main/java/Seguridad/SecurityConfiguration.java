package Seguridad;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // Configuración de autenticación
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Configuración de autenticación en memoria
        auth
            .inMemoryAuthentication() // Configuración de usuarios en memoria
                .withUser("usuario").password("{noop}contraseña").roles("USER"); // Usuario y contraseña en texto plano
    }

    // Configuración de autorización
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests() // Configuración de autorización de solicitudes
                .antMatchers("/").permitAll() // Permitir acceso a todas las rutas
                .anyRequest().authenticated() // Todas las demás rutas requieren autenticación
            .and()
            .formLogin() // Habilitar formulario de inicio de sesión por defecto
                .permitAll(); // Permitir acceso al formulario de inicio de sesión para todos
    }
}
