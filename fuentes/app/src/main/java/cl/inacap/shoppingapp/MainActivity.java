package cl.inacap.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import cl.inacap.shoppingapp.addapters.ProductosArrayAddapters;
import cl.inacap.shoppingapp.dao.ProductosDAO;
import cl.inacap.shoppingapp.dao.ProductosDaoLista;
import cl.inacap.shoppingapp.dto.Productos;

public class MainActivity extends AppCompatActivity {

    private ListView productos_lv;
    private List<Productos> productos;
    private ProductosArrayAddapters adaptador;
    private ProductosDAO prodDAO = ProductosDaoLista.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        productos = prodDAO.getAll();
        adaptador = new ProductosArrayAddapters(this, R.layout.productos_list, productos);
        productos_lv = findViewById(R.id.productos_lv);
        productos_lv.setAdapter(adaptador);
        productos_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,VerProductosActivity.class);
                Productos prodActual = productos.get(i);
                intent.putExtra("producto",prodActual);
                startActivity(intent);
            }
        });


    }
}