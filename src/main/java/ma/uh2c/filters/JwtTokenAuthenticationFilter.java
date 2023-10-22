 package ma.uh2c.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer.JwtConfigurer;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * 
 * @author moham
 *
 */
public class JwtTokenAuthenticationFilter extends OncePerRequestFilter {

	private final JwtConfigurer jwtConfig;

	public JwtTokenAuthenticationFilter(JwtConfigurer jwtConfig) {
		this.jwtConfig = jwtConfig;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//		// On récupère le header d'authentification
//		String header = request.getHeader(jwtConfig.getHeader());
//
//		// On vérifie le header ainsi que que le prefix
//		if (header == null || !header.startsWith(jwtConfig.getPrefix())) {
//			filterChain.doFilter(request, response); // si non valide on
//			// continue vers les autres filtres
//			return;
//		}
//
//		// On récupère le token
//		String token = header.replace(jwtConfig.getPrefix(), "");
//
//		try {
//			// On valide le token, si ce dernier a expiré la création du Claims
//			// lancera une exception
//			Claims claims = Jwts.parser().setSigningKey(jwtConfig.getSecret().getBytes()).parseClaimsJws(token).getBody();
//
//			String username = claims.getSubject();
//			if (username != null) {
//				@SuppressWarnings("unchecked")
//				List<String> authorities = (List<String>) claims.get("authorities");
//
//				// On crée l'objet auth en se basant sur le username et les
//				// authorities
//				UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username, null,
//						authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
//
//				// On authentifie l'utilisateur
//				SecurityContextHolder.getContext().setAuthentication(auth);
//			}
//
//		} catch (Exception e) {
//			// On vide le context de sécurité
//			SecurityContextHolder.clearContext();
//		}
//
//		// On continue vers le filtre suivant
//		filterChain.doFilter(request, response);
	}
}
