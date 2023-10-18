import javax.swing.JOptionPane;

public class atividade1 {
    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, mediaCalc = 0;
        String nome, aluno;
        nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");

        JOptionPane.showMessageDialog(null, "Digite a 1° nota::");
        nota1 = lerNota();
        JOptionPane.showMessageDialog(null, "Digite a 2° nota::");
        nota2 = lerNota();

        mediaCalc = calcularMedia(nota1, nota2);

        if (mediaCalc >= 7) {
            aluno = "Aluno APROVADO";
        } else {
            aluno = "Aluno REPROVADO";
        }

        JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome + "\n" + "Primeira nota: " + nota1 + "\n" + "Segunda nota: " + nota2 + "\n" + "Média do aluno: " + mediaCalc + "\n" + aluno);
    }

    static double lerNota() {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota:"));
        while (nota > 10 || nota < 0) {
            JOptionPane.showMessageDialog(null, "Digite uma nota válida.");
            nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota:"));
        }
        return nota;
    }

    static double calcularMedia(double a_nota1, double a_nota2) {
        double a_media = ((a_nota1 + a_nota2) / 2);
        return a_media;
    }
}
