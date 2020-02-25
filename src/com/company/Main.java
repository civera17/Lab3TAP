package com.company;

public class Main {

    public static void main(String[] args) {
        CurrentTime currentTime = new CurrentTime();
        System.out.println("Minute - " + currentTime.getMinutes() + "\nSecunde - " + currentTime.getSeconds());
    }
}
