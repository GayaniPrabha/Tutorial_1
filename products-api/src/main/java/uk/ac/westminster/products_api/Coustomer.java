package uk.ac.westminster.products_api;

public class Coustomer {
    private Address address;
    private String name;
    private String email;
    private Long id;

    public Coustomer(){

    }

    public Coustomer (Address address ,String name , String email ,Long id){
        this.address=address;
        this.name=name;
        this.email=email;
        this.address=address;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    private String getEmail(){
        return email;
    }
    private Address getAddress(){
        return address;
    }


}
