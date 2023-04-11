package kw.kng.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbsMsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbsMsServiceRegistryApplication.class, args);
	}

}


/*
  URL: http://localhost:8761/
 Service Registry
++++++++++++++++
-> Service Registry acts as DB of services available in the project
-> It provides the details of all the services which are registered with Service Registry
-> We can identify how many services available in the project
-> We can identify how many instances available for each service
-> We can use "Eureka Server" as service registry
-> Eureka Server provided by "Spring Cloud Netflix" library


 
Steps to develop Service Registry Application (Eureka Server)
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
1) Create Service Registry application with below dependency

	 a) EurekaServer (spring-cloud-starter-netflix-eureka-server)
	 b) web-starter
	 c) devtools	

2) Configure @EnableEurekaServer annotation in boot start class

3) Configure below properties in application.yml file

server.port= 8761
  
eureka:
  client:
    register-with-eureka: false

Note: If Service-Registry project port is 8761 then clients can discover service-registry and will register automatically with service-registry. If service-registry project running on any other port number then we have to register clients with service-registry manually.

4) Once application started we can access Eureka Dashboard using below URL

		URL : http://localhost:8761/
 */
