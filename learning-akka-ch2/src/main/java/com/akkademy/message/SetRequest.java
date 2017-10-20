package com.akkademy.message;

/**
 * @author amarinv@psl.com.co on 4/28/2017.
 */
public class SetRequest {
  private final String message;

  public SetRequest(String message) {
    this.message = message;
  }

  public String message() {
    return message;
  }
}
