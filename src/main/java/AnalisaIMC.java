public class AnalisaIMC {

    public static float calculaIMC(float peso, float altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(float peso, float altura, String sexo) {
        float imc = calculaIMC(peso, altura);

        if (sexo.equalsIgnoreCase("homem")) {
            if (imc < 20.7) return "Abaixo do peso";
            else if (imc < 26.4) return "Peso normal";
            else if (imc < 27.8) return "Marginalmente Acima do Peso Ideal";
            else if (imc < 31.1) return "Acima do Peso Ideal";
            else return "Obeso";
        } else if (sexo.equalsIgnoreCase("mulher")) {
            if (imc < 19.1) return "Abaixo do peso";
            else if (imc < 25.8) return "Peso normal";
            else if (imc < 27.3) return "Marginalmente Acima do Peso Ideal";
            else if (imc < 32.3) return "Acima do Peso Ideal";
            else return "Obeso";
        } else {
            return "Sexo inválido";
        }
    }

    public static void main(String[] args) {
        float peso = 70;
        float altura = 1.40F;

        System.out.println("Homem: " + classificarIMC(peso, altura, "homem"));
        System.out.println("Mulher: " + classificarIMC(peso, altura, "mulher"));
    }


    public static String classificarIMC(PessoaInterface p) {
        float imc = calculaIMC(p.getPeso(), p.getAltura());
        if (p.getSexo().equalsIgnoreCase("homem")) {
            if (imc < 20.7) return "Abaixo do peso";
            else if (imc < 26.4) return "Peso normal";
            else if (imc < 27.8) return "Marginalmente Acima do Peso Ideal";
            else if (imc < 31.1) return "Acima do Peso Ideal";
            else return "Obeso";
        } else if (p.getSexo().equalsIgnoreCase("mulher")) {
            if (imc < 19.1) return "Abaixo do peso";
            else if (imc < 25.8) return "Peso normal";
            else if (imc < 27.3) return "Marginalmente Acima do Peso Ideal";
            else if (imc < 32.3) return "Acima do Peso Ideal";
            else return "Obeso";
        } else {
            return "Sexo inválido";
        }
    }
}
