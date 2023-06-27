package pl.altkom.springboot.lab01.hello.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@EnableConfigurationProperties(UserDataConfiguration.class)
@Configuration
public class ApplicationConfiguration {

    private final UserDataConfiguration userDataConfiguration;
}
