package com.akkademy.message;

import java.io.Serializable;

public class KeyNotFoundException extends Exception implements Serializable {
  public final String key;

  public KeyNotFoundException(String key) {
    this.key = key;
  }
}