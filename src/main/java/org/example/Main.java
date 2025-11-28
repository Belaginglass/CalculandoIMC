public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("homem", 1.80f, 85f);

        System.out.println("IMC: " + p.calcularIMC());
        System.out.println("Classificação: " + AnalisaIMC.classificarIMC(p));
    }
}
