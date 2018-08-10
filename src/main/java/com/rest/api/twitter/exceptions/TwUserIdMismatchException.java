package com.rest.api.twitter.exceptions;

import com.rest.api.twitter.Model.TwUser;

public class TwUserIdMismatchException extends RuntimeException {

  public TwUserIdMismatchException(String message, Throwable cause) {
    super(message, cause);
  }
}