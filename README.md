# Spring-Boot

## Spring Vs Spring-boot Vs Spring MVC

### <b>Spring Framework</b>

Spring Framework is the most popular application development framework of Java. The main feature of the Spring Framework is dependency Injection or Inversion of Control (IoC). With the help of Spring Framework, we can develop a loosely coupled application. It is better to use if application type or characteristics are purely defined

### <b>Spring Boot</b>

Spring Boot is a module of Spring Framework. It allows us to build a stand-alone, production-grade spring based application with minimal or zero configurations. It is better to use if we want to develop a simple Spring-based application or RESTful services.

Spring Boot makes it easy to quickly bootstrap and start developing a Spring-based application. It avoids a lot of boilerplate code. It hides a lot of complexity behind the scene so that the developer can quickly get started and develop Spring-based applications easily.


### <b>Spring MVC</b>

Spring MVC is a Web MVC Framework for building web applications. It contains a lot of configuration files for various capabilities. It is an HTTP oriented web application development framework. <i>Spring MVC is a model view controller-based web framework under the Spring framework.</i>

---

### <b>Problem with Spring</b>

* Huge framework
* Multiple setup steps
* Multiple configuration setup
* Multiple build & deploy steps 

Spring Boot overcomes all these issues

---

* [Common Application Properties](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html)

---
## Packaging & Running Spring Boot App

Packaging : 
```
$ mvn clean install
```

Running :

```
$ java -jar jarName.jar
```

for WAR file :
```
pom.xml : <packaging>war</packaging>
```