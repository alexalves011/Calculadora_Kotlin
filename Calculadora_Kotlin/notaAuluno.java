import java.util.Scanner;


public class notaAuluno {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();



        double media = (nota1 + nota2 ) / 2;

        System.out.println("A média das notas é: " + media);

        if (media >= 9.0) {
            System.out.println("Exelente! Você foi tirou A.");
        } else if (media >= 7.0) {
            System.out.println("Bom Você tirou B.");
        } else  if (media >= 5.0) {
            System.out.println("Regular. Você tirou C");
        } else {
            System.out.println("Reprovado. Você tirou D");
        }
    }
}
