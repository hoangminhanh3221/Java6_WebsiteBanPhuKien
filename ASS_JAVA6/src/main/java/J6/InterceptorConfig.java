package J6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import J6.intercreptor.GlobalInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	@Autowired private GlobalInterceptor globalInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(globalInterceptor)
		.addPathPatterns("/**")
		.excludePathPatterns("/rest/**","/admin/**","/assets/**");
	}
}
