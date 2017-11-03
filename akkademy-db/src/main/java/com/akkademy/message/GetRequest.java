package com.akkademy.message;

import java.io.Serializable;

/**
 * @author amarinv@psl.com.co on 10/20/2017.
 */
public class GetRequest implements Serializable{
  private final String key;

  public GetRequest(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }

}
