package org.archis.SOLIDPrinciples.SingleResponsibility;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getAmount() {
        return marker.getPrice() * quantity;
    }

    // Not a responsibility of Invoice
    // Create InvoicePrinter class
    public void printInvoice() {
        System.out.println("Invoice");
        System.out.println("-------");
        System.out.println("Quantity: " + quantity);
        System.out.println("Amount: " + getAmount());
    }

    // Not a responsibility of Invoice
    // Create InvoiceDB class
    public void saveToDB() {
        System.out.println("Saving to DB");
    }
}
