/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invoice_system_generator;

/**
 *
 * @author zeyad Abdelkader
 */
public class Line {
    private int num;
    private String item;
    private double price;
    private int count;
    private Invoice invoice;

    public Line() {
    }

    public Line(int num, String item, double price, int count, Invoice invoice) {
        this.num = num;
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }

   
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    
}
