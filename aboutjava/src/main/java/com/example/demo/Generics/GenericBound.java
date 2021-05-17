package com.example.demo.Generics;

public class GenericBound  {
    public static void main(String[] args) {
        Price<Integer> price = new Price<>();
        price.setPrice(19);
        int currentPrice  = price.getPrice();
        price.checkThePriceDataType(currentPrice);
        System.out.println(price.isEven());
    }
}

class Price<T extends Integer>{
    private T price;

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public <V extends Number> void checkThePriceDataType(V vaule){
        System.out.println("T: " + price.getClass().getName());
        System.out.println("V: " + vaule.getClass().getName());

    }

    public boolean isEven(){
        return price.intValue()%2 ==0;
    }
}
//Generics  class that tell us  number is even or not