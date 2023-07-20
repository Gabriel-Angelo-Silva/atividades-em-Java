public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.tinta = 100;
        c1.cor = "azul";
        c1.marca = "bic";
        c1.escrever();
        
        Papel p1 = new Papel();
        p1.paginasV = 100;
        p1.papelU = 1;
        p1.marca = "Caderno Daora 2";
        System.out.println("Total de paginas ainda disponivel");
        System.out.println(p1.preencher_Papel(p1.papelU, p1.paginasV));
    }
}

class Caneta {
    String cor, marca;
    int tinta;
    public void escrever() {
        System.out.println("Escrevendo...");
        System.out.println("Escrito");
    }
}

class Papel {
    String marca;
    int papelU, paginasV;
    public int preencher_Papel(int papelU, int paginasV) {
        paginasV -= papelU;
        return paginasV;
    }
}
