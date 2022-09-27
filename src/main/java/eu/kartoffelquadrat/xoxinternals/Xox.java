package eu.kartoffelquadrat.xoxinternals;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Xox {

    @GetMapping
    public List<String> getRunningGames() {

        return new ArrayList<>();
    }




}
