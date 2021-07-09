# Spring Boot CLI

The Spring Boot CLI is a command line tool that you can use if you want to quickly develop a Spring application. It lets you run Groovy scripts, which means that you have a familiar Java-like syntax without so much boilerplate code. You can also bootstrap a new project or write your own command for it.

## 1. Installing the CLI

Installing SDKMAN (The Software Development Kit Manager) : 
```
$ curl -s "https://get.sdkman.io" | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
$ sdk version
```

Installation with SDKMAN :
```
$ sdk install springboot
$ spring --version
```

## 2. Running Applications with the CLI

1. create hello.groovy
```
@RestController
class WebApplication {

    @RequestMapping("/")
    String home() {
        "Hello World!"
    }
}
```

2. compile and run the application

    $ spring run hello.groovy -- --server.port=9000


