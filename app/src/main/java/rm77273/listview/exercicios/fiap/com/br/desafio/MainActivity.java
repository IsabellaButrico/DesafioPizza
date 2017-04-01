package rm77273.listview.exercicios.fiap.com.br.desafio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    ListView lstPizza;
    List<Pizza> Pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Pizza = GerarPizza.geraPizza();
            lstPizza = (ListView) findViewById(R.id.lstPizza);
        final InfoPizza infoPizza = new InfoPizza(this, Pizza);
            lstPizza.setAdapter(infoPizza);


        lstPizza.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Pizza pizza = Pizza.get(i);

                Intent it = new Intent(MainActivity.this, PizzaActivity.class);
                it.putExtra("pizza", pizza);
                startActivity(it);
            }
        });


    }
}
