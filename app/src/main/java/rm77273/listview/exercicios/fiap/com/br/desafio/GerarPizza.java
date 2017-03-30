package rm77273.listview.exercicios.fiap.com.br.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GerarPizza {

        public static List<Pizza> geraPizza(){

            List<Pizza> pizza = new ArrayList<>();

            Pizza pizza1 = new Pizza ("Queijo" , "Massa e queijo", "Queijo", "Ótima", "Lactose", R.drawable.queijo);
            Pizza pizza2 = new Pizza ("Calabresa" , "Massa e calabresa", "Calabresa", "Ótima", "Nenhuma", R.drawable.calabresa);
            Pizza pizza3 = new Pizza ("Frango" , "Massa e Frango", "Frango", "Ótima", "Nenhuma", R.drawable.frango);
            Pizza pizza4 = new Pizza ("Marguerita" , "Massa e Manjericão", "Manjericão", "Ótima", "Nenhuma", R.drawable.marguerita);
            Pizza pizza5 = new Pizza ("Portuguesa" , "Massa e portuguesa", "Portuguesa", "Ótima", "Nenhuma", R.drawable.portuguesa);
            Pizza pizza6 = new Pizza ("Chocolate" , "Massa e chocolate", "Chocolate", "Ótima", "Nenhuma", R.drawable.brigadeiro);

            pizza.add(pizza1);
            pizza.add(pizza2);
            pizza.add(pizza3);
            pizza.add(pizza4);
            pizza.add(pizza5);
            pizza.add(pizza6);

            return pizza;
        }


}
