package data;

public class Main {

    public static void main(String[] args) {
        AutoEntrante elAuto = new AutoEntrante("202020", "Carlos Ramirez", "3000");
        AutoEntrante elAuto2 = new AutoEntrante("808080", "Marco Perez", "6000");
        AutoEntrante elAuto3 = new AutoEntrante("303030", "David Chaves", "7000");
        AutoEntrante elAuto4 = new AutoEntrante("505050", "Gustavo Gamboa", "9000");

        System.out.println("La placa del auto es: " + elAuto.getPlaca());
        System.out.println("El precio x hora es de: " + elAuto.getPrecioxhora());
        System.out.println("El nombre del propietario es: " + elAuto.getNombreDelPropietario());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("La placa del auto es: " + elAuto2.getPlaca());
        System.out.println("El precio x hora es de: " + elAuto2.getPrecioxhora());
        System.out.println("El nombre del propietario es: " + elAuto2.getNombreDelPropietario());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("La placa del auto es: " + elAuto3.getPlaca());
        System.out.println("El precio x hora es de: " + elAuto3.getPrecioxhora());
        System.out.println("El nombre del propietario es: " + elAuto3.getNombreDelPropietario());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("La placa del auto es: " + elAuto4.getPlaca());
        System.out.println("El precio x hora es de: " + elAuto4.getPrecioxhora());
        System.out.println("El nombre del propietario es: " + elAuto4.getNombreDelPropietario());
        System.out.println(" ");
        System.out.println(" ");
    }
}
