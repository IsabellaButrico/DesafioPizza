package rm77273.listview.exercicios.fiap.com.br.desafio;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by logonrm on 31/03/2017.
 */

public class PizzaActivity  extends AppCompatActivity {

        ImageView imgPizza;
        TextView txtNome;
        TextView txtValor;
            TextView txtIngredientes;
    TextView txtPontuacao;
        RatingBar ratingbar;






        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pizza);

            Pizza pizza = (Pizza) getIntent().getExtras().get("pizza");

            ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle(pizza.getDescricao());
            actionBar.setDisplayHomeAsUpEnabled(true);


            imgPizza = (ImageView)findViewById(R.id.imgPizza);
            txtNome = (TextView)findViewById(R.id.txtNomePizza);
            txtValor = (TextView)findViewById(R.id.txtValor);
            txtIngredientes = (TextView) findViewById(R.id.txtIngredientes);
            txtPontuacao = (TextView) findViewById(R.id.txtPontuacao);

            imgPizza.setImageResource(pizza.getImgpizza());
            txtNome.setText(pizza.getNome());
            txtValor.setText(pizza.getValorp());
            txtIngredientes.setText(pizza.getIngredientes());
            txtPontuacao.setText(pizza.getPontuacao());


        }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

