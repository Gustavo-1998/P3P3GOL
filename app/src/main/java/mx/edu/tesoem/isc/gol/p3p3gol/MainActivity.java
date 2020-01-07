package mx.edu.tesoem.isc.gol.p3p3gol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvDatos);

        String[] arreglo = new String[]{"nom1","nom2","nom3","nom4"
                ,"nom5","nom6","nom7","nom8"
                ,"nom9","nom10","nom11","nom12","nom13"
                ,"nom14","nom15","nom16"
                ,"nom17","nom18","nom19"
                ,"nom20","nom21","nom22"
                ,"nom23","nom24","nom25"};
        ArrayAdapter adaptor = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
        gvdatos.setAdapter(adaptor);

    }
}
