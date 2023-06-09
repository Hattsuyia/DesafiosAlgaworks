package restaurante;

import java.util.Arrays;

public class Cardapio {
    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        //implementar inclusão de item do cardápio
        this.itens = Arrays.copyOf(this.itens, this.itens.length+1);
        this.itens[itens.length-1] = item;
    }

    void removerItem(int indice) {
        //implementar exclusão de item do cardápio da posição informada
        ItemCardapio[] novoItem = new ItemCardapio[itens.length-1];
        System.arraycopy(itens, 0, novoItem, 0, indice);
        System.arraycopy(itens, indice+1, novoItem, indice, novoItem.length-indice);

        itens = novoItem;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        //implementar código para imprimir na console os itens
        //do cardápio que estiverem entre o preço mínimo e máximo
        for (ItemCardapio item : itens) {
            if(item.possuiPrecoEntre(precoMinimo, precoMaximo)){
                item.imprimir();
            }
        }
    }
}
