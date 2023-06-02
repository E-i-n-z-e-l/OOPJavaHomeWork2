public abstract class Carnivorous extends FishAndMarineArthropods {

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Плотоядный";
    }
}

