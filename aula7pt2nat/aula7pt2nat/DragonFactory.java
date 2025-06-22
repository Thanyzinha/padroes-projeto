public class DragonFactory implements CreatureFactory {

    @Override
    public Dragon createDragon() {
        return new FireDragon();
    }

    @Override
    public Fairy createFairy() {
        return null;
    }

    @Override
    public Goblin createGoblin() {
        return null;
    }
}
