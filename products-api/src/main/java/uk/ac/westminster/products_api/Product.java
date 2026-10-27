package uk.ac.westminster.products_api;


public class Product {
    private Long id;
    private String name;
    private   Double  price;

    public Product(long id , String name , Double price){
        this.id=id;
        this.name=name;
        this.price=price;

    }
    public Product(){

    }

    public Double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
   }
}


