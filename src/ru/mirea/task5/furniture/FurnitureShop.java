package ru.mirea.task5.furniture;

import java.util.HashMap;

public class FurnitureShop {
    private HashMap<String, Shop> map;

    public FurnitureShop() {
        this.map = new HashMap<>();
        this.map.put("table", new TableShop());
        this.map.put("chair", new ChairShop());
        this.map.put("cupboard", new CupboardShop());
    }

    public Furniture buy(String name) {
        if (map.containsKey(name)) {
            return map.get(name).buy();
        }
        return null;
    }
}
