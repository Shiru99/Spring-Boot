# Spring Boot with JPA

## In-Memory Databases in Spring Boot

   * Spring Boot makes it especially easy to use an in-memory database – because it can create the configuration automatically for H2, HSQLDB, and Derby.

   * All we need to do to use a database of one of the three types in Spring Boot is add its dependency to the pom.xml. When the framework encounters the dependency on the classpath, it will configure the database automatically.

---

## External Database - PostgreSQL, MySQL, ...

### Postgresql Installation
***Installation***
```
$ sudo apt-get update
 
$ sudo apt install postgresql postgresql-contrib
```

***Use Default User-psql***
```
$ sudo -u postgres psql postgres
```


***Use New User***
```
$ sudo -u postgres psql postgres

postgres=# CREATE ROLE "Shiru99" WITH PASSWORD '1234';

postgres=# ALTER ROLE  "Shiru99" WITH LOGIN;
```

***Create New Database***
```
postgres=# CREATE DATABASE test;  (dbname - all letters small)

$ psql -U Shiru99 -h localhost -p 5432 -d test;
```

***Create New Table***
```
test=> CREATE TABLE table1(
   ID    INT   PRIMARY KEY    NOT NULL,
   NAME  CHAR(50)
);
```

***Insert New Table-entries***
```
test=> INSERT INTO table1 VALUES (1, 'something something');
test=> INSERT INTO table1 VALUES (2, 'nothing nothing');
```

***List of Tables***
```
test=> \dt;
```

***Table-entries***
```
test=> select * from table1;
```
---
