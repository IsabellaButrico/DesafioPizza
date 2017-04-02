package rm77273.listview.exercicios.fiap.com.br.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GerarPizza {

        public static List<Pizza> geraPizza(){

            List<Pizza> pizza = new ArrayList<>();

            Pizza pizza1 = new Pizza ("Queijo" , "Massa e queijo",
                    " farinha de trigo, Água ou leite, Fermento, Azeite de oliva ,Tomates, Azeitonas.", "Ótima", "Lactose", R.drawable.queijo, "R$ 12,90");

            Pizza pizza2 = new Pizza ("Calabresa" , "Massa e calabresa",
                    "Massa de pizza preassado, Linguiça calabresa defumada cortadas em rodelas, Tomate em rodelas, Queijo mussarela, Molho de tomate, Cebola," +
                    "Azeitona, Orégano a gosto. ", "Ótima", "Pode Causar Alergia", R.drawable.calabresa, "R$ 12,90");

            Pizza pizza3 = new Pizza ("Frango" , "Massa e Frango",
                    " Água, Massa de pizza, Orégano, Peito de frango, Pitada de sal, Colher de salsa, Tomates.", "Ótima", "Pode Causar Alergia", R.drawable.frango, "R$ 12,90");

            Pizza pizza4 = new Pizza ("Marguerita" , "Massa e Manjericão", "Molho de tomate." +
                    " Queijo mussarela ralado. Queijo parmesão ralado. Manjericão fresco picado. Orégano seco. Pimenta calabresa." +
                    " Azeite.", "Ótima", "Pode Causar Alergia", R.drawable.marguerita, "R$ 12,90");

            Pizza pizza5 = new Pizza ("Portuguesa" , "Massa e portuguesa", "Queijo mussarela." +
                    " Presunto. Tomate em rodelas. Ovo cozido. Cebola picada. Molho de tomate." +
                    " Azeitonas para decorar, orégano e tempero verde a gosto", "Ótima", "Pode Causar Alergia", R.drawable.portuguesa, "R$ 12,90");

            Pizza pizza6 = new Pizza ("Chocolate" , "Massa e chocolate", "chocolate com creme de leite (sem soro)." +
                    "", "Ótima", "Pode Causar Alergia", R.drawable.brigadeiro, "R$ 12,90");

            pizza.add(pizza1);
            pizza.add(pizza2);
            pizza.add(pizza3);
            pizza.add(pizza4);
            pizza.add(pizza5);
            pizza.add(pizza6);

            return pizza;
        }


}
