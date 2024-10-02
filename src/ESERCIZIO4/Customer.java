package ESERCIZIO4;

public class Customer {

    private Long id;
    private String name;
    private int tier;

    public Customer(Long id, String name, int tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public int getTier() {
        return tier;
    }
}

