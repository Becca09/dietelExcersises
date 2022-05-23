package chapterEight;

public enum Food {
    APPLE("Fruit", 5), BANANA("Fruit", 8), CARROT("Vegetable", 10);
    private final String type;
    private final int numberOfCalories;

    public String getType() {
        return type;
    }

    public int getNumberOfCalories() {
        return numberOfCalories;
    }

    Food(String type, int numberOfCalories) {
        this.type = type;
        this.numberOfCalories =numberOfCalories ;
    }

}
