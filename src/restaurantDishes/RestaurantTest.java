package restaurantDishes;

public class RestaurantTest {

    public static void main (String[] args) {

        RestaurantDish dish = new RestaurantDish(300, "steak", false);

        System.out.println(dish.getCost());
        System.out.println(dish.getName());
        System.out.println(dish.getRecommend());

        System.out.printf("With discount applied the cost is now: %s%n", dish.setCost(100));

        RestaurantDish.eat();

    }

}
