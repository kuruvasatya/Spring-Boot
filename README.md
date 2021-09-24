# Spring-Boot

## Spring Boot Starter Parent dependency
- spring boot follows **Convention Over Configuration**
- so we get all the configuration into our application by inheriting the parent class dependency shown below, you can also get it in maven repo
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.5.2</version>
</parent>
```
- if you want a web starter application, all things will start with spring-boot-starter-*
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```


## Booting Application
- Annotate main class with @SpringBootApplication
- SpringApplication.run(Class, args);
	1. Sets up default configurations
	2. Starts Spring application Context
	3. Perform class path scan
	4. Strarts Tomcat, create servlet container, host application, make it available
