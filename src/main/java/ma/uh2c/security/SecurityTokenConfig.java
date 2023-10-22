package ma.uh2c.security;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import ma.uh2c.filters.JwtTokenAuthenticationFilter;

@EnableWebSecurity
public class SecurityTokenConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable()
//				// Nous n'avons pas besoin de la session pour persister l'etat
//				// de l'utilisateur
//				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//				// On gère les tentatives d'accès non autorisées
//				.exceptionHandling()
//				.authenticationEntryPoint((req, rsp, e) -> rsp.sendError(HttpServletResponse.SC_UNAUTHORIZED)).and()
//				// On vérifie le token à chaque requête
//				.addFilterAfter(new JwtTokenAuthenticationFilter(jwtConfig()),
//						UsernamePasswordAuthenticationFilter.class)
//				// On autorise la config des requêtes via authentification AD
//				// vRA
//				.authorizeRequests()
//				.antMatchers("/**/")
//				.permitAll().anyRequest().authenticated();
	}

//	@Bean
//	public JwtConfig jwtConfig() {
//		return new JwtConfig();
//	}

}
