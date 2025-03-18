package main;

import characters.Hero;
import characters.Enemy;

public class Battle {
    public static void main(String[] args) {
        Hero hero = new Hero("⚔Warrior️", 100, 20);
        Enemy enemy = new Enemy("👺Goblin", 100, 20);
        
        System.out.println("Pertarungan Dimulai!!!");
        System.out.println("Antara " + hero.getName() + " VS " + enemy.getName());
        
        while(hero.isAlive() && enemy.isAlive()) {
            int heroDamage = hero.attack();
            enemy.takeDamage(heroDamage);
            
            if(!enemy.isAlive()) {
                System.out.println(enemy.getName() + " Kalah!!!");
            }
            
            int enemyDamage = enemy.attack();
            hero.takeDamage(heroDamage);
            
            if(!hero.isAlive()) {
                System.out.println(hero.getName() + " Kalah!!!");
            }
        }
    }
}
