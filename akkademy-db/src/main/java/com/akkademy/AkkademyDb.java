package com.akkademy;

import akka.actor.AbstractActor;
import akka.actor.Status;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import com.akkademy.message.GetRequest;
import com.akkademy.message.KeyNotFoundException;
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
        .match(GetRequest.class, this::handleGetRequest)
        .matchAny(o -> sender().tell(new Status.Failure(new ClassNotFoundException()), self())).build();
  }

  private void handleGetRequest(GetRequest message) {
    log.info("Received Get request: {}", message);
    Object value = map.get(message.getKey());
    Object response = (value != null) ? value : new Status.Failure(new KeyNotFoundException(message.getKey()));
    sender().tell(response, self());
  }

  private void handleSetRequest(SetRequest message) {
    log.info("Received set request key: {} value: {}", message.getKey(), message.getValue());
    map.put(message.getKey(), message.getValue());
    sender().tell(new Status.Success(message.getKey()), self());
  }
}