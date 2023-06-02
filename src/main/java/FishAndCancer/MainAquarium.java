/*
Файл Main
 */

package FishAndCancer;

import FishAndCancer.Fish.AngelFish;
import FishAndCancer.Fish.CancerMini;
import FishAndCancer.Fish.GuppyFish;
import FishAndCancer.Fish.MarbleCancer;


public class MainAquarium {
    public static void main(String[] args) {

        FishAndMarineArthropods guppy1 = new GuppyFish("GuppyOne");
        FishAndMarineArthropods guppy2 = new GuppyFish("GuppyTwo");
        FishAndMarineArthropods guppy3 = new GuppyFish("GuppyThree");
        FishAndMarineArthropods guppy4 = new GuppyFish("GuppyFour");
        FishAndMarineArthropods angel1 = new AngelFish("AngelOne");
        FishAndMarineArthropods angel2 = new AngelFish("AngelTwo");
        FishAndMarineArthropods cancer1 = new CancerMini("Trilobite");
        FishAndMarineArthropods cancer2 = new MarbleCancer("BigTrilobite");

        Aquarium aquarium = new Aquarium();

        aquarium.AddFish(guppy1)
                .AddFish(angel1)
                .AddFish(guppy2)
                .AddFish(guppy3)
                .AddFish(guppy4)
                .AddFish(angel2)
                .AddFish(cancer1)
                .AddFish(cancer2);

        System.out.println(aquarium);
        System.out.println(aquarium.getLight());

        System.out.println("--Чемпионат аквариума по плаванию--");
        for (SwimSpeed swimmer: aquarium.swimmers()) {
            System.out.println(swimmer);
        }

        System.out.println("\n--Чемпион Аквариума!!!--\n");
        System.out.println(aquarium.getSwimmerChampion());

        Bottomrunning champ = aquarium.getRunnerChampion();

        System.out.println("\n---Чемпионат аквариума по бегу по дну---");
        for (Bottomrunning runner: aquarium.runners()) {
            System.out.println(runner);
        }

        System.out.println("\n--Чемпион Аквариума!!!--");
        System.out.println(champ);

    }
}
