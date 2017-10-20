package com.akkademy;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

/**
 * @author amarinv@psl.com.co on 10/20/2017.
 */
public class JClientIntegrationSpec {

  JClient client = new JClient("127.0.0.1:2552");

  @Test
  public void itShouldSetRecord() throws Exception {
    client.set("123", 123);
    Integer result = (Integer) ((CompletableFuture) client.get("123")).get();
    assert (result == 123);
  }
}
