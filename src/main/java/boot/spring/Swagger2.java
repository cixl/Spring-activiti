package boot.spring;

import boot.spring.po.User;
import boot.spring.po.User_role;
import com.fasterxml.classmate.TypeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.bind.annotation.ModelAttribute;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.AlternateTypeRule;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class Swagger2 {
	@Bean
	public Docket createRestApi() {
		TypeResolver typeResolver = new TypeResolver();
		AlternateTypeRule typeRule1 = new AlternateTypeRule(typeResolver.resolve(User_role.class), typeResolver.resolve(Object.class));
		AlternateTypeRule typeRule2 = new AlternateTypeRule(typeResolver.resolve(User.class), typeResolver.resolve(Object.class));
		AlternateTypeRule typeRule3 = new AlternateTypeRule(typeResolver.resolve(ModelAttribute.class), typeResolver.resolve(Object.class));

		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.alternateTypeRules(typeRule2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("boot.spring.controller"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("springboot利用swagger构建api文档")
				.description("springboot整合activiti工作流引擎")
				.termsOfServiceUrl("https://gitee.com/shenzhanwang/projects")
				.version("1.0")
				.build();
	}
}
