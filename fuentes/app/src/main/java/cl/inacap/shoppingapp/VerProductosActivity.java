package cl.inacap.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import cl.inacap.shoppingapp.dto.Productos;

public class VerProductosActivity extends AppCompatActivity {

    private TextView nombreTxt;
    private Toolbar toolbar;
    private ImageView imagen;
    private TextView desc;
    private TextView precio;
    private TextView titulo_toolbar;

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_productos);
        this.imagen = findViewById(R.id.img_prod_view);
        this.desc = findViewById(R.id.descripcion_prod_view);
        this.precio = findViewById(R.id.Precio_prod_view);
        this.toolbar = findViewById(R.id.toolbar);
        this.nombreTxt = findViewById(R.id.nombreProdTxt);
        this.titulo_toolbar = findViewById(R.id.titulo_toolbar);
        this.setSupportActionBar(this.toolbar);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        if (getIntent() != null) {
            Productos productos = (Productos) getIntent().getSerializableExtra("producto");
            this.nombreTxt.setText(productos.getNombre());
            this.titulo_toolbar.setText(productos.getNombre());
            Picasso.get().load(productos.getImagen()).resize(500, 500).centerCrop().into(this.imagen);
            this.desc.setText(productos.getDescripcion());
            this.precio.setText("$" + productos.getPrecio());
        }
    }
}