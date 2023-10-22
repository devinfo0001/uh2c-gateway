package ma.uh2c;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextClosedEvent;

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


}