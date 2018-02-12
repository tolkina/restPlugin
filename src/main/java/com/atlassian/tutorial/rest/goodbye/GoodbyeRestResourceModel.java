package com.atlassian.tutorial.rest.goodbye;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class GoodbyeRestResourceModel {

    @XmlElement(name = "value")
    private String message;

    public GoodbyeRestResourceModel() {
    }

    public GoodbyeRestResourceModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}