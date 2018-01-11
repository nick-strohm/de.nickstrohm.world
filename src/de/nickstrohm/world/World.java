package de.nickstrohm.world;

public class World {
    private Continent[] continents;

    public World() {
        continents = new Continent[] {
                new Continent("North-America",24900000, 523000000),
                new Continent("Europe", 10500000, 733000000),
                new Continent("Asia", 44400000, 4010000000L),
                new Continent("Australia", 8500000, 34000000),
                new Continent("Africa", 30300000, 944000000),
                new Continent("South-America", 17800000, 381000000)
        };
    }

    public void sort() {
        int n = continents.length;
        Continent min;
        int minPos;

        for (int diff = 0; diff < n - 1; diff++) {
            min = continents[diff];
            minPos = diff;

            for (int search = diff + 1; search < n; search++) {
                if (min.isLargerThen(continents[search])) {
                    min = continents[search];
                    minPos = search;
                }
            }

            Continent tmp = continents[diff];
            continents[diff] = continents[minPos];
            continents[minPos] = tmp;
        }
    }

    public void print() {
        for (int i = 0; i < continents.length; i++) {
            System.out.println(continents[i]);
        }
    }
}
