package com.example.ambi.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
@Getter
@Setter
public class Config {

    @Autowired
    private DataSourceConfig dataSourceConfig;
}
