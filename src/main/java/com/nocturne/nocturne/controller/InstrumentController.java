package com.nocturne.nocturne.controller;

import com.nocturne.nocturne.model.Instrument;
import com.nocturne.nocturne.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instruments")
public class InstrumentController {

    private final InstrumentService instrumentService;

    @Autowired
    public InstrumentController(InstrumentService instrumentService) {
        this.instrumentService = instrumentService;
    }

    @GetMapping("/all")
    public List<Instrument> getAllInstruments() {
        return instrumentService.getAllInstruments();
    }

    @PostMapping("/add")
    public Instrument addInstrument(@RequestBody Instrument instrument) {
        return instrumentService.addInstrument(instrument);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteInstrumentById(@PathVariable("id") Long id){
        instrumentService.deleteInstrumentById(id);
    }
}