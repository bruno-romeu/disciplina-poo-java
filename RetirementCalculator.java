import javax.swing.JOptionPane;

public class RetirementCalculator {
    /*
     * APOSENTADORIA POR IDADE (REGRA SIMPLES):
    Mulheres:
        Idade mínima: 62 anos
        Tempo mínimo de contribuição: 15 anos
    
    Homens:
        Idade mínima: 65 anos
        Tempo mínimo de contribuição: 20 anos

    
    * REGRA DE TRANSIÇÃO (QUEM JÁ CONTRIBUIA ANTES DA REFORMA):

    Mulheres:
        Pontuação mínima: 92 pontos
        Tempo mínimo de contribuição: 30 anos

    Homens:
        Pontuação mínima: 102 pontos
        Tempo mínimo de contribuição: 35 anos

    Fórmula dos pontos: Idade + Tempo de Contribuição = Pontuação


        
     */
    public static void main(String args[]) {
        int age = 0;
        String[] sex = {"Masculino", "Feminino"} ;
        String selectedSex;
        int contributionTime = 0;
        boolean isNumberValid = false;

        // variáveis para a segunda regra
        int points;

        do {
            String ageStr = JOptionPane.showInputDialog(null, "Quantos Anos você tem? ", "Idade", JOptionPane.QUESTION_MESSAGE);
            try {
                age = Integer.parseInt(ageStr);
                isNumberValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isNumberValid);
        isNumberValid = false;

        do {
            String contributionTimeStr = JOptionPane.showInputDialog(null, "Informe por quanto tempo você contribuiu (em anos): ", "Tempo de Contribuição", JOptionPane.QUESTION_MESSAGE);
            try {
                contributionTime = Integer.parseInt(contributionTimeStr);
                isNumberValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme um número válido para este campo!", "ERRO", JOptionPane.ERROR_MESSAGE );
            }
        } while (!isNumberValid);
        isNumberValid = false;

        int question = JOptionPane.showOptionDialog(null, "Para realizar o cálculo da aposentadoria, o sistema do INSS utiliza regras diferentes com base no sexo registrado em sua certidão de nascimento. \nPor favor, selecione a opção que devemos usar como base para a simulação: ", "Configuração da Simulação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sex, null);

        selectedSex = sex[question];
        System.out.println("Iniciando calculo...");
        System.out.printf("%s, %s anos, %s anos de contribuição.", selectedSex, age, contributionTime);

        ruleByAge(age, contributionTime, selectedSex);
    }

    public static void ruleByAge(int age, int contributionTime, String selectedSex) {
        if(selectedSex.equals("Masculino")) {
            int ageToRetirement = 65;
            int contributionToRetirement = 20;

            if(age >= ageToRetirement) {
                
                if (contributionTime >= contributionToRetirement) {
                    JOptionPane.showMessageDialog(null, "Você já pode se aposentar!", "PARABÉNS!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Você não cumpre com todos os requisitos de Tempo de Contribuição para se aposentar!", "Tente novamente ano que vem...", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você não cumpre com todos os requisitos de Idade para se aposentar!", "Tente novamente ano que vem...", JOptionPane.ERROR_MESSAGE);
            }
        } else if(selectedSex.equals("Feminino")) {
            int ageToRetirement = 62;
            int contributionToRetirement = 15;

            if(age >= ageToRetirement) {

                if(contributionTime >= contributionToRetirement) {
                    JOptionPane.showMessageDialog(null, "Você já pode se aposentar!", "PARABÉNS!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Você não cumpre com todos os requisitos de Tempo de Contribuição para se aposentar!", "Tente novamente ano que vem...", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você não cumpre com todos os requisitos de Idade para se aposentar!", "Tente novamente ano que vem...", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    public static void ruleByPoints(int age, int contributionTime, int points, String selectedSex) {
        // Regra de aposentadoria por pontos aqui...
    }

}
