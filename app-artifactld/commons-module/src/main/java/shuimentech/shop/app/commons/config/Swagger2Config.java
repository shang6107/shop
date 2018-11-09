package shuimentech.shop.app.commons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author sgbq
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/9 0009
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("shuimentech.shop.app.commons.api.vip"))
                .paths(PathSelectors.any())
                .build();
    }

    ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("电商服务接口")
                .description("SDK说明文档")
//                .termsOfServiceUrl("")//网址
                .version("1.0.RELEASE")
                .build();
    }
}
