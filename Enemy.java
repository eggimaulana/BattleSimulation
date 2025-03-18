package characters;

import base.Player;

public class Enemy extends Player {
    public Enemy(String n, int h, int ap) {
        super(n, h, ap);
    }

    @Override
    public int attack() {
        int damage = super.attack();
        boolean magic = random.nextDouble() > 0.4;
        
        if (magic) {
            System.out.println("🔥Serangan magic dari " + name);
            damage *= 2;
        }
        return damage;
    }
    
    @Override
    public void infoPlayer() {
        System.out.println("Name: " + name + " |Health : " + "|Attack Power: " + attackPower);
    }
}

