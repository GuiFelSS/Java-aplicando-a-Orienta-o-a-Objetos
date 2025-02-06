
public class Main {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.andDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.andDeLancamento);
    }
}