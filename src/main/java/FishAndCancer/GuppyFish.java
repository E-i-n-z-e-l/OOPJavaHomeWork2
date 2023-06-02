/*
Рыбка Гуппи
 */

package FishAndCancer;

public class GuppyFish extends Herbivorous implements SwimSpeed, Bottomrunning {

    public GuppyFish(String name) {
        super(name);
    }

    @Override
    public String light() {
        return "";
    }

    @Override
    public String sizeFish() {
        return "1 - 7 сантиметров в длину";
    }

    @Override
    public String toString() {
        return String.format("Рыбка Гуппи: %s", super.toString());
    }
    @Override
    public int getSwimSpeed() {
        return 12;
    }

    @Override
    public int getRunSpeed() {
        return 1;
    }
}
