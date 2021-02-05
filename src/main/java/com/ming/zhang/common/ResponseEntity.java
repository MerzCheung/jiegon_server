package com.ming.zhang.common;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private String code;
    private String msg;
    private T data;

    public ResponseEntity() {}

    public ResponseEntity(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseEntity<T> success(String msg, T data) {
        return new ResponseEntity<T>("200", msg, data);
    }

    public ResponseEntity<T> failed(String msg) {
        return new ResponseEntity<T>("500", msg, null);
    }
}
