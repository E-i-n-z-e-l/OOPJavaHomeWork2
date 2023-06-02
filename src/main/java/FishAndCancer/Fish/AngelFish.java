/*
Скалярии
 */

package FishAndCancer.Fish;

import FishAndCancer.Bottomrunning;
import FishAndCancer.Carnivorous;
import FishAndCancer.SwimSpeed;

public class AngelFish extends Carnivorous implements SwimSpeed, Bottomrunning {

    public AngelFish(String name) {
        super(name);
    }

    @Override
    public String light() {
        return "";
    }
    @Override
    public String sizeFish() {
        return "До 15 сантиметров в длину";
    }

    @Override
    public String toString() {
        return String.format("Скалярия: %s", super.toString());
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }

    @Override
    public int getRunSpeed() {
        return 1;
    }
}
