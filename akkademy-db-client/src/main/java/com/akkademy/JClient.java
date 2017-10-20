package com.akkademy;

import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.pattern.PatternsCS;
import com.akkademy.message.GetRequest;
import com.akkademy.message.SetRequest;
import scala.compat.java8.FutureConverters;

import java.util.concurrent.CompletionStage;

/**
 * @author amarinv@psl.com.co on 10/20/2017.
 */
public class JClient {
  private final ActorSystem system = ActorSystem.
      create("LocalSystem");
  private final ActorSelection remoteDb;

  public JClient(String remoteAddress) {
    remoteDb = system.actorSelection("akka.tcp://akkademy@" + remoteAddress + "/user/akkademy-db");
  }

  public CompletionStage set(String key, Object value) {
    return PatternsCS.ask(remoteDb, new SetRequest(key, value), 2000);
  }

  public CompletionStage<Object> get(String key) {
    return PatternsCS.ask(remoteDb, new GetRequest(key), 2000);
  }
}
