package restaurantDishes;

public class RestaurantDish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public RestaurantDish (int cost, String name, boolean recommend) {
        this.costInCents = cost;
        this.nameOfDish = name;
        this.wouldRecommend = recommend;
    }

    public int getCost() {
        return costInCents;
    }

    public String getName() {
        return nameOfDish;
    }

    public boolean getRecommend () {
        return wouldRecommend;
    }

    public int setCost (int cost) {
        return this.costInCents = cost;
    }

    public String setName (String name) {
        return this.nameOfDish = name;
    }

    public boolean setRecommend (boolean recommend) {
        return this.wouldRecommend = recommend;
    }

    public static void eat () {
        System.out.println("Nom nom nom!");
    }

}
