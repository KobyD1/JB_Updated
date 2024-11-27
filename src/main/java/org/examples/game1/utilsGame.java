package org.examples.game1;

public class utilsGame {

    private final String player;

    public utilsGame(String player){
        this.player = player;
    }


    public void getPlayerAge(int age){

        String  player = this.player;
        String ageFromDb = age+"";
        System.out.println("The age of "+player+" is " + ageFromDb );


    }
}
