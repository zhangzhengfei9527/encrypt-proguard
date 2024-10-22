package com.sertrend.encryptproguard;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EncryptProguardApplication {

    public static class CustomGenerator implements BeanNameGenerator{
        public String generateBeanName(BeanDefinition beanDefinition, BeanDefinitionRegistry beanDefinitionRegistry) {
            return beanDefinition.getBeanClassName();
        }
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EncryptProguardApplication.class)
                .beanNameGenerator(new CustomGenerator())
                .run(args);
    }

}
