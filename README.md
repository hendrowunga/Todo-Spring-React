# REST API TODOAPP

## TODO
### Doc Server:
#### application.yml:
    ```
        spring:
            datasource:
                url: jdbc:mysql://localhost:3306/todoapp
                username: root
                password: mysql
                driver-class-name: com.mysql.cj.jdbc.Driver  

            jpa:
                hibernate:
                    ddl-auto: update  
                show-sql: true       
                properties:
                    hibernate:
                        format_sql: true  
                    open-in-view: false   

        springdoc:
            api-docs:
                path: /v3/api-docs
            swagger-ui:
                path: /swagger-ui.html

        server:
            port: 8081

        ```
![](Picture/a.png)

### Doc Client:
#### Add Todo
![](Picture/b.png)
![](Picture/e.png)

#### Todo List
![](Picture/c.png)

#### Todo List
![](Picture/c.png)
![](Picture/d.png)
