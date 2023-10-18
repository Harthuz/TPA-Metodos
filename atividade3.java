import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class atividade3 {
    public static void main(String[] args){
    double h, s, peso_ideal;

    do{
        s = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sexo, (1) Masculino ou (2) Feminino"));
        if(s != 2 && s != 1){
            JOptionPane.showMessageDialog(null, "Digite uma informação válida.");
        }
    }while(s != 2 && s != 1);

    h = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros"));
    
    peso_ideal = calcularPesoIdeal(s, h);

    DecimalFormat formato = new DecimalFormat("0");
    String pesoFormatado = formato.format(peso_ideal);
    
    JOptionPane.showMessageDialog(null, "O seu peso ideal é " + pesoFormatado + " Kg");

    }

    static double calcularPesoIdeal(double s_o, double h_o){
        if(s_o == 1){
            return (72.7*h_o) - 58;
        }
        if(s_o == 2){
            return (62.1 *h_o) - 44.7;
        }
        else{
            return 99999.0; // nunca deveria chegar aqui
        }
    }
}