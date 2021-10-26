package com.sviridova.web_labrab.models;

public class PrimeNumber {
    //число не имеет других делителей, кроме 1 и самого себя
    private int number;
    private boolean check = true;

    public PrimeNumber(int num){
        number = num;
    }
    public boolean checkNum(){
        for(int i =2; i<number; i++){
            if(number%i==0){
                check = false;
                break;
            }
        } return check;
    }

    public int getNumber() {
        return number;
    }
}
