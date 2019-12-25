package boot.spring.config;

import boot.spring.po.User;
import boot.spring.po.User_role;
import com.fasterxml.classmate.TypeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ModelAttribute;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.AlternateTypeRule;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <一句话功能描述>
 * <功能详细描述>
 *
 * @author jianglei
 * @createTime 2019/12/24 10:17 AM
 */
//@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        TypeResolver typeResolver = new TypeResolver();
//        AlternateTypeRule typeRule1 = new AlternateTypeRule(typeResolver.resolve(User_role.class), typeResolver.resolve(Object.class));
        AlternateTypeRule typeRule2 = new AlternateTypeRule(typeResolver.resolve(User.class), typeResolver.resolve(Object.class));
//        AlternateTypeRule typeRule3 = new AlternateTypeRule(typeResolver.resolve(ModelAttribute.class), typeResolver.resolve(Object.class));
        return new Docket(DocumentationType.SWAGGER_2).enable(false).groupName("swagger接口文档").alternateTypeRules(typeRule2)
                .select()
                .paths
                (PathSelectors.any())
                .build();
    }
}
