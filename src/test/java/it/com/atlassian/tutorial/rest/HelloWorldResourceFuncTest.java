package it.com.atlassian.tutorial.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import com.atlassian.tutorial.rest.hello.HelloWorldResourceModel;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

public class HelloWorldResourceFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {

        String baseUrl = System.getProperty("baseurl");
        String resourceUrl = baseUrl + "/rest/hello/1.0/message";

        RestClient client = new RestClient();
        Resource resource = client.resource(resourceUrl);

        HelloWorldResourceModel message = resource.get(HelloWorldResourceModel.class);

        assertEquals("wrong message","Hello World",message.getMessage());
    }
}
