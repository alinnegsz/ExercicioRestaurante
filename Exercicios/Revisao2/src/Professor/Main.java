package Professor;

public class Main {
    public static void main(String[] args) {
        Membro membro = new Membro("Alinne Gomes", "BP3012794");
        Membro membro2 = new Membro("Alessandra Maia", "BP3010714");

        Comissao comissao = new Comissao(10);

        System.out.println("\nTestando método toString():");
        System.out.println(membro.toString());
        System.out.println(membro2.toString());

        comissao.adicionarMembro(membro);
        
        System.out.println("\nListando membros da comissão:");
        comissao.listarMembros();

        System.out.println("\nPesquisando membros: ");
        comissao.pesquisarMembro("Alinne Gomes");
        comissao.pesquisarMembro("Alessandra Maia");
    }
}
