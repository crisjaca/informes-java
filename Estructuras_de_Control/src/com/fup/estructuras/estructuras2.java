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
            System.out.println("sleep and dream");//dormir y soñar
        }
        System.out.println("keep counting");//Sigue contando
    }
    
    public void sleep_and_dream2(){
        int sheep_counter = 100;
        
        if (sheep_counter >= 120) {
            System.out.println("make a bed");//hacer la cama
            System.out.println("take shower");// tomar una ducha
            System.out.println("sleep and dream");
        }
        System.out.println("feed the sheepdogs");//Sigue contando
    }
    
    public void evaluate_weather2(){
        boolean weather_good=false;
        
        if (weather_good == true) {
            System.out.println("Go for walk");//vamos a caminar; 
            System.out.println("Have fun");//salir a divertirse
        }else{
            System.out.println("go to theater");//Vamos al teatro
            System.out.println("enjoy the movie");//Disfrutar de la pelicula
        }
        System.out.println("Have lunch");//Voy a almorzar
    }
    
    public void evaluate_weather3(){
        boolean weather_good=false;
        boolean nice_restaurant=false;
        boolean tickets_avalible=true;

        if (weather_good == true) {
            System.out.println("Go for walk");//vamos a caminar; 
            if (nice_restaurant==true) {
                System.out.println("Have fun");//salir a divertirse
            }
            else
                System.out.println("eat a sandwich");//Comer un sandwich
        }else if (tickets_avalible==true) {
            System.out.println("go to theater");//Vamos al teatro
        }else
            System.out.println("go shopping");//Vamos de compras
        }    

    public void evaluate_weather4(){
        boolean weather_good=false;
        boolean nice_restaurant=false;
        boolean tickets_avalible=true;

        if (weather_good == true) {
            System.out.println("Go for walk");//vamos a caminar; 
            if (nice_restaurant==true) {
                System.out.println("Have fun");//salir a divertirse
            }
            else
                System.out.println("eat a sandwich");//Comer un sandwich
        }else if (tickets_avalible==true) {
            System.out.println("go to theater");//Vamos al teatro
        }else
            System.out.println("");//Vamos de compras
        }

    
    public void evaluate_plant(String name_plant){
        String name = name_plant;
        if (name.equals("ESPATIFILIO") ) {
            System.out.println("Si - ¡El Espatifilio! es la mejor planta de todos los tiempos!");
        }else if (name.equals("espatifilio")) {
            System.out.println("No, ¡quiero un gran Espatifilio!");
        }else{
            System.out.println("¡Espatifilio!, No "+name+"!");
        }
    }
}



