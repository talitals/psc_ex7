import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o valor de um dos lados do quadrado: ");
        double ladoQuadrado =  console.nextDouble();

        double areaQuadrado = (ladoQuadrado * ladoQuadrado) * 2;

        System.out.printf("A área do quadrado em cm2 multiplicada por 2 é %.2f", areaQuadrado);

        console.close();
    }
}
