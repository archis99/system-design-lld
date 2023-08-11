package org.archis.SOLIDPrinciples.OpenClosed;

import org.archis.SOLIDPrinciples.SingleResponsibility.Invoice;

public class InvoiceDao {

    Invoice invoice;

    InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving to DB");
    }

    // Not a responsibility of Invoice
    public void saveToExcel() {
        System.out.println("Saving to Excel");
    }
}
