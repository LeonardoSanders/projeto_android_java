package conceitos_basicos;

public class Estrutura_Switch {
    public static void main(String[] args) {
        
        int opcoes = 3;

        switch (opcoes) {
            case 1:
                System.out.println("Abra sua conta");
                break;

            case 2:
                System.out.println("Fatura de Cartão");
                break;

            case 3:
                System.out.println("Crédito imobiliário");
                break;
        
            default:
                System.out.println("Escolha uma opção válida!");
        }
    }
}
