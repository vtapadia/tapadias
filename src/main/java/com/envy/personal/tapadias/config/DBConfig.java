package com.envy.personal.tapadias.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.envy.personal.tapadias.repository")
@EnableTransactionManagement
public class DBConfig {
}
