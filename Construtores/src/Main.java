public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Picanha");

        Produto produto2 = new Produto("Arroz",40);

        Produto produto3 = new Produto();

        System.out.println();
        System.out.println(produto1.codigo);
        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);

        System.out.println();
        System.out.println(produto2.codigo);
        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);

        System.out.println();
        System.out.println(produto3.codigo);
        System.out.println(produto3.nome);
        System.out.println(produto3.quantidadeEstoque);
    }
}