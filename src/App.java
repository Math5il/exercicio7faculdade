import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner console = new Scanner(System.in);
        
        float lado = 0.0f;
        float areaQuadrado = 0.0f;
        float dobroAreaQuadrado = 0.0f;

        System.out.println("Por favor digite o valor do lado do quadrado:");
        lado = console.nextFloat();

        areaQuadrado = lado * lado;
        dobroAreaQuadrado = areaQuadrado * 2;

        System.out.println("O dobro da área do Quadrado é: " + dobroAreaQuadrado);
    }
}
