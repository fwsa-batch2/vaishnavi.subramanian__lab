package com.fwsa;

public class Batch1 {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private int id;
    private String names;
    private String email;
    private String password;

    public static void main(String[] args){
        Batch1 obj = new Batch1();
        obj.setId(1);
        obj.setNames("Vaishnavi");
        obj.setEmail("vaishnavi12@gmail.com");
        obj.setPassword("poiufbcwuk");

        System.out.println("Id no. : " + obj.getId());
        System.out.println("Name : " + obj.getNames());
        System.out.println("Email id : " + obj.getEmail());
    }
}

