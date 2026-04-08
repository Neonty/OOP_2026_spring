package practice4;

public class Game {
    public static void main(String[] args) {
        Knight knight = new Knight("Knight", 0, 20);
        Goblin goblin = new Goblin("Goblin", 5, 50);
        WoodenBox box = new WoodenBox("Box", 2);
        Rock rock = new Rock("Rock", 3);
        Chest chest = new Chest("Chest", 4);

        knight.moveForward();
        knight.moveForward();

        knight.attack(goblin);
        knight.attack(box);

        knight.push(box, 1);
        knight.push(rock, -1);
        knight.push(chest, 1);

        knight.interact(chest);
        knight.interact(chest);
    }
}