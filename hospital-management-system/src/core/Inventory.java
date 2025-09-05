package core;

public final record Inventory(String itemName, int quantity, String category) implements Service {

}
