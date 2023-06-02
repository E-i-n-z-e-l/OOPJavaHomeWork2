package FishAndCancer;

import java.util.ArrayList;
import java.util.List;
//import java.SwimSpeed;

public class Aquarium {

    private List<FishAndMarineArthropods> aquarium = new ArrayList<>();
    private AquariumLighting aqualight = new AquariumLighting();
    public Aquarium AddFish(FishAndMarineArthropods someFish) { // Метод добавления животных;
        aquarium.add(someFish);
        return this;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("В аквариуме: \n"); // Метод добавления животных в аквариум;

        for (FishAndMarineArthropods fish: aquarium) {
            builder.append(fish).append("\n");
        }
        return builder.toString();
    }

    private List<Lightable> getLightable() { // Метод Света в аквариуме;
        List<Lightable> result = new ArrayList<>(aquarium);
        result.add(aqualight);
        return result;
    }

    public String getLight() { // Вывод метода света в аквариуме;
        StringBuilder builder = new StringBuilder();
        for (Lightable lightable: getLightable()) {
            builder.append(lightable.light()).append("\n");
        }
        return builder.toString();
    }

    public List<SwimSpeed> swimmers() {
        List<SwimSpeed> swimmer = new ArrayList<>();
        for (FishAndMarineArthropods fish: aquarium) {
            if (fish instanceof SwimSpeed) {
                swimmer.add((SwimSpeed) fish);
            }
        }
        return swimmer;
    }

    public SwimSpeed getSwimmerChampion(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champ = swimmers.get(0);
        for (SwimSpeed runner: swimmers) {
            if (champ.getSwimSpeed() < runner.getSwimSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

    public List<Bottomrunning> runners(){
        List<Bottomrunning> runners = new ArrayList<>();
        for (FishAndMarineArthropods fish: aquarium) {
            if (fish instanceof Bottomrunning) {
                runners.add((Bottomrunning) fish);
            }
        }
        return runners;
    }

    public Bottomrunning getRunnerChampion(){
        List<Bottomrunning> runners = runners();
        Bottomrunning champ = runners.get(0);
        for (Bottomrunning runner: runners) {
            if (champ.getRunSpeed() < runner.getRunSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }
}
