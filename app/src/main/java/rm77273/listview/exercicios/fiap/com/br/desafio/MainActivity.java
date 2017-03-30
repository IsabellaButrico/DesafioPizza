package rm77273.listview.exercicios.fiap.com.br.desafio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
            InfoPizza infoPizza = new InfoPizza(this, Pizza);
            lstPizza.setAdapter(infoPizza);




    }
}
