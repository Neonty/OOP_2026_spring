package practice4;

class Goblin extends Entity implements IDamageable, IAttackable {
    private int health;

    public Goblin(String name, int position, int health){
        super(name, position);
        this.health = health;
    }

    @Override
    public void takeDamage(int amount){
        health -= amount;
        System.out.println(getName() + " HP: " + health);

        if (health <= 0){
            die();
        }
    }

    @Override
    public void receiveAttack(int damage){
        takeDamage(damage);
    }

    private void die(){
        System.out.println(getName() + " died!");
    }
}