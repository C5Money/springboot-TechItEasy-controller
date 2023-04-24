package com.example.thuisopdracht9springboottiecontroller.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("tvs")
public class TelevisionsController {
//    Variables
    private List<String> tvs = new ArrayList<>();
    private List<String> televisionDataBase = new ArrayList<>();


//    Requests:
//    Gets
    @GetMapping
    public ResponseEntity<List<String>> getTvs(){
        return new ResponseEntity<>(tvs, HttpStatus.OK) ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getTv(@PathVariable int id){
        String tvFound = tvs.get(id);
        return new ResponseEntity<>(tvFound, HttpStatus.OK);
    }

//    Posts
    @PostMapping
    public void addTv(@RequestParam String tv){
        tvs.add(tv);
    }

//    Puts
    @PutMapping("/{id}")
    public void updateTv(@PathVariable int id, @RequestBody String tvTitle){
        tvs.set(id+1, tvTitle);
    }

//    Deletes
    @DeleteMapping("/{id}")
    public void deleleteTv(@PathVariable int id){
        tvs.remove(id+1);
    }



}
