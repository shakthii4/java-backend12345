package com.sakthi.project.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppResponse<T> {
    private String status;
    private String message;
    private T body;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
