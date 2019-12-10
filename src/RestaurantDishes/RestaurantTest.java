package RestaurantDishes;

public class RestaurantTest {

    public static void main (String[] args) {

        RestaurantDish dish = new RestaurantDish(300, "steak", false);

        System.out.println(dish.getCost());
        System.out.println(dish.getName());
        System.out.println(dish.getRecommend());

        RestaurantDish.eat();

    }

}
