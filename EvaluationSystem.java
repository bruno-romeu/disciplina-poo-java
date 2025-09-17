import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EvaluationSystem {
    public static void main(String args[]) {
        double test1, test2, work;
        List<Double> avaliations = new ArrayList<>();
        double average;
        boolean isNumberValid = false;

        do {
            String test1Str = JOptionPane.showInputDialog(null, "Informe qual foi a nota do aluno na primeira prova: ", "Primeira prova", JOptionPane.QUESTION_MESSAGE);
            try {
                test1 = Double.parseDouble(test1Str);
                isNumberValid = true;
                avaliations.add(test1);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isNumberValid);
        isNumberValid = false;

        do {
            String test2Str = JOptionPane.showInputDialog(null, "Informe qual foi a nota do aluno na segunda prova: ", "Segunda prova", JOptionPane.QUESTION_MESSAGE);
            try {
                test2 = Double.parseDouble(test2Str);
                isNumberValid = true;
                avaliations.add(test2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isNumberValid);
        isNumberValid = false;

        do {
            String workStr = JOptionPane.showInputDialog(null, "Informe qual foi a nota do aluno no trabalho avaliativo: ", "Trabalho avaliativo", JOptionPane.QUESTION_MESSAGE);
            try {
                work = Double.parseDouble(workStr);
                isNumberValid = true;
                avaliations.add(work);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isNumberValid);


        int size = avaliations.size();
        double soma = 0;
        for (Double avaliation : avaliations) {
            soma += avaliation;
        }
        average = soma/size;
        String averageFormatted = String.format("%.2f", average);


        if (average >= 6) {
            JOptionPane.showMessageDialog(null, "Esse aluno está APROVADO! \nMédia final: " + averageFormatted, "Parabéns!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Esse aluno está REPROVADO! \nMédia final: " + averageFormatted, "Não foi dessa vez...", JOptionPane.ERROR_MESSAGE);
        }
    }
}
