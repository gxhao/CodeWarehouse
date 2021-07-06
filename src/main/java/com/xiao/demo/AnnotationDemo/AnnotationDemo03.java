package com.xiao.demo.AnnotationDemo;
/**
 * @Author gxhao
 * @Date 2021/7/6 1:17
 * @Description 关于springboot的自动装载机制
 * @Param 
 * @Return 
 * @Since version-1.0
 */
public class AnnotationDemo03 {

    // 主启动类：SpringBootApplication
    // 自动装载注解： @EnableAutoConfiguration
    // 进入导入的包： @Import(AutoConfigurationImportSelector.class)
    // selectImports->getAutoConfigurationEntry->getCandidateConfigurations(候选配置)->getSpringFactoriesLoaderFactoryClass


    //No auto configuration classes found in META-INF/spring.factories.
    // @EnableConfigurationProperties

}
