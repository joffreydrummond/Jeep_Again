package com.jed.jeep.controller;

import com.jed.jeep.controller.support.FetchJeepTestSupport;
import com.jed.jeep.entity.Jeep;
import com.jed.jeep.entity.JeepModel;
import net.bytebuddy.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FetchJeepTest extends FetchJeepTestSupport {

    @Test
    void testThatJeepsAreReturnedWhenAValidModelAndTrimAreSupplied(){

             //Given valid model, trim, URI
        JeepModel model = JeepModel.WRANGLER;
        String trim = "Sport";
        String uri = String.format("%s?model=%s&trim=%s", getBaseUri(), model, trim);
//    System.out.println(uri);

        //When connection is made to URI

        getRestTemplate().getForEntity(uri, Jeep.class);

        //Then 200 success OK status code


    }
}
