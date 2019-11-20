package com.example.hongjs.arrayadapter;

public class Fruit {
    private String Fruitname;
    private int FruitimageID;
    public Fruit(String Fruit, int id){
        Fruitname = Fruit;
        FruitimageID = id ;
    }

    public String getName() {
        return Fruitname;
    }

    public int getImageId() {
        return FruitimageID;
    }

}
