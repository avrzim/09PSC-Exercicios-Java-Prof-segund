public class Sayajin extends PersonagemDragonBall implements Transformavel {
    private int nivelMaximoSSJ;
    private boolean temRabo;

    public Sayajin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int nivelMaximoSSJ, boolean temRabo) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;
    }

    @Override
    public int calcularPoder() {
        return (int)(ki * (1 + nivelMaximoSSJ * 0.1));
    }

    @Override
    public void transformar(int nivel) {
        if (nivel <= 3 || (nivel <= 5 && (nome.equals("Goku") || nome.equals("Vegeta")))) {
            System.out.println(nome + " transformou em um super sayajin " + nivel);
        } else {
            System.out.println("Não foi possível transformar " + nome + " no super sayajin " + nivel);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Nível Máximo SSJ: " + nivelMaximoSSJ + ", Tem Rabo: " + temRabo;
    }

}