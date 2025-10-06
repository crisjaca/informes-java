package com.fup.estructuras;

public class estructuras2 {
    //void = porque no retornara nada
    public void evaluate_weather(){
        boolean weather_good=true;
        
        if (weather_good == true) {
            System.out.println("Go for walk");//vamos a caminar;
        }
        System.out.println("Have lunch");//Voy a almorzar
    }
    
    public void sleep_and_dream(){
        int sheep_counter = 100;
        
        if (sheep_counter >= 120) {
            System.out.println("sleep and dream");
        }
        System.out.println("keep counting");
    }
}
