public class AnalisaIMC {

    public static String classificarIMC(String sexo, float peso, float altura) {

        float imc = peso / (altura * altura);

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

    public static String classificarIMC(PessoaInterface pessoa) {
        return classificarIMC(
                pessoa.getSexo(),
                pessoa.getPeso(),
                pessoa.getAltura()
        );
    }
}
