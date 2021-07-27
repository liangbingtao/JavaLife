package com.neo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @Author : neo
 * @Date 2021/7/23 11:09
 * @Description : TODO
 */
@Configuration
@EnableOpenApi //开启swagger
public class SwaggerConfig {

    // @Value("${swaggerEnable}")
    // private boolean swaggerEnable;


    //配置了swagger 的docket的bean实例
    @Bean
    public Docket docker(Environment environment) {

        //设置要显示的Swagger环境
        Profiles profiles = Profiles.of("dev", "test");
        // Profiles profiles = Profiles.of(version);
        //获取项目的环境，是生产环境还是发布环境,通过environment.acceptsProfiles(profiles)判断是否
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //是否启用swagger,如果为false,则不能在浏览器中使用swagger
                .enable(flag)
                .groupName("梁兵涛组")
                .select()
                //RequestHandlerSelectors配置要扫描接口的方式
                //basePackage  指定要扫描的包
                // any():扫描全部
                //none():不扫描
                //withClassAnnotation():扫描类上的注解，参数是一个注解的反射对象
                //withMethodAnnotation():扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("com.neo.controller"))
                //path():不过滤什么请求路径，除了‘/hello/**’请求之外的其他请求都过滤掉
                // .paths(PathSelectors.ant("/hello/**"))
                .build();
    }


    @Bean
    public Docket docket1() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }

    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }
    @Bean
    public Docket docket3() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }

    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo() {
        //作者信息
        Contact contcat = new Contact("梁兵涛", "http://www.baidu.com", "1607247596@qq.com");

        return new ApiInfo("梁兵涛的SwaggerAPI文档",
                "即使再小的帆也能远航",
                "1.0",
                "http://www.baidu.com",
                contcat,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
