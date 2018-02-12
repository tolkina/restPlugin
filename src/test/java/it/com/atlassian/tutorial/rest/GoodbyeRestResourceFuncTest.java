package it.com.atlassian.tutorial.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import com.atlassian.tutorial.rest.goodbye.GoodbyeRestResourceModel;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

public class GoodbyeRestResourceFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {

        String baseUrl = System.getProperty("baseurl");
        String resourceUrl = baseUrl + "/rest/goodbye/1.0/message";

        RestClient client = new RestClient();
        Resource resource = client.resource(resourceUrl);

        GoodbyeRestResourceModel message = resource.get(GoodbyeRestResourceModel.class);

        assertEquals("wrong message","Goodbye World",message.getMessage());
    }
}
