import javax.swing.JOptionPane;

public class atividade2 {
    public static void main(String[] args){
        float valor1, valor2;
        valor1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        valor2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        diferencia(valor1, valor2);
    }

    static void diferencia(float var1, float var2){
        float di = 0;
        if (var1 > var2) {
            di = var1 - var2;
        } else if (var2 > var1) {
            di = var2 - var1;
        }

        if (var1 != var2) {
            JOptionPane.showMessageDialog(null, "A diferença entre os números " + var1 + " e " + var2 + " é " + di);
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        }
    }
}