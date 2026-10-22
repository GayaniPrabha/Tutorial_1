package uk.ac.westminster.products_api;

public class Product {
    public Long id;
    public String name;
    public  Double  price;

    public Product(long id , String name , Double price){
        this.id=id;
        this.name=name;
        this.price=price;

    }

}


