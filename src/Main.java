import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a sua primeira nota");
        double a = s.nextInt();
        System.out.println("Digite a sua segunda nota");
        double b = s.nextInt();
        System.out.println("Digite a sua terceira nota");
        double c = s.nextInt();
        System.out.println("Digite a sua quarta nota");
        double d = s.nextInt();
        double media = (a+b+c+d)/4;
        String avaliacaoMedia = verificarNotas(media);
        System.out.println(avaliacaoMedia);
    }

    public static String verificarNotas(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else  if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}