public class App {
    public static void main(String[] args) throws Exception {
        double media = calcularMedia(7.6, 8.9, 7.0);

        if (media >= 7.0){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }

        potenciacao(2, 5);
    }

    public static double calcularMedia(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3) / 3.0;
        return media;
    }

    public static double potenciacao(int base, int potencia){
        return Math.pow(base, potencia);
    }
}
