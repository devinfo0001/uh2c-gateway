package ma.uh2c.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer.JwtConfigurer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author moham
 *
 */
@RestController
@RequestMapping("/admin")
public class UserRestController {

	private static Logger logger = LoggerFactory.getLogger(UserRestController.class);

	@Autowired(required = false)
	private JwtConfigurer jwtConfig;

}