import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger {
    private Logger log;
    public FileLogger() throws IOException {
        this.log = Logger.getLogger(FileLogger.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        this.log.addHandler(fh);

        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setFormatter(sFormatter);
    }

    public void info(String log) {
        this.log.info(log);
    }
}
