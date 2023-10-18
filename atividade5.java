import javax.swing.JOptionPane;

public class atividade5 {
    public static void main(String[] args){
        double s1, s2, hipo;

        JOptionPane.showMessageDialog(null, "A seguir, digite a media dos lados adjacentes ao angulo reto para que o programa posssa calcular a hipotenusa");

        s1 = Double.parseDouble(JOptionPane.showInputDialog("Medida do primeiro lado:"));
        s2 = Double.parseDouble(JOptionPane.showInputDialog("Medida do primeiro lado:"));
        hipo = calculo(s1,s2);

        JOptionPane.showMessageDialog(null, "\n Medida do primeiro lado: " +s1 +"\n Medida do primeiro lado: " +s2 +"\n Hipotenusa: " +hipo);
    }

    static double calculo(double s1_o, double s2_o){
        double hipo = ((s1_o*s1_o)+(s2_o * s2_o))/2;
        for (int i = 0; i < 10; i++){
            hipo = (hipo + ((s1_o*s1_o)+(s2_o * s2_o)) / hipo) / 2.0;
        }
        return hipo;
    }
}
