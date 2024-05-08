import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        /*
        1 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
        */

        int numero1, numero2;
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma dos numeros é: " + soma);

        /*
        2 - Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
        */

        double A, R, pi = 3.14159;

        R = sc.nextDouble();

        A = pi * R * R;
        System.out.printf("O valor do raio do circulo é: %.4f\n", A);

        /*
        3 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        */

        int a, b, c, d, somaDados;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc. nextInt();
        d = sc.nextInt();
        somaDados = a * b - (c * d);
        System.out.println("A diferença dos numeros inteiros digitados é: " + somaDados);

        /*
        4 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.
        */
        
        int numeroFunc;
        double horasFunc, calculaSalario, salario;

        numeroFunc = sc.nextInt();
        horasFunc = sc.nextDouble();
        salario = sc.nextDouble();
        calculaSalario = (double) horasFunc * salario;

        System.out.println("Number: " + numeroFunc);
        System.err.printf("Salary: %.2f\n", calculaSalario);

        /*
        5 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        */
        int codPeça1, numPeças1, codPeça2, numPeças2;
        double valorPeça1, valorPeça2, somaPeças1, somaPeças2, valorAPagar;

        codPeça1 = sc.nextInt();
        numPeças1 = sc.nextInt();
        valorPeça1 = sc.nextDouble();
        somaPeças1 = (double) numPeças1 * valorPeça1;

        codPeça2 = sc.nextInt();
        numPeças2 = sc.nextInt();
        valorPeça2 = sc.nextDouble();
        somaPeças2 = (double) numPeças2 * valorPeça2;

        valorAPagar = somaPeças1 + somaPeças2;

        System.out.printf("O código das peças escolhidas são " + codPeça1 + " e " + codPeça2 + " e total a Pagar é: $ %.2f\n", valorAPagar);

        /*
        6 - Fazer um programa que leia três valores com ponto flutuante de dupla precisão: G, H e I. Em seguida, calcule e 
        mostre: 
        a) a área do triângulo retângulo que tem A por base e I por altura. 
        b) a área do círculo de raio I. (pi = 3.14159) 
        c) a área do trapézio que tem G e H por bases e I por altura. 
        d) a área do quadrado que tem lado H. 
        e) a área do retângulo que tem lados G e H.
        */

        float G, H, I;
        double valorDePi = 3.14159;

        G = sc.nextFloat();
        H = sc.nextFloat();
        I = sc.nextFloat();

        float trianguloRet = (G * I) / 2;
        float areaCirculo = (float) valorDePi * I * I;
        float trapezio = (G + H) * I / 2;
        float quadrado = H * H;
        float retangulo = G * H;

        System.out.printf("A area do TRIANGULO: %.3f\n", trianguloRet);
        System.out.printf("A area do CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("A area do TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("A area do QUADRADO: %.3f\n", quadrado);
        System.out.printf("A area do RETANGULO: %.3f\n", retangulo);

        sc.close();

    }
}
