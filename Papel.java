public class Papel {
    String marca;
    int papelU, paginasV;

    public int preencher_Papel(int papelU, int paginasV) {
        paginasV -= papelU;
        return paginasV;
    }
}
