import javax.swing.JOptionPane;

public class RetirementCalculator {

    public static void main(String args[]) {
        int age = 0;
        String[] sex = {"Masculino", "Feminino"} ;
        String selectedSex;
        int contributionTime = 0;
        boolean isNumberValid = false;
        String [] options = {"Sim", "Não"};
        String selectedOption;

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

        int question1 = JOptionPane.showOptionDialog(null, "Para realizar o cálculo da aposentadoria, o sistema do INSS utiliza regras diferentes com base no sexo registrado em sua certidão de nascimento. \nPor favor, selecione a opção que devemos usar como base para a simulação: ", "Configuração da Simulação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sex, null);

        int question2 = JOptionPane.showOptionDialog(null, "Para sabermos quais regras se aplicam a você, por favor, responda: \\n\\nVocê já contribuía para a Previdência (INSS) antes de 13 de novembro de 2019?", "Análise da regra", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);

        selectedSex = sex[question1];
        selectedOption = options[question2];
        System.out.println("Iniciando calculo...");
        System.out.printf("%s, %s anos, %s anos de contribuição.", selectedSex, age, contributionTime);

        ruleByAge(age, contributionTime, selectedSex);

        if(selectedOption.contains("Sim")) {

            ruleByPoints(age, contributionTime, selectedSex);

        }
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


    public static void ruleByPoints(int age, int contributionTime, String selectedSex) {

        if(selectedSex.equals("Masculino")) {
            int pointsToRetirement = 102;
            int contributionToRetirement = 35;

            int points = age + contributionTime;

            if(points >= pointsToRetirement) {
                if(contributionTime >= contributionToRetirement) {
                    JOptionPane.showMessageDialog(null, "Você já pode se aposentar!", "PARABÉNS!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Você não cumpre com todos os requisitos de Tempo de Contribuição para se aposentar!", "Tente novamente ano que vem...", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você não cumpre com todos os requisitos de Pontos para se aposentar!", "Tente novamente ano que vem...", JOptionPane.ERROR_MESSAGE);
            }
        } else if (selectedSex.contains("Feminino")) {
            int pointsToRetirement = 92;
            int contributionToRetirement = 30;

            int points = age + contributionTime;

            if(points >= pointsToRetirement) {
                if(contributionTime >= contributionToRetirement) {
                    JOptionPane.showMessageDialog(null, "Você já pode se aposentar!", "PARABÉNS!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Você não cumpre com todos os requisitos de Tempo de Contribuição para se aposentar!", "Tente novamente ano que vem...", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você não cumpre com todos os requisitos de Pontos para se aposentar!", "Tente novamente ano que vem...", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

}
