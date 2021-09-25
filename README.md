# Spring-Boot

## Annotations used
- @EnableAutoConfiguration
- @ComponentScan
- @SpringBootConfigutaion
- @SpringBootApplication (all above three packed together)
- @RestController
- @RequestMapping -> generic mapping to any HTTP request
- @GetMapping -> To fetch json data
	- @GetMapping("/hello/{id}") => dynamic data
- @PathVariable()
	- method(@PathVariable("id") String id)
- @PostMapping -> TO post data
- @RequestBody
	- method(@RequestBody Class_name object_name) => all the data through post will be added into that object
- @DeleteMapping -> To delete record
- @PutMapping -> to Updata data
- @Query(hql_query)
- @Query(value="sql_query, nativeQuery=true)
- Passing dynamic parameters to query
	- @Query("select e from Employee e where e.salary>:sal)
	- public void method_name(@Param("sal") long salary){}
- @Modifying -> placed on top of @Query if the query is update/delete

## Spring Boot Starter Parent dependency
- spring boot follows **Convention Over Configuration**
- so we get all the configuration into our application by inheriting the parent class dependency shown below, you can also get it in maven repo
- What <parent> does is it tells what jars to pull when a dependency is added
- Suppose if we add Spring-boot-starter-web dependency <parent> tells which all jars and its versions are required for it
	
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
	3. Perform class path scan => in its sub-packages, example if your main file is in com.demo then its starts component scan in com.demo.*
	4. Strarts Tomcat, create servlet container, host application, make it available
	
## application.properties file template

```xml
server.port=8080
spring.datasource.url= jdbc:mysql://localhost:3307/SpringBootDataJpa
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.ddl-auto=update
```
	
	
# Interview Questions
1. What is difference between webservice and webapplication?
