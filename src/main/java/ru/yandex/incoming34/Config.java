package ru.yandex.incoming34;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("ru.yandex.incoming34")
public class Config {
	
	@Bean
	@Scope("prototype")
	Archive archive() {
		return new Archive();
	}
	
	@Bean
	@Scope("prototype")
	Patient patient() {
		return new Patient();
	}
	
	@Bean
	BuildingSchema buildingSchema() {
		return new BuildingSchema();
	}
	
	@Bean
	TimeTable timeTable() {
		return new TimeTable();
	}

}
