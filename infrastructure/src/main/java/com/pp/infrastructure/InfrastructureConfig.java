package com.pp.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.pp.infrastructure.repository")
public class InfrastructureConfig {
}
