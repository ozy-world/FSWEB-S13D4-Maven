package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = Math.max(0, Math.min(100, healthPercentage));
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0) {
            healthPercentage = 0;
        }
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage += extraHealth;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
