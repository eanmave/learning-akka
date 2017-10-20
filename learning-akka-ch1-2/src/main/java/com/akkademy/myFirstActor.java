package com.akkademy;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import com.akkademy.message.SetRequest;

public class myFirstActor extends AbstractActor {
  protected String message;

  private myFirstActor() {
    receive(ReceiveBuilder.match(SetRequest.class, request ->
        {
          message = request.message();
        }
    ).build());
  }
}
