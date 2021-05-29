/**
 * 
 */
package com.web.articullo.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * @author cgarcia
 *
 */

@Configuration
@OpenAPIDefinition
public class OpenApiConfig {
	@Bean
    public OpenAPI customOpenAPI() {
		
		return new OpenAPI()
				.info(new Info()
				.title("Articulo")
				.description("API REST de Entidad Articulo").version("1.0.0")
				.contact(new Contact().name("CESAR").email("cagc1993@hotmail").url("https://www.linkedin.com/in/c%C3%A9sar-augusto-garc%C3%ADa-cortez-7a85a958/"))
				.termsOfService("https://www.linkedin.com/in/c%C3%A9sar-augusto-garc%C3%ADa-cortez-7a85a958/")
				.license(new License().name("Apache 2.0").url("https://www.gnu.org/licenses/gpl-3.0.html"))
				);
		
	}
}
