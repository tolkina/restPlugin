package com.atlassian.tutorial.rest.hello;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class HelloWorldResourceModel {

    @XmlElement(name = "value")
    private String message;

    public HelloWorldResourceModel() {
    }

    public HelloWorldResourceModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}