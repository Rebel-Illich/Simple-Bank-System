package banking;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Main {
     private static final Logger log = Logger.getLogger(Main.class.getName());


     static {
          try{
               LogManager.getLogManager().readConfiguration(
                       new FileInputStream("logging.properties"));
          } catch (IOException e){
               System.err.println("Could not setup logger configuration: " + e.toString());
          }

     }

     public static void main(String[] args) {
          log.info("Simple Banking System started.");
          System.out.println("Hello World");
     }


}
