package uruz7.tutorial.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Carl Lu
 */
public class CustomerService {

    private final static Logger LOGGER = LogManager.getLogger(CustomerService.class);

    void doService() {
        String serviceInfo = "do service...";
        LOGGER.trace("[{}] Customer service info: {}", "TRACE", serviceInfo);
        LOGGER.debug("[{}] Customer service info: {}", "DEBUG", serviceInfo);
        LOGGER.info("[{}] Customer service info: {}", "INFO", serviceInfo);
        LOGGER.warn("[{}] Customer service info: {}", "WARN", serviceInfo);
        LOGGER.error("[{}] Customer service info: {}", "ERROR", serviceInfo);
        LOGGER.fatal("[{}] Customer service info: {}", "FATAL", serviceInfo);
    }

}
