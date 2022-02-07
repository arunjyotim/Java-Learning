package TwoDArray;

public class TwoDArray {
    public static void main(String[] args) {

        System.out.println("--------Way 1---------");

        String[][] cars = new String[3][3];

        cars[0][0] = "Camero";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";

        cars[2][0] = "Ferrai";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for(int i = 0; i< cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("--------Way 2---------");

        String[][] cars2 =  {   {"Camaro","Corvette","Silverado"},
                                {"Mustang","Ranger","F-150"},
                                {"Ferrari","Lambo","Tesla"}
                            };
        for(int i = 0; i< cars2.length; i++){
            System.out.println();
            for(int j = 0; j<cars2[i].length; j++){
                System.out.print(cars2[i][j] + " ");
            }
        }
    }
}
