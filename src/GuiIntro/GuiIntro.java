package GuiIntro;

import javax.swing.JOptionPane;

public class GuiIntro {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age: "));
        JOptionPane.showMessageDialog(null, "You are "+ age +" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null,"You height is: "+ height +" feet");

    }
}
