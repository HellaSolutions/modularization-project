package it.inps.bricks.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring3.SpringTemplateEngine;
import org.thymeleaf.spring3.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

/**
 * @EnableWebMvc: annotation counterpart of <mvc:annotation-driven>
 **/
@Configuration
@EnableWebMvc
@ComponentScan("it.inps.bricks.web.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ITemplateResolver templateResolver() {

		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		return templateResolver;
	
	}
	
	@Bean
	public TemplateEngine templateEngine(ITemplateResolver templateResolver) {
		
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver);
		return templateEngine;
	
	}

	@Bean
	public ViewResolver viewResolver(SpringTemplateEngine templateEngine) {
		
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine);
		return viewResolver;
	
	}

	/**
	 * Static content handling.
	 * 
	 * Finally, this new WebConfig class extends WebMvcConfigurerAdapter and
	 * overrides its configureDefaultServletHandling() method. By calling
	 * enable() on the given DefaultServletHandlerConfigurer, you�re asking
	 * DispatcherServlet to forward requests for static resources to the servlet
	 * container�s default servlet and not to try to handle them itself.
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
