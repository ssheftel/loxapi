#LoxApi v2

##Api

###`/health`
- `GET` -> Hello World!

##Notes

###httpie endpoints

authenticating

    http POST localhost:8080/api/auth/login X-Requested-With:XMLHttpRequest username=moemoe password=password

checking health

    http GET localhost:8080/health
    
checking health with jwt

    http GET localhost:8080/api/health X-Authorization:"Bearer <jwt_token>"

##Useful Links
- application.yml [property docs](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)
- jwt + spring security
    - great [jwt authentication tutorial](http://www.svlada.com/jwt-token-authentication-with-spring-boot/)
 

### application.yml notes

        driverClassName: org.h2.Driver
        url: jdbc:h2:mem:test;MODE=PostgreSQL
        username: root
        password: root
        driver-class-name: org.postgresql.Driver
