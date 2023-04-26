package com.example.thuisopdracht9springboottiecontroller.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/televisions")
public class TelevisionsController {
//    Variables
//    private List<String> tvs = new ArrayList<>();
    private List<String> televisionDataBase = new ArrayList<>();


//    Requests:
//    Gets
    @GetMapping
    public ResponseEntity<List<String>> getTvs(){
        return new ResponseEntity<>(televisionDataBase, HttpStatus.OK) ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getTv(@PathVariable int id){
        String tvFound = televisionDataBase.get(id);
        return new ResponseEntity<>(tvFound, HttpStatus.OK);
    }

//    Posts
    @PostMapping
    public ResponseEntity<String> addTv(@RequestParam String tv){
        televisionDataBase.add(tv);
        return new ResponseEntity<>(tv,HttpStatus.CREATED);
    }

//    Puts
    @PutMapping("/{id}")
    public ResponseEntity<String> updateTv(@PathVariable int id, @RequestBody String tvTitle){
        televisionDataBase.set(id, tvTitle);
        return new ResponseEntity<>(tvTitle, HttpStatus.NO_CONTENT);
    }

//    Deletes
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleleteTv(@PathVariable int id){
        televisionDataBase.remove(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
