package flower.items;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {

    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }
}