package com.echocart.backend.controller;


import com.echocart.backend.model.ExternalSignal;
import com.echocart.backend.service.ExternalSignalService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signals")
public class ExternalSignalController {
    private final ExternalSignalService signalService;

    public ExternalSignalController(ExternalSignalService signalService){
        this.signalService = signalService;
    }

    @GetMapping
    public String testSignals() {
        return "Signals API working";
    }

    @PostMapping
    public void addSignal(@RequestBody ExternalSignal signal){
        signalService.addSignal(signal);
    }
}
