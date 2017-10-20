package com.akkademy;

import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * @author amarinv@psl.com.co on 10/20/2017.
 */
public class Main {
  public static void main(String... args) {
    Config config = ConfigFactory.load("application.conf");
    ActorSystem system = ActorSystem.create("akkademy", config);
    system.actorOf(Props.create(AkkademyDb.class), "akkademy-db");
  }
}
