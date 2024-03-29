package com.casic.icms.common.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author MrBird
 */
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:febs.properties"})
@ConfigurationProperties(prefix = "febs")
public class FebsProperties {

    private ShiroProperties shiro = new ShiroProperties();
    private boolean openAopLog = true;
    private SwaggerProperties swagger = new SwaggerProperties();
}
