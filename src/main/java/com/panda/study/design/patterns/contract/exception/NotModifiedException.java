package com.panda.study.design.patterns.contract.exception;

import static org.springframework.http.HttpStatus.NOT_MODIFIED;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(NOT_MODIFIED)
public class NotModifiedException extends RuntimeException {

  public NotModifiedException(String msg) {
    super(msg);
  }

  public NotModifiedException(Throwable cause) {
    super(cause);
  }

  public NotModifiedException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
