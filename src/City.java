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
}

