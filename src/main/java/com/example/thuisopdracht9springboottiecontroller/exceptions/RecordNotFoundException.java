package com.example.thuisopdracht9springboottiecontroller.exceptions;

public class RecordNotFoundException extends RuntimeException {
//    Instance Variables
    private static final long serialVersionUID = 1L;


//    Constructor
    public RecordNotFoundException(){
        super();
    }

    public RecordNotFoundException(String message){
        super(message);
    }


//
}
