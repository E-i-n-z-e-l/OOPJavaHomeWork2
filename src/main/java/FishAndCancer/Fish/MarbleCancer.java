/*
Мраморный рак
 */

package FishAndCancer.Fish;

import FishAndCancer.Bottomrunning;
import FishAndCancer.Carnivorous;
import FishAndCancer.SwimSpeed;

public class MarbleCancer extends Carnivorous implements SwimSpeed, Bottomrunning {
    public MarbleCancer(String name) {
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
        return String.format("Мраморный рак: %s", super.toString());
    }
    @Override
    public int getSwimSpeed() {
        return 2;
    }

    @Override
    public int getRunSpeed() {
        return 6;
    }
}
