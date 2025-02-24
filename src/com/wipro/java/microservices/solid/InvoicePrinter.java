package com.wipro.java.microservices.solid;

// Class to print invoice details
class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Book: " + invoice.getBook().getTitle());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Total Price: $" + invoice.getTotalPrice());
    }
}
