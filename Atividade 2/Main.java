public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.tinta = 100;
        c1.cor = "azul";
        c1.marca = "bic";

        Papel p1 = new Papel();
        p1.paginasV = 100;
        p1.papelU = 1;

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carrapato frenetico";
        pessoa.caneta = c1;
        pessoa.papel = p1;

        System.out.println(pessoa.nome + " está escrevendo...");
        pessoa.caneta.escrever();

        System.out.println("Total de páginas ainda disponíveis:");
        System.out.println(pessoa.nome + " usou " + p1.papelU + " páginas. Restam " + pessoa.papel.preencher_Papel(p1.papelU, p1.paginasV) + " páginas.");
    }
}
