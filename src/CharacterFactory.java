public class CharacterFactory {

    final public int defaultHp;
    final public int defaultMp;

    public CharacterFactory() {
        defaultHp = 100;
        defaultMp = 15;
    }

    public CharacterFactory(int defaultHp, int defaultMp) {
        this.defaultHp = defaultHp;
        this.defaultMp = defaultMp;
    }

    public Character build(Scene scene, String name, Behavior behavior) {
        scene.displayMessage("1. Warrior");
        scene.displayMessage("2. Mage");
        scene.displayMessage("3. Wizzard");
        int choice = scene.getIntInput(1, 4);
        Character c;
        if (choice == 1) {
            c = new Warrior(name, defaultHp, new Sword(), new BronzePlate());
        } else if (choice == 2) {
            c = new Mage(name, 2, new Staff(), new LeatherArmor());
        } else {
            c = new Wizzard(name, defaultHp, new Wand(), new BronzePlate());
        }

        c.setBehavior(behavior);

        return c;
    }
}
