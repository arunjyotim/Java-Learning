package Array;

public class Array {
    public static void main(String[] args) {
        // array = used to use multiple value in a single variable

        String[] cars = {"Camaro", "Lambo", "Tesla"};
        cars[0] = "Mustang";

        for(int i =0;i<=2; i++){
            System.out.println(cars[i]);
        }

        System.out.println("-----------------");
        String[] movies = new String[4];
        movies[0]= "Life of Pie";
        movies[1]= "Toy Story";
        movies[2] = "Moana";
        movies[3] = "Mougly";

        for(int i = 0; i< movies.length; i++){
            System.out.println(movies[i]);
        }
    }
}
