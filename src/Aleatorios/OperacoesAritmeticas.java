package Aleatorios;

class OperacoesAritmeticas {
    private static int somar(int num1, int num2) {
        return num1 + num2;
    }
    private static int subtrair(int num1, int num2) {
        return num1 - num2;
    }
    private static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    private static int dividir(int num1, int num2) {
        return num1 / num2;
    }
    public static void main(String args[]){
        int x=10, y=3;
        System.out.printf("%d + %d = %d\n", x, y, somar(x, y));
        System.out.printf("%d - %d = %d\n", x, y, subtrair(x, y));
        System.out.printf("%d * %d = %d\n", x, y, multiplicar(x, y));
        System.out.printf("%d / %d = %d\n", x, y, dividir(x, y));
    }
}
