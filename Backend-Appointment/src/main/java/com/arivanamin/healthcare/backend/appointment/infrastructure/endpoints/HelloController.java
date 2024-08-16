package com.arivanamin.healthcare.backend.appointment.infrastructure.endpoints;

import com.arivanamin.healthcare.core.domain.aspects.LogExecutionTime;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag (name = "Hello controller", description = "all the greetings")
public class HelloController {
    
    @GetMapping ("protected/appointment/greeting")
    @Operation (summary = "Get list of all greetings")
    @ResponseStatus (HttpStatus.OK)
    @LogExecutionTime
    public List<Greeting> getAllTransactions () {
        
        return List.of(Greeting.builder().name("greeting 1").build());
    }
}

@Data
@Builder
class Greeting {
    
    String name;
}
