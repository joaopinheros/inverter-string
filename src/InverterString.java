import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma sequencia de String: ");
        String sequenciaString = scanner.next();
        scanner.close();
        String inverter = inverterString(sequenciaString);
        System.out.println("String original: " + sequenciaString);
        System.out.println("String invertida: " + inverter);
    }

    public static String inverterString(String input) {
        char[] arrayString = input.toCharArray();
        int i = 0;
        int j = arrayString.length - 1;

        while (i < j) {
            // Troca os caracteres de posição
            char aux = arrayString[i];
            arrayString[i] = arrayString[j];
            arrayString[j] = aux;

            // Avança para os próximos caracteres
            i++;
            j--;
        }
        return new String(arrayString);
    }
}
