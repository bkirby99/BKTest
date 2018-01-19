import java.util.logging.Logger;

public class HelloWorld {
  private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getSimpleName());

  public static void main(String[] args) {
    System.out.println("Hello World!");
    LOGGER.info("Logging an INFO-level message");
  }
}
