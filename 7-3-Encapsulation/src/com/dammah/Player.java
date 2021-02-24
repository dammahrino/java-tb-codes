package com.dammah;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out.");
            // Reduce number of lives remaining.
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
