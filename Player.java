package base;

import java.util.Random;
// Tanda * untuk mengimplemenatsikan semua yang ada di package tersebut
// Jika ingin lebih spesifik lakukan import dengan nama class nya
import abilities.*;


public abstract class Player implements Attackable {
    protected String name;
    protected int health;
    protected int attackPower;
    protected Random random = new Random();
    
    public Player(String n, int h, int ap) {
        name = n;
        health = h;
        attackPower = ap;
    }
    
    public int attack(){
        return random.nextInt(attackPower) + 1;
    }
    
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " Mendapat " + damage + " Damage!!!");
        System.out.println("Sisa Heallth: " + this.health);
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public abstract void infoPlayer();
}
