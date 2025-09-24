import javax.swing.*;

public class ResistanceCircuit {

    public static void main(String[] args) {

        double resistance1 = 0, resistance2 = 0, resistance3 = 0, resistance4 = 0;
        boolean isNumberValid = false;

        do {
            String resistance1Str = JOptionPane.showInputDialog(null, "Informe Informe o valor da primeira resistência: ", "Primeira Resistência", JOptionPane.QUESTION_MESSAGE);
            try {
                resistance1 = Double.parseDouble(resistance1Str);
                isNumberValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isNumberValid);
        isNumberValid = false;

        do {
            String resistance2Str = JOptionPane.showInputDialog(null, "Informe Informe o valor da segunda resistência: ", "Segunda Resistência", JOptionPane.QUESTION_MESSAGE);
            try {
                resistance2 = Double.parseDouble(resistance2Str);
                isNumberValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isNumberValid);
        isNumberValid = false;

        do {
            String resistance3Str = JOptionPane.showInputDialog(null, "Informe Informe o valor da terceira resistência: ", "Terceira Resistência", JOptionPane.QUESTION_MESSAGE);
            try {
                resistance3 = Double.parseDouble(resistance3Str);
                isNumberValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isNumberValid);
        isNumberValid = false;

        do {
            String resistance4Str = JOptionPane.showInputDialog(null, "Informe Informe o valor da quarta resistência: ", "Quarta Resistência", JOptionPane.QUESTION_MESSAGE);
            try {
                resistance4 = Double.parseDouble(resistance4Str);
                isNumberValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isNumberValid);
        isNumberValid = false;

        double equivalent = resistance1+resistance2+resistance3+resistance4;
        double max = Math.max(resistance1, Math.max(resistance2, Math.max(resistance3, resistance4)));
        double min = Math.min(resistance1, Math.min(resistance2, Math.min(resistance3, resistance4)));

        JOptionPane.showMessageDialog(null, "Resistência Equivalente: " + equivalent + "\nMaior Resistência: " + max + "\nMenor Resistência: " + min, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}