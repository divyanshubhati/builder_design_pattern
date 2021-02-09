public class Demo {
    public static void main(String[] args) {
//        MealBuilder mealBuilder = new MealBuilder();
//        System.out.println("Creating veg meal");
//        Meal vegMeal = Meal.MealBuilder.createVegMeal();
//        System.out.println("Creating non-veg meal");
//        Meal non_vegMeal = Meal.MealBuilder.createNonVegMeal();

        Meal vegMeal = new Meal.MealBuilder("Veg Meal").setItems1(new VegBurger()).setItems2(new Pepsi()).build();
        Meal nonVegMeal = new Meal.MealBuilder("Non-Veg Meal").setItems1(new NonVegBurger()).setItems2(new Cola()).build();
    }
}
