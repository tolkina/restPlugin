package ut.com.atlassian.tutorial.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import com.atlassian.tutorial.rest.hello.HelloWorldResource;
import com.atlassian.tutorial.rest.hello.HelloWorldResourceModel;
import javax.ws.rs.core.Response;

public class HelloWorldResourceTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {
        HelloWorldResource resource = new HelloWorldResource();

        Response response = resource.getMessage();
        final HelloWorldResourceModel message = (HelloWorldResourceModel) response.getEntity();

        assertEquals("wrong message","Hello World",message.getMessage());
    }
}
