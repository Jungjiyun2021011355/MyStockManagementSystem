package log;
import java.io.IOException;
import java.util.logging.*;

public class EventLogger {

   FileHandler filehandler;
   LogManager lm;
   Logger logger;

   public EventLogger(String fileName) {

      try {
         lm = LogManager.getLogManager();
         logger = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);
         filehandler = new FileHandler(fileName);
         filehandler.setFormatter(new SimpleFormatter());
         logger.addHandler(filehandler);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   public void log(String logMessage) {
      logger.info(logMessage);
   }
}