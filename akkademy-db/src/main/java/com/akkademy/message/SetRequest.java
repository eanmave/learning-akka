package com.akkademy.message;

import java.io.Serializable;

/**
 * @author amarinv@psl.com.co on 10/20/2017.
 */
public class SetRequest implements Serializable{
  private final String key;
  private final Object value;

  public SetRequest(String key, Object value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public Object getValue() {
    return value;
  }
}
