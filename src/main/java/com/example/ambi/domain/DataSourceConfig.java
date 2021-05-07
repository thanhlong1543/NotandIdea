package com.example.ambi.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class DataSourceConfig {
    private String username;
    private String password;
    private String url;
    private String driver;
}
