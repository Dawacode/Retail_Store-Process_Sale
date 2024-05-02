package integration;

import model.ItemDTO;
import model.Sale;

import java.util.List;
/**
 * Represents an external inventory system for managing items.
 */
public class ExternalInventorySystem {

    // Reference to the Sale class for potential use in the system

    // List to simulate the external inventory system's storage of items
    private final List<ItemDTO> fakeExternalInventorySystem;

    /**
     * Constructs a new ExternalInventorySystem object with the provided list of items.
     * Initializes the inventory system by adding items to the store.
     * @param fakeExternalInventorySystem The list to store simulated items.
     */
    public ExternalInventorySystem(List<ItemDTO> fakeExternalInventorySystem) {
        this.fakeExternalInventorySystem = fakeExternalInventorySystem;
        addItemsToStore();
    }

    /**
     * Adds items to the simulated inventory store.
     * Initializes the store with predefined items.
     */
    private void addItemsToStore() {
        fakeExternalInventorySystem.add(new ItemDTO(10, 1, 0.25, 100));
        fakeExternalInventorySystem.add(new ItemDTO(20, 2, 0.12, 100));
        fakeExternalInventorySystem.add(new ItemDTO(30, 3, 0.18, 100));
        fakeExternalInventorySystem.add(new ItemDTO(40, 4, 0.25, 010));
    }

    /**
     * Fetches an item from the inventory system based on its ID and quantity.
     * @param quantity The quantity of the item.
     * @param ID The ID of the item.
     * @return The found item if available, null otherwise.
     */
    public ItemDTO fetchItem(int quantity, int ID) {
        for (ItemDTO item : fakeExternalInventorySystem) {
            if (itemMatchesID(item, ID)) {
                updateItemQuantity(item, quantity);
                return item;
            }
        }
        return null;
    }

    /**
     * Checks if the provided item matches the given ID.
     * @param item The item to check.
     * @param ID The ID to match against.
     * @return True if the item's ID matches the given ID, otherwise false.
     */
    private boolean itemMatchesID(ItemDTO item, int ID) {
        return item.getID() == ID;
    }

    /**
     * Updates the quantity of the provided item.
     * @param item The item to update.
     * @param quantity The new quantity of the item.
     */
    private void updateItemQuantity(ItemDTO item, int quantity) {
        item.setQuantity(quantity);
    }
}
