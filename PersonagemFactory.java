public class PersonagemFactory {
    public static Terraqueo criarKuririn() {
        return new Terraqueo("Kuririn", 35, "Masculino", "Z", 500, "Kienzan", "Terra", "Cidade do Oeste");
    }

    public static Sayajin criarGoku() {
        return new Sayajin("Goku", 40, "Masculino", "Z", 10000, "Kamehameha", 5, true);
    }

    public static Sayajin criarGohan() {
        return new Sayajin("Gohan", 25, "Masculino", "Z", 8000, "Masenko", 3, true);
    }

    public static Namekuseijin criarDende() {
        return new Namekuseijin("Dendê", 30, "Masculino", "Z", 2000, "Cura", 7, true);
    }
}