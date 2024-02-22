import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("Задача ВС Java Сбер.csv");
        try(Scanner scanner = new Scanner(path);) {
            var cities = new ArrayList<City>();
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                ArrayList<String> lineList = new ArrayList<>();
                String word = "";
                for(char i : line.toCharArray()){
                    if (i != ';'){
                        word += i;
                    }
                    else{
                        lineList.add(word);
                        word = "";
                        continue;
                    }
                }
                lineList.add(word);
                word = "";
                cities.add(new City(lineList.get(1),lineList.get(2),lineList.get(3),Integer.valueOf(lineList.get(4)),lineList.get(5)));
            }
            //City.sortNameCity(cities);
            //City.sortNameCityAndDistrict(cities);
            //for(City city : cities ){city.printCity();}
            //System.out.println(City.maxPopulation(cities));
            City.numberOfCities(cities);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}