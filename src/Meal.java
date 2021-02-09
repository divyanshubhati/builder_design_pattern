import java.util.ArrayList;

public class Meal {

    private ArrayList<items> items_list =  new ArrayList<items>();;

    private void addToMeal(items x) {
        items_list.add(x);
    }
    private float getPrice() {
        float total =0;
        for (items x : items_list){
            total = total + x.price();
        }
        return total;
    }
    private void packMeal() {
        for (items x : items_list){
            System.out.println(x.name());
            System.out.println(x.price());
            x.packing().pack();
        }
        System.out.println("Total Price" + getPrice());
    }

    private Meal(){

    }

    public static class MealBuilder {
        private items items1;

        private items items2;

        public MealBuilder (String msg) {
            System.out.println("Creating >> " + msg);
        }

        public items getItems1() {
            return items1;
        }

        public MealBuilder setItems1(items items1) {
            this.items1 = items1;
            return this;
        }

        public items getItems2() {
            return items2;
        }

        public MealBuilder setItems2(items items2) {
            this.items2 = items2;
            return this;
        }

        Meal build(){
            Meal meal = new Meal();
            meal.addToMeal(items1);
            meal.addToMeal(items2);
            meal.packMeal();
            return meal;
        }

//        static Meal createVegMeal(){
//            Meal meal = new Meal();
//            meal.addToMeal(new VegBurger());
//            meal.addToMeal(new Pepsi());
//            meal.packMeal();
//            return meal;
//        }
//
//        static Meal createNonVegMeal(){
//            Meal meal = new Meal();
//            meal.addToMeal(new NonVegBurger());
//            meal.addToMeal(new Cola());
//            meal.packMeal();
//            return meal;
//        }



    }

}
