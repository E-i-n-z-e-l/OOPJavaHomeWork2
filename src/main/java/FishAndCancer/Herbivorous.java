/*
Травоядные
 */

package FishAndCancer;

public abstract class Herbivorous extends FishAndMarineArthropods {

    public Herbivorous(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Травоядный";
    }

}