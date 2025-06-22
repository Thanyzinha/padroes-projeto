public class GoblinFactory implements CreatureFactory {

    @Override
    public Dragon createDragon() {
        return null;
    }

    @Override
    public Fairy createFairy() {
        return null;
    }

    @Override
    public Goblin createGoblin() {
        return new WarriorGoblin();
    }
}
