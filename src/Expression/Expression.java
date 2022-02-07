package Expression;

public class Expression {
    public static void main(String[] args) {
        //expression = operands & operators
        //operands = values, variables, numbers, quantity
        //operators = + - * / %

        int friends = 10;
        friends = friends % 3;
        System.out.println(friends);

        int bestFriend = 0;
        bestFriend++;
        System.out.println(bestFriend);

        double bitcoin = 20;
        bitcoin = (double) bitcoin /3;
        System.out.println(bitcoin);
    }
}
