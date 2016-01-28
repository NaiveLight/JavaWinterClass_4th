package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

	public static MyLogger instance = new MyLogger();
	private Logger logger;
	public FileHandler fileHandler;
	public static final String LOG_FILE = "log.txt";
	
	private MyLogger(){
		logger = Logger.getLogger("test");
		
		try {
			fileHandler = new FileHandler(LOG_FILE);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		
		SimpleFormatter fomatter = new SimpleFormatter();
		fileHandler.setFormatter(fomatter);
		
		logger.addHandler(fileHandler);
		logger.setLevel(Level.ALL);
	}
	
	public static MyLogger getLogger(){
		return instance;
	}
	
	public void fine(String msg){
		logger.fine(msg);
	}
	
	public void warning(String msg){
		logger.warning(msg);
	}
	
	public void writeLog(String msg){
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
	}
}
