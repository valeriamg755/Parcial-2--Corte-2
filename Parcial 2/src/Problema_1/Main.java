package Problema_1;

public class Main {
    public static void main(String[] args) {
        Vestuario blusa = Vestuario.BLUSA;
        System.out.println("La " + blusa.getNombre() + " está en el estante " + blusa.getNumeroestante());
        blusa.mostrarDescripcionPrenda();

        Vestuario jean = Vestuario.JEAN;
        System.out.println("El " + jean.getNombre() + " está en el estante " + jean.getNumeroestante());
        jean.mostrarDescripcionPrenda();

        Vestuario camiseta = Vestuario.CAMISETA;
        System.out.println("La " + camiseta.getNombre() + " está en el estante " + camiseta.getNumeroestante());
        camiseta.mostrarDescripcionPrenda();

        Vestuario camisa = Vestuario.CAMISA;
        System.out.println("La " + camisa.getNombre() + " está en el estante " + camisa.getNumeroestante());
        camisa.mostrarDescripcionPrenda();
    }
}