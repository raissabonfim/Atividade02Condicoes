public class Atividade04 {
    public static void main(String[] args) {
        String usuario = "kratos";
        String senha = "kratos123";
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu usuario");

        String usuarioinf = scanner.nextLine();

        System.out.println("Digite sua senha");
        String senhainf = scanner.nextLine();

        if (usuario.equals(usuarioinf) && senha.equals(senhainf)) {
            System.out.println("Você teve sucesso ");
        } else {
            System.out.println("uusuario ou senha estão incorretos ");
        }
        scanner.close();
    }
}

