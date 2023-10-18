import javax.swing.JOptionPane;

public class atividade4 {
    public static void main(String[] args) {
        int escolha;

        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "\n CALCULADORA JAVA \n \n 1 – Soma \n 2 – Subtração \n 3 – Divisão \n 4 – Multiplicação \n 5 – Resto da Divisão \n 6 – Dobro \n 7 – Quadrado \n 8 – Cubo \n 9 – Raiz Quadrada \n 0 – Sair"
            ));
        } while (escolha > 9);

        switch (escolha) {
            case 0:
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            case 1:
                calcularSoma();
                break;
            case 2:
                calcularSubtracao();
                break;
            case 3:
                calcularDivisao();
                break;
            case 4:
                calcularMultiplicacao();
                break;
            case 5:
                calcularRestoDivisao();
                break;
            case 6:
                calcularDobro();
                break;
            case 7:
                calcularQuadrado();
                break;
            case 8:
                calcularCubo();
                break;
            case 9:
                calcularRaizQuadrada();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha inválida.");
        }
    }

    static void calcularSoma() {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        JOptionPane.showMessageDialog(null, "Total: \n" + (numero1 + numero2));
    }

    static void calcularSubtracao() {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        JOptionPane.showMessageDialog(null, "Resto: \n" + (numero1 - numero2));
    }

    static void calcularDivisao() {
        double dividendo = Double.parseDouble(JOptionPane.showInputDialog("Digite o dividendo:"));
        double divisor = Double.parseDouble(JOptionPane.showInputDialog("Digite o divisor:"));
        JOptionPane.showMessageDialog(null, "Quociente: \n" + (dividendo / divisor));
    }

    static void calcularMultiplicacao() {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        JOptionPane.showMessageDialog(null, "Produto: \n" + (numero1 * numero2));
    }

    static void calcularRestoDivisao() {
        double dividendo = Double.parseDouble(JOptionPane.showInputDialog("Digite o dividendo:"));
        double divisor = Double.parseDouble(JOptionPane.showInputDialog("Digite o divisor:"));
        JOptionPane.showMessageDialog(null, "Resto: \n" + (dividendo % divisor));
    }

    static void calcularDobro() {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número:"));
        JOptionPane.showMessageDialog(null, "Dobro: \n" + (numero * 2));
    }

    static void calcularQuadrado() {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base:"));
        JOptionPane.showMessageDialog(null, "Potência ao quadrado: \n" + (base * base));
    }

    static void calcularCubo() {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base:"));
        JOptionPane.showMessageDialog(null, "Potência ao cubo: \n" + (base * base * base));
    }

    static void calcularRaizQuadrada() {
        double radicando = Double.parseDouble(JOptionPane.showInputDialog("Digite o radicando:"));
        double resultado = radicando / 2.0;

        for (int i = 0; i < 10; i++) {
            resultado = (resultado + radicando / resultado) / 2.0;
        }
        JOptionPane.showMessageDialog(null, "Raiz: \n" + resultado);
    }
}