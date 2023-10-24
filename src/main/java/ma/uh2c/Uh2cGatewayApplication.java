package ma.uh2c;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import java.util.Arrays;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@RefreshScope
public class Uh2cGatewayApplication {

	private static Logger logger = LoggerFactory.getLogger(Uh2cGatewayApplication.class);

	public Uh2cGatewayApplication() {
		super();
	}

	public static ConfigurableApplicationContext startMicroService(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Uh2cGatewayApplication.class, args);
		ctx.addApplicationListener((ContextClosedEvent arg0) -> ctx.close());
		return ctx;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = Uh2cGatewayApplication.startMicroService(args);
		if (ctx.isActive() && logger.isInfoEnabled()) {
			logger.info("Micro service cloud [uh2c-GATEWAY] started correctly.");
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean gatewayCorsFilter() {
		logger.info("corsFilter...");
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		final CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.setAllowedOrigins(Arrays.asList("*"));
		config.addAllowedHeader("*");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("HEAD");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("DELETE");
		config.addAllowedMethod("PATCH");
		source.registerCorsConfiguration("/**", config);

		CorsFilter corsFilter = new CorsFilter(source);
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(corsFilter);
		registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);

		return registrationBean;
	}


}