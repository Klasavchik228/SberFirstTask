import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class City {
    String name;
    String region;
    String district;
    int population;
    String foundation;
    City(String name,String region, String district, int population, String foundation){
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }
    public void printCity(){
        System.out.println("City{name='"+name+"', region='"+region+"', district='"+district+"', population="+population+", foundation='"+foundation+"'}");
    }
    public static void sortNameCity(ArrayList<City> cities){
        Collections.sort(cities, new Comparator<City>() {
            public int compare(City o1, City o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }
    public static void sortNameCityAndDistrict(ArrayList<City> cities){
        Collections.sort(cities, new Comparator<City>() {
            public int compare(City o1, City o2) {

                return o1.district.compareTo(o2.district);
            }
        }.thenComparing(new Comparator<City>() {
            public int compare(City o1, City o2) {

                return o1.name.compareTo(o2.name);
            }
        }));

    }
    public static int maxPopulation(ArrayList<City> cities){
        int max = cities.get(0).population;
        int ind = 0;
        for(int i = 0; i<cities.size();i++){
            if(max<cities.get(i).population){
                max = cities.get(i).population;
                ind = i;
            }
        }
        return max;
    }
    public static void numberOfCities(ArrayList<City> cities){
       String region = cities.get(0).region;
       int num = 1;
        for (int i = 1; i < cities.size() - 1; i++) {
            if(cities.get(i).region.equals(cities.get(i+1).region)){
                num++;
            }
            else{
                System.out.println(region +" - "+ num);
                region = cities.get(i+1).region;
                num = 1;
            }
        }
        System.out.println(region +" - "+ num);

    }
}