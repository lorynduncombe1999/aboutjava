package com.example.demo.Generics;

public class IntroToJavaGenrics {

    public static void main(String[] args) {
        Product<String> product = new Product<>();
        product.prodID = "Some ID";

        Product<Boolean> product1 =  new Product<>();
        product1.prodID = false;

        Product<Integer> product2 =  new Product<>();
        product2.prodID = 101;
        System.out.println(100-product2.prodID);

        TetDemo<Integer,Integer> tetDemo1 = new TetDemo<>(1,2);
        System.out.println(tetDemo1.getTestone());
        System.out.println(tetDemo1.getTesttwo());

    }
    /*
    all collections classes are generic
     */
}

class Product<T>{
    T prodID;

    //Getter
  public T getProductInfo(){
        return prodID;
    }
}

class TetDemo<T1,T2>{
    T1 testone;
    T2 testtwo;

    public T1 getTestone() {
        return testone;
    }

    public void setTestone(T1 testone) {
        this.testone = testone;
    }

    public T2 getTesttwo() {
        return testtwo;
    }

    public void setTesttwo(T2 testtwo) {
        this.testtwo = testtwo;
    }

    public TetDemo(T1 testone, T2 testtwo) {
        this.testone = testone;
        this.testtwo = testtwo;
    }

}