package eu.kartoffelquadrat.xoxinternals;


import eu.kartoffelquadrat.xoxinternals.controller.XoxManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class RestLauncher {

    XoxManagerImpl xoxManager = XoxManagerImpl.getInstance();


    public static void main(String[] args) {
        SpringApplication.run(RestLauncher.class, args);
    }

    @GetMapping("xox/games")
    public Collection<Long> getGames() {
        return xoxManager.getGames();
    }

}
