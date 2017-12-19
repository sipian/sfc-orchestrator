package org.project.sfc.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
/**
 * Created by mah on 1/27/16.
 */
@SpringBootApplication // telling the main class for the spring application
@ComponentScan(basePackages = "org.project.sfc.com")  // specify the base package to search for components 
@EnableJpaRepositories("org.project.sfc.com.SfcRepository")
@EntityScan(
  basePackages = {"org.project.sfc.com.SfcModel.SFCdict", "org.project.sfc.com.SfcModel.SFCCdict"}
)
@EnableScheduling
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
