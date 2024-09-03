public class Atividade11 {
    public static void main(String[] args) {
        double bonus = 0;
        double salbrutocomimposto = 0;
        double imposto = 0;
        Scanner brutinho = new Scanner(System.in);
        System.out.println("Informe seu salário bruto: ");
        double salarioBruto = brutinho.nextDouble();
        System.out.println("Quantos anos você foi escravo dessa empresa: ");
        int anos = brutinho.nextInt();
        if (anos >= 10) {
            bonus = salarioBruto * 0.10;
            double salbrutocombonus = salarioBruto + bonus;

        } else if (anos >= 5 && anos <= 10) {
            bonus = salarioBruto * 0.05;
            double salbrutocombonus = salarioBruto + bonus;

        } else {
            System.out.println("você ainda não tem bonificação");
        }

        if (salarioBruto >= 5000.00) {
            imposto = salarioBruto * 0.27;

        } else if (salarioBruto >= 3000.00 && salarioBruto < 5000.00) {
            imposto = salarioBruto * 0.18;
        } else {
            imposto = salarioBruto * 0.10;
        }

        salbrutocomimposto = salarioBruto - imposto;
        double salLiquido = salbrutocomimposto + bonus;
        System.out.println("O seu salário bruto é: " + salarioBruto + "$ seu bonus recido foi de: " + bonus + "$ o imposto descontado de seu salário bruto foi de: " + imposto + " e o seu salário liquído é de: " + salLiquido);

    }
}
