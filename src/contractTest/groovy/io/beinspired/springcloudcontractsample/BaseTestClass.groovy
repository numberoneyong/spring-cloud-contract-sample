

import io.beinspired.springcloudcontractsample.controller.EvenOddController
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

@SpringBootTest(classes =  Config)
abstract class BaseTestClass extends Specification {

    @Autowired
    WebApplicationContext webApplicationContext

    def setup() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext)

    }

    @Configuration
    @EnableAutoConfiguration
    static class Config {

        @Bean
        EvenOddController controller() {
            return new EvenOddController()
        }
    }

}
