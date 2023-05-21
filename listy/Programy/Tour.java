import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Tour {

    public static void main(String[] args) {

        print_countries_cities();
        print_unique_cities();
        print_cities();

    }

    public static void print_countries_cities(){

        HashMap<String, String> countries_cities = new HashMap<>();
        countries_cities.put("Polska", "Warszawa");
        countries_cities.put("Czechy", "Praga");
        countries_cities.put("Włochy", "Rzym");
        countries_cities.put("Francja", "Paryż");

        System.out.println(countries_cities);

        System.out.println(countries_cities.containsKey("Szwecja"));
        System.out.println("rozmiar Mapy: " + countries_cities.size());

    }

    public static void print_unique_cities(){
        HashSet<String> unique_cities = new HashSet<>();
        unique_cities.add("Warszawa");
        unique_cities.add("Wroclaw");
        unique_cities.add("Rzym");
        unique_cities.add("Paryż");

        System.out.println(unique_cities);

        System.out.println(unique_cities.contains("Rzym"));
        System.out.println("rozmiar Setu: " + unique_cities.size());
    }

    public static void print_cities(){
        List<String> cities = new ArrayList<>();
        cities.add("Warszawa");
        cities.add("Praga");
        cities.add("Warszawa");
        cities.add("Rzym");
        cities.add("Barcelona");


        System.out.println(cities);

        System.out.println(cities.contains("Paryż"));
        System.out.println("rozmiar Listy: " + cities.size());
    }
}
