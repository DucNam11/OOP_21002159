package com.oop.library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent(){
        double longestTime = 0;
        Rent student = null;
        for (Rent rent : rents){
            double time =  rent.end.getTime() - rent.begin.getTime();
            if (time > longestTime){
                longestTime = time;
                student = rent;
            }
        }
        return student;
    }
}
