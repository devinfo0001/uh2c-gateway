 package ma.uh2c.filters;

import org.springframework.context.annotation.Configuration;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * 
 * @author moham
 *
 */
@Configuration
public class SendCodeResponseFilter extends ZuulFilter {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.netflix.zuul.IZuulFilter#shouldFilter()
	 */
	@Override
	public boolean shouldFilter() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.netflix.zuul.ZuulFilter#filterType()
	 */
	@Override
	public String filterType() {
		return "post";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.netflix.zuul.ZuulFilter#filterOrder()
	 */
	@Override
	public int filterOrder() {
		return 999;
	}

	@Override
	public Object run() throws ZuulException {
		return null;
	}
}
