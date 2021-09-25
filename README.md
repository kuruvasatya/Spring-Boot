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
## JPA method
- save(entity)
- delete(entity)
- deleteAll()
- deleteById()
- findAll()
- findAll(Sort.by("")
- findAll(Sort.by(Sort.Direction.Asc,"")
- findById()
	
## Structured methods
- find...By...    example: findUserByFirstName / findByFirstName
- delete...By...
- findTop3By....
- findDistinceBy....
- findBy...or...  example findUserByFirstNameOrLastName
- findBy...And...
- findBy...OrderBy...Asc
	
## Query Annotation
mentioned in annotation section
	
	
	
## common mistakes
- if main class (class with main method) is present in com.demo package then the controllers and the entity class should be present in the subpackage of com.demo that is in com.demo.* => example com.demo.entity
- when there is relationship between two entites in your class make sure the getter and setters are kept accordingly to overcome infinite loops
- Optional return type implies there is a chance that requesting object is not present
	```java
	Optional<Student> student = service.getStudent(id);
		if(student.isPresent()) {
			return student.get();
		}
		else 
			return null;
	```
	
# Interview Questions
1. What is difference between webservice and webapplication?
