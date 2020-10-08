package cl.inacap.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
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
        productos = prodDAO.getAll();
        adaptador = new ProductosArrayAddapters(this, R.layout.productos_list, productos);
        productos_lv = findViewById(R.id.productos_lv);
        productos_lv.setAdapter(adaptador);
        //        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar));


    }
}