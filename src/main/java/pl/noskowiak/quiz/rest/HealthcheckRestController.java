package pl.noskowiak.quiz.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.noskowiak.quiz.rest.dto.HealthcheckDto;

@RestController
@RequestMapping("/api/health")
public class HealthcheckRestController {

    @GetMapping
    public HealthcheckDto healthcheck() {
        return new HealthcheckDto(true, "It's working!");
    }

}