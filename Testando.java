public class Testando {
    public static void main(String[] args) {

        Sayajin goku = PersonagemFactory.criarGoku();
        Sayajin gohan = PersonagemFactory.criarGohan();
        Namekuseijin dende = PersonagemFactory.criarDende();
        Terraqueo kuririn = PersonagemFactory.criarKuririn();
        goku.transformar(5);

        gohan.transformar(5);
        gohan.transformar(3);

        String desejo = "Quero que o Fabricio me passe de semestre";
        String desejoNamekusei = dende.fazerDesejo(desejo);
        System.out.println("Dende fez o pedido: " + desejoNamekusei);

        System.out.println(kuririn.toString());
    }
}