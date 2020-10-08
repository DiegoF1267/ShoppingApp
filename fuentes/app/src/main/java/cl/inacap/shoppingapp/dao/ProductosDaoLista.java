package cl.inacap.shoppingapp.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.shoppingapp.dto.Productos;

public class ProductosDaoLista implements ProductosDAO {
    private List<Productos> productos = new ArrayList<>();
    private static ProductosDaoLista instancia;

    private ProductosDaoLista() {
        Productos p = new Productos();
        p.setNombre("coca cola zero");
        p.setDescripcion("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.");
        p.setPrecio(1000);
        p.setImagen("https://jumbo.vteximg.com.br/arquivos/ids/336745/Principal-3942.jpg?v=637237316746070000");
        productos.add(p);
        p = new Productos();
        p.setNombre("calcetines");
        p.setDescripcion("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.");
        p.setPrecio(3500);
        p.setImagen("https://andeslandchile.cl/wp-content/uploads/2020/07/58-510x510.jpg");
        productos.add(p);
        p = new Productos();
        p.setNombre("centella");
        p.setDescripcion("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.");
        p.setPrecio(500000);
        p.setImagen("https://jumbo.vteximg.com.br/arquivos/ids/323580/Helado-Centella-multipack-24-unid-50-ml-c-u-1-24150675.jpg?v=637148143639400000");
        productos.add(p);

    }

    public static ProductosDaoLista getInstance() {
        if (instancia == null) {
            instancia = new ProductosDaoLista();
        }
        return instancia;
    }

    @Override
    public List<Productos> getAll() {
        return productos;
    }

    @Override
    public Productos save(Productos p) {
        productos.add(p);
        return p;
    }
}
