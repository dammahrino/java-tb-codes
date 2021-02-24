package com.dammah;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Dagmar";
//        player.health = 100;
//        player.weapon = "Long sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 91;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Dammah", 50, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
