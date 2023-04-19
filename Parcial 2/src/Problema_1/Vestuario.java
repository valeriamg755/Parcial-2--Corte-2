package Problema_1;

public enum Vestuario {
    BLUSA("Blusa", "casual y fresca", 111) {
        @Override
        public void mostrarDescripcionPrenda() {
            System.out.println("La " + getNombre() + " es una prenda que se describe como " + getDescripcion());
        }
    },
    JEAN("Jean", "para cualquier gusto", 222) {
        @Override
        public void mostrarDescripcionPrenda() {
            System.out.println("El " + getNombre() + " es una prenda cómoda y versátil que se utiliza " + getDescripcion());
        }
    },
    CAMISETA("Camiseta", "unisex, infinidad de colores y diseños", 333) {
        @Override
        public void mostrarDescripcionPrenda() {
            System.out.println("La " + getNombre() + " es una prenda informal " + getDescripcion());
        }
    },
    CAMISA("Camisa", "comunmente usada por hombres", 444) {
        @Override
        public void mostrarDescripcionPrenda() {
            System.out.println("La " + getNombre() + " es una prenda formal " + getDescripcion());
        }
    };

    private final String nombre;
    private final String descripcion;
    private final int numeroestante;

    Vestuario(String nombre, String descripcion, int numeroestante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroestante = numeroestante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroestante() {
        return numeroestante;
    }

    public abstract void mostrarDescripcionPrenda();
}