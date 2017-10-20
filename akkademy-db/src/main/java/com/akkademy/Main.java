package com.akkademy;

import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * @author amarinv@psl.com.co on 10/20/2017.
 */
public class Main {
  public static void main(String... args) {
    ActorSystem system = ActorSystem.create("akkademy");
    system.actorOf(Props.create(AkkademyDb.class), "akkademy-db");
  }
}
