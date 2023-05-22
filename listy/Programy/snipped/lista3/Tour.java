package snipped.lista3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Tour {

    public static void main(String[] args) {
        HashMap<String, String> krajeMap = new HashMap<>();
        HashSet<String> miastaSet = new HashSet<>();
        List<String> miastaList = new ArrayList<>();


        map(krajeMap);
        set(miastaSet);
        lista(miastaList);

        System.out.println("rozmiar Mapy: " + krajeMap.size());
        System.out.println("rozmiar Setu: " + miastaSet.size());
        System.out.println("rozmiar Listy: " + miastaList.size());
    }

    public static void map(HashMap<String, String> krajeMap){

        krajeMap.put("Polska", "Warszawa");
        krajeMap.put("Czechy", "Praga");
        krajeMap.put("Włochy", "Rzym");
        krajeMap.put("Francja", "Paryż");

        System.out.println(krajeMap.containsKey("Szwecja"));

    }

    public static void set(HashSet<String> miastaSet){

        miastaSet.add("Warszawa");
        miastaSet.add("Wroclaw");
        miastaSet.add("Rzym");
        miastaSet.add("Paryż");

        System.out.println(miastaSet.contains("Paryż"));
    }

    public static void lista(List<String> miastaList){
        miastaList.add("Warszawa");
        miastaList.add("Praga");
        miastaList.add("Warszawa");
        miastaList.add("Rzym");
        miastaList.add("Barcelona");

        System.out.println(miastaList.contains("Rzym"));
    }
}
