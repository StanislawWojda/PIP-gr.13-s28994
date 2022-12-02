import javax.swing.*;
public class Dodatkowe {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Witaj w kantorze!");
        int answer = JOptionPane.showConfirmDialog(null, "Czy chcesz wybrać PLN?");
        if (answer == 0) {
            double kwota = Double.parseDouble(JOptionPane.showInputDialog("Wprowadź kwotę z PLN"));
            JOptionPane.showMessageDialog(null, "Kwota w JPY: " + (kwota * 30.15) + " ¥");
            JOptionPane.showMessageDialog(null, "Dziękujemy za skorzystanie z naszego kantoru.");
            return;
        }
          if (answer == 1) {
              int answer2 = JOptionPane.showConfirmDialog(null, "Czy chcesz wybrać JPY?");
              if (answer2 == 0) {
                  double kwota = Double.parseDouble(JOptionPane.showInputDialog("Wprowadź kwotę z JPY"));
                  JOptionPane.showMessageDialog(null, "Kwota w JPY: " + (kwota * 0.033) + " zł");
                  JOptionPane.showMessageDialog(null, "Dziękujemy za skorzystanie z naszego kantoru.");
                  return;
              }if (answer2 == 1) {
                  JOptionPane.showMessageDialog(null, "Niestety na obecną chwilę nie posiadamy więcej walut.");

              }if (answer2 == 2){
                  JOptionPane.showMessageDialog(null, ":(");

              }
              }
          if (answer == 2) {
            JOptionPane.showMessageDialog(null, ":(");
          }
            }
    }


