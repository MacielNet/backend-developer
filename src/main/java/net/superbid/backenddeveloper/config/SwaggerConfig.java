package net.superbid.backenddeveloper.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Header;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private final ResponseMessage m201 = simpleMessage(201, "Post criado"); 
	private final ResponseMessage m204put = simpleMessage(204, "Atualização ok"); 
	private final ResponseMessage m204del = simpleMessage(204, "Objeto removido");
	private final ResponseMessage m400 = simpleMessage(400, "Erro de validação");
	private final ResponseMessage m403 = simpleMessage(403, "Não autorizado");
	private final ResponseMessage m404 = simpleMessage(404, "Objeto não encontrado");
	private final ResponseMessage m422 = simpleMessage(422, "Erro de validação");
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.useDefaultResponseMessages(false)
				.globalResponseMessage(RequestMethod.GET, Arrays.asList(m403, m404)) 
				.globalResponseMessage(RequestMethod.POST, Arrays.asList(m201, m400, m403, m422)) 
				.globalResponseMessage(RequestMethod.PUT, Arrays.asList(m204put, m403, m404, m422)) 
				.globalResponseMessage(RequestMethod.DELETE, Arrays.asList(m204del, m403, m404))
				.select()
				.apis(RequestHandlerSelectors.basePackage("net.superbid.backenddeveloper.resources"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() { return new ApiInfo(
			"Documentação - API Rest contendo as operações de básicas de CRUD",
			"Esta API foi desenvolvida para a Superbid WebServices como parte do Teste de Desenvolvimento Backend."
			+ " Atraves dessa documentação é possível testar os endpoints da API clicando no botão 'Try it Out!'"
			+ " localizado no rodapé de cada método! Clique em 'Post Resource' para visualiza-los.",
			"Versão 1.0",
			"www.meuti.com.br",
			new Contact(
					"Wesley Maciel",
					"www.meuti.com.br",
					"wesley@meuti.com.br"), 
		    "Permitido cópia e utilização do cógido",
		    "www.meuti.com.br",
			Collections.emptyList() // Vendor Extensions
			); 
	}
	
	private ResponseMessage simpleMessage(int code, String msg) {
		return new ResponseMessageBuilder().code(code).message(msg).build();
		}
}
