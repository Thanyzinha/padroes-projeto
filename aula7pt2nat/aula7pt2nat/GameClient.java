public class GameClient {
    private Dragon dragon;
    private Fairy fairy;
    private Goblin goblin;

    public GameClient(CreatureFactory factory) {
        this.dragon = factory.createDragon();
        this.fairy = factory.createFairy();
        this.goblin = factory.createGoblin();
    }

    public void showCreatures() {
        if (dragon != null) dragon.showDetails();
        if (fairy != null) fairy.showDetails();
        if (goblin != null) goblin.showDetails();
    }

    public static void main(String[] args) {
        System.out.println("=== Usando DragonFactory ===");
        GameClient dragonClient = new GameClient(new DragonFactory());
        dragonClient.showCreatures();

        System.out.println("\n=== Usando FairyFactory ===");
        GameClient fairyClient = new GameClient(new FairyFactory());
        fairyClient.showCreatures();

        System.out.println("\n=== Usando GoblinFactory ===");
        GameClient goblinClient = new GameClient(new GoblinFactory());
        goblinClient.showCreatures();
    }
}
