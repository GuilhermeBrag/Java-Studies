import java.util.ArrayList;
import java.util.Arrays;

public class Cardapio {

//    ItemCardapio[] itens = new ItemCardapio[0];
    ArrayList<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
//        itens = Arrays.copyOf(itens, itens.length + 1);
//        itens[itens.length - 1] = item;
        itens.add(item);
    }

    void removerItem(int indice) {
//        ItemCardapio[] novosItens = new ItemCardapio[itens.length - 1];
//
//        System.arraycopy(itens, 0, novosItens, 0, indice);
//        System.arraycopy(itens, indice + 1,
//                novosItens, indice, novosItens.length - indice);
//
//        itens = novosItens;
        itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

}