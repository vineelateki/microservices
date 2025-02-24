package com.wipro.java.microservices.solid;

// Invoice class
class Invoice {
    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double totalPrice;

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.totalPrice = calculateTotal();
    }

    private double calculateTotal() {
        double priceBeforeTax = book.getPrice() * quantity;
        double discount = priceBeforeTax * discountRate;
        double tax = (priceBeforeTax - discount) * taxRate;
        return priceBeforeTax - discount + tax;
    }

    public double getTotalPrice() { return totalPrice; }
    public Book getBook() { return book; }
    public int getQuantity() { return quantity; }
    public double getDiscountRate() { return discountRate; }
    public double getTaxRate() { return taxRate; }
}
