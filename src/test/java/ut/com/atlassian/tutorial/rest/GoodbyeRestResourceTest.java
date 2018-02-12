package ut.com.atlassian.tutorial.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import com.atlassian.tutorial.rest.goodbye.GoodbyeRestResource;
import com.atlassian.tutorial.rest.goodbye.GoodbyeRestResourceModel;
import javax.ws.rs.core.Response;

public class GoodbyeRestResourceTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {
        GoodbyeRestResource resource = new GoodbyeRestResource();

        Response response = resource.getMessage();
        final GoodbyeRestResourceModel message = (GoodbyeRestResourceModel) response.getEntity();

        assertEquals("wrong message","Goodbye World",message.getMessage());
    }
}
