package flower.items;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter @Setter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(double newSepalLength, FlowerColor newColor,
                     FlowerType newFlowerType, double newPrice) {
        this.sepalLength = newSepalLength;
        this.color = newColor;
        this.price = newPrice;
        this.flowerType = newFlowerType;
    }

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}