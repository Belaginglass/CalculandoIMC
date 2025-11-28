public class Pessoa implements PessoaInterface {

    private String sexo;
    private float altura;
    private float peso;

    public Pessoa(String sexo, float altura, float peso) {
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public float getAltura() {
        return altura;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    public float calcularIMC() {
        return peso / (altura * altura);
    }
}
