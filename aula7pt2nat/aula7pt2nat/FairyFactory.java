public class FairyFactory implements CreatureFactory {

    @Override
    public Dragon createDragon() {
        return null;
    }

    @Override
    public Fairy createFairy() {
        return new LightFairy();
    }

    @Override
    public Goblin createGoblin() {
        return null;
    }
}
