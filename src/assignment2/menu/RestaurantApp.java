package assignment2.menu;

public class RestaurantApp {
    public static void main(String[] args) {

        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning meals");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon meals");

        MenuComponent allMenus = new Menu("All Menus", "All available menus");

        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);

        breakfastMenu.add(new MenuItem("Pancakes", "Fluffy pancakes with syrup", 6));
        breakfastMenu.add(new MenuItem("Omelette", "Omelette with cheese", 7));

        lunchMenu.add(new MenuItem("Burger", "Juicy beef burger", 10));
        lunchMenu.add(new MenuItem("Salad", "Fresh garden salad", 5));
        
        allMenus.print();
    }
}
