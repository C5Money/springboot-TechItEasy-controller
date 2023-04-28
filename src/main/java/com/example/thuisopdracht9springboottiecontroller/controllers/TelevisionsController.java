package com.example.thuisopdracht9springboottiecontroller.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tvs")
public class TelevisionsController {
//    Variables
    private List<String> televisionDataBase = new ArrayList<>();

//    Requests:
//    Gets
    @GetMapping
    public ResponseEntity<List<String>> readTvs(){
        return ResponseEntity.ok(televisionDataBase);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> readOneTv(@PathVariable int id){
        return ResponseEntity.ok(televisionDataBase.get(id));
    }

//    Posts
    @PostMapping
    public ResponseEntity<String> createTv(@RequestBody String tv){
        televisionDataBase.add(tv);
        return ResponseEntity.created(null).body(tv);
    }

//    Puts
    @PutMapping("/{id}")
    public ResponseEntity<String> updateTv(@PathVariable int id, @RequestBody String tvData){
        televisionDataBase.set(id, tvData);
        return ResponseEntity.accepted().body(id + " " + tvData);
    }

//    Deletes
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleleteTv(@PathVariable int id){
        televisionDataBase.remove(id);
        return ResponseEntity.noContent().build();
    }
}