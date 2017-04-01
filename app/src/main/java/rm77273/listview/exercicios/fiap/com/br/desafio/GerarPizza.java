package rm77273.listview.exercicios.fiap.com.br.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GerarPizza {

        public static List<Pizza> geraPizza(){

            List<Pizza> pizza = new ArrayList<>();

            Pizza pizza1 = new Pizza ("Queijo" , "Massa e queijo", "\"Ingredientes \\n\" +\n" +
                    "                \"\\n 250 gramas de farinha de trigo \\n\" +\n" +
                    "                \"\\n 1 e 1/2 copo de água ou leite \\n\" +\n" +
                    "                \"\\n 1 tablete ou 3 colheres de fermento \\n\" +\n" +
                    "                \"\\n 3 colheres (sopa) de azeite de oliva \\n\" +\n" +
                    "                \"\\n 3 tomates \\n\" +\n" +
                    "                \"\\n Pimenta, sal e orégano a gosto e azeitonas. \\n\",", "Ótima", "Lactose", R.drawable.queijo, "R$ 12,90");

            Pizza pizza2 = new Pizza ("Calabresa" , "Massa e calabresa", "\"Ingredientes \" +\n" +
                    "                \"\\n 1 disco de massa de pizza preassado \\n\" +\n" +
                    "                \"\\n 2 linguiça calabresa defumada cortadas em rodelas \\n\" +\n" +
                    "                \"\\n 4 tomate em rodelas \\n\" +\n" +
                    "                \"\\n 150 gramas de queijo mussarela \\n \" +\n" +
                    "                \"\\n 3 colheres (sopa) de molho de tomate \\n\" +\n" +
                    "                \"\\n cebola fatiada a gosto \\n\" +\n" +
                    "                \"\\n azeitona a gosto \\n\" +\n" +
                    "                \"\\n orégano a gosto \\n\",", "Ótima", "Nenhuma", R.drawable.calabresa, "R$ 12,90");

            Pizza pizza3 = new Pizza ("Frango" , "Massa e Frango", " \"Ingredientes \\n \" +\n" +
                    "                \"\\n 2 xícaras de água \\n\" +\n" +
                    "                \"\\n 1 massa de pizza \\n\" +\n" +
                    "                \"\\n 1 colher de orégano \\n\" +\n" +
                    "                \"\\n 400g de peito de frango \\n\" +\n" +
                    "                \"\\n 1 pitada de sal \\n\" +\n" +
                    "                \"\\n 1 colher de salsa \\n\" +\n" +
                    "                \"\\n 4 tomates \\n\",", "Ótima", "Nenhuma", R.drawable.frango, "R$ 12,90");

            Pizza pizza4 = new Pizza ("Marguerita" , "Massa e Manjericão", "280 g de molho de tomate.\n" +
                    " \"\\n 450 g de queijo mussarela ralado.\n" +
                    " \"\\n 1/2 xícara de queijo parmesão ralado.\n" +
                    " \"\\n 1/4 xícara de manjericão fresco picado.\n" +
                    " \"\\n 1 colher (sopa) de orégano seco.\n" +
                    " \"\\n 1 colher (chá) de pimenta calabresa.\n" +
                    " \"\\n 2 colheres (sopa) de azeite.", "Ótima", "Nenhuma", R.drawable.marguerita, "R$ 12,90");

            Pizza pizza5 = new Pizza ("Portuguesa" , "Massa e portuguesa", "150 g de queijo mussarela.\n" +
                    " \"\\n 50 g de presunto.\n" +
                    " \"\\n 1 tomate em rodelas.\n" +
                    " \"\\n 1 ovo cozido.\n" +
                    " \"\\n 1 cebola picada.\n" +
                    " \"\\n Molho de tomate.\n" +
                    " \"\\n Azeitonas para decorar, orégano e tempero verde a gosto", "Ótima", "Nenhuma", R.drawable.portuguesa, "R$ 12,90");

            Pizza pizza6 = new Pizza ("Chocolate" , "Massa e chocolate", "chocolate ou no micro ou em banho-maria, e depois junte com o creme de leite (sem soro)." +
                    "", "Ótima", "Nenhuma", R.drawable.brigadeiro, "R$ 12,90");

            pizza.add(pizza1);
            pizza.add(pizza2);
            pizza.add(pizza3);
            pizza.add(pizza4);
            pizza.add(pizza5);
            pizza.add(pizza6);

            return pizza;
        }


}
