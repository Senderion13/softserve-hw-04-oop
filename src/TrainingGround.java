public class TrainingGround {
    public static void main (String[] args) {
        Enemy zombie = new Enemy(16);
        Warrior peter = new Warrior("Peter");
        peter.attackEnemy(zombie);
        Mage sasha = new Mage("Sasha");
        sasha.attackEnemy(zombie);
        Archer andrew = new Archer("Andrew");
        andrew.attackEnemy(zombie);
        System.out.println("zombie is " + zombie.isAlive());

    }
}
