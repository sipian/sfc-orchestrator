package org.project.sfc.com.openbaton_nfvo.configurations;

/**
 * Created by mah on 3/11/16.
 */


import org.slf4j.Logger; //SLF4J -- Simple Logging Facade for logging purposes
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service

// @ConfigurationProperties is used to get the parameters in the properties file and map them to variables
// prefix = nfvo will get 
/*

nfvo.ip=localhost
nfvo.port=8080
nfvo.username=admin
nfvo.password=openbaton

 */
// these properties and save them in the String variables
// A good explanation can be found here
//  https://www.mkyong.com/spring-boot/spring-boot-configurationproperties-example/
//  

@ConfigurationProperties(prefix = "nfvo") 
@PropertySource("classpath:/sfco.properties") //source path of the sfco.properties file
public class NfvoConfiguration {

  private String ip;
  private String port;
  private String username;
  private String password;

  private Logger logger = LoggerFactory.getLogger(this.getClass()); // for printinh

  // getters and setters are needed for all the properties variables
  public String getIP() {
    return ip;
  }

  public void setIP(String ip) {
    this.ip = ip;
  }

  public String getPort() {
    return port;
  }

  public void setPort(String basePort) {
    this.port = basePort;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "NfvoProperties{"
        + "ip='"
        + ip
        + '\''
        + ", port='"
        + port
        + '\''
        + ", username='"
        + username
        + '\''
        + ", password='"
        + password
        + '\''
        + '}';
  }
}
