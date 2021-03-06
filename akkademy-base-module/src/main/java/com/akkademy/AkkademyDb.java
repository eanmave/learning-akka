package com.akkademy;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import com.akkademy.message.SetRequest;

import java.util.HashMap;
import java.util.Map;

public class AkkademyDb extends AbstractActor {
  protected final LoggingAdapter log = Logging.getLogger(context().
      system(), this);
  protected final Map<String, Object> map = new HashMap<>();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(SetRequest.class, this::handleSetRequest)
        .matchAny(o -> log.info("received unknown message {}", o)).build();
  }

  private void handleSetRequest(SetRequest message) {
    log.info("Received set request – key: {} value: {}", message.getKey(), message.getValue());
    map.put(message.getKey(), message.getValue());
  }
}