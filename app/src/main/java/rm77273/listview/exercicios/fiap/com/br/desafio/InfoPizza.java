package rm77273.listview.exercicios.fiap.com.br.desafio;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

/**
 * Created by logonrm on 30/03/2017.
 */

public class InfoPizza extends BaseAdapter{

    Context context;
    List<Pizza> pizza;

        public InfoPizza(Context context, List<Pizza> pizza){

            this.context = context;
            this.pizza = pizza;
        }

    public int getCount(){

        return this.pizza.size();
    }

    public Object getItem(int i){

        return (Object)this.pizza.get(i);
    }

    public long getItemId(int i){
            return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup){

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Pizza pizza = this.pizza.get(i);

       // View v = layoutInflater.from(this.context).inflate(R.layout.listview_pizza, null);
        View v = layoutInflater.inflate(R.layout.listview_pizza, null);

        ImageView imageView = (ImageView) v.findViewById(R.id.Pizza1);
        TextView txtNomePizza = (TextView) v.findViewById(R.id.txtNomePizza);
        TextView txtValor = (TextView) v.findViewById(R.id.txtValor);



        imageView.setImageResource(pizza.getImgpizza());
        txtNomePizza.setText(pizza.getNome());
        txtValor.setText(pizza.getValorp());


        return v;





    }

}
