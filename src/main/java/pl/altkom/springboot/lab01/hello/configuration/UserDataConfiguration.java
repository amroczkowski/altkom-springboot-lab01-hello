package pl.altkom.springboot.lab01.hello.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties("user-data")
public class UserDataConfiguration {

    private String name;
}
