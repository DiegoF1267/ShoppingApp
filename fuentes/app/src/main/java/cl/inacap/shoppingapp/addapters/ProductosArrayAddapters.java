package cl.inacap.shoppingapp.addapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

import cl.inacap.shoppingapp.R;
import cl.inacap.shoppingapp.dto.Productos;

public class ProductosArrayAddapters extends ArrayAdapter<Productos> {
    private Activity activity;
    private List<Productos> productos;

    public ProductosArrayAddapters(@NonNull Activity context, int resource, @NonNull List<Productos> objects) {
        super(context, resource, objects);
        this.activity = context;
        this.productos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = this.activity.getLayoutInflater();
        View fila = inflater.inflate(R.layout.productos_list, null, true);
        TextView nombreTv = fila.findViewById(R.id.nombre_pro_lv);
        ImageView imagePro = fila.findViewById(R.id.imagen_pro_lv);
        Productos actual = productos.get(position);
        nombreTv.setText(actual.getNombre());
        Picasso.get().load(actual.getImagen()).resize(300, 300).centerCrop().into(imagePro);
        return fila;
    }
}
