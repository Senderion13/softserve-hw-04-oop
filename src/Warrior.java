public class Warrior extends Hero {

    private String name;
    public Warrior(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior " + name + " attacks enemy!");
        enemy.takeDamage(5);
    }
}
