package com.rest.api.twitter.exceptions;

import com.rest.api.twitter.Model.TwUser;

public class TwUserNotFoundException extends RuntimeException {

  public TwUserNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}