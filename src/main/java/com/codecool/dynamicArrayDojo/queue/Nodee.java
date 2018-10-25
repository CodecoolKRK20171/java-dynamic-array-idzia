package com.codecool.dynamicArrayDojo.queue;

public class Nodee {
    private String value;
    private Nodee nextNodee;

    public Nodee(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public Nodee getNextNodee(){
        return this.nextNodee;
    }

    public void setNextNodee(Nodee node) {
        this.nextNodee = node;
    }
}
