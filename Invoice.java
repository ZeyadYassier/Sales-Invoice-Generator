
package com.mycompany.invoice_system_generator;


public class Invoice {
    private int num;
    private String name;
    private String Customer;
   
    

    public Invoice() {
    }

  

    public Invoice(int num, String name, String Customer) {
        this.num = num;
        this.name = name;
        this.Customer = Customer;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
