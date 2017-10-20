package com.akkademy.message;

/**
 * @author amarinv@psl.com.co on 10/20/2017.
 */
public class GetRequest {
  private final String key;

  public GetRequest(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }

}
