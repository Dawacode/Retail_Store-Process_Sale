/*
 * Controller class manages the interaction between the user interface and the Sale model.
 */
package controller;

import model.ItemDTO;
import model.ReceiptDTO;
import model.Sale;
import model.SaleDTO;

public class Controller {
    private Sale sale;

    /*
     * Constructor for the Controller class.
     */
    public Controller() {
    }

    /*
     * Initiates a new sale.
     */
    public void startSale() {
        sale = new Sale();
    }

    /*
     * Searches for an item in the sale based on its ID and quantity.
     * @param ID The ID of the item to search for.
     * @param quantity The quantity of the item.
     * @return The ItemDTO object representing the found item, or null if not found.
     */
    public ItemDTO searchForItem(int ID, int quantity) {
        return sale.itemExists(ID, quantity);
    }

    /*
     * Retrieves the SaleDTO object representing the current sale.
     * @return The SaleDTO object representing the current sale.
     */
    public SaleDTO getSaleDTO() {
        return sale.getSaleDTO();
    }

    /*
     * Ends the current sale and retrieves the SaleDTO object.
     * @return The SaleDTO object representing the ended sale.
     */
    public SaleDTO endSale() {
        return sale.endSale();
    }

    /*
     * Processes the payment for the current sale and returns the receipt.
     * @param payment The amount paid by the customer.
     * @return The ReceiptDTO object representing the receipt for the sale.
     */
    public ReceiptDTO pay(int payment) {
        return sale.receivePayment(payment);
    }
}