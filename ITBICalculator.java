import javax.swing.JOptionPane;

public class ITBICalculator {
    public static void main(String args[]) {
        double transactionValue = 0, marketValue = 0, aliquot = 0;
        boolean isValid = false;

        do {
            String transactionValueStr = JOptionPane.showInputDialog(null, "Informe o Valor de Transação do Imóvel: ");
            try {
                transactionValue = Double.parseDouble(transactionValueStr);
                isValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isValid);

        isValid = false;
        do {
            String marketValueStr = JOptionPane.showInputDialog(null, "Informe o Valor Venal do Imóvel: ");
            try {
                marketValue = Double.parseDouble(marketValueStr);
                isValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isValid);

        isValid = false;
        do {
            String aliquotStr = JOptionPane.showInputDialog(null, "Informe a porcentagem do imposto ITBI: ");
            try {
                aliquot = Double.parseDouble(aliquotStr);
                isValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isValid);

        double percentage = aliquot / 100;
        double finalValue = Math.max(transactionValue, marketValue);
        double calc = finalValue * percentage;

        JOptionPane.showMessageDialog(null, "Valor do Imóvel (Maior valor entre Transação e Venal): R$"+ finalValue + "\nImposto ITBI: "+ aliquot + "% \nValor do imposto a ser cobrado: " + calc);


    }
}