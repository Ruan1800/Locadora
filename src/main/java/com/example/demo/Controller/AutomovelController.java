package com.example.demo.Controller;

import com.example.demo.DTO.AutomovelDTO;
import com.example.demo.Services.AutomovelService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auto-movel")
public class AutomovelController {


    private final AutomovelService automovelService;


    public AutomovelController(AutomovelService automovelService) {
        this.automovelService =automovelService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AutomovelDTO addAutomovel(@RequestBody AutomovelDTO automovel) {
        return this.automovelService.addAutomovel(automovel);
    }

    @GetMapping("id")
    @ResponseStatus(HttpStatus.OK)
    public AutomovelDTO getAutomovelwithId(@PathVariable("id") Long id) {
        return this.getAutomovelwithId(id);
    }



}
