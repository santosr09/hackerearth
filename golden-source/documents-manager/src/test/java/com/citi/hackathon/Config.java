package com.citi.hackathon;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.citi.hackathon.repositories")
@ComponentScan(basePackages = { "com.citi.hackathon.service" })
public class Config {
	
}
