package com.ming.zhang.common;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private int code;
    private String msg;
    private T data;

    public ResponseEntity() {}

    public ResponseEntity(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseEntity(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseEntity<T> success(String msg, T data) {
        return new ResponseEntity<T>(200, msg, data);
    }

    public static <T> ResponseEntity<T> failed(String msg) {
        return new ResponseEntity<T>(500, msg);
    }
}
