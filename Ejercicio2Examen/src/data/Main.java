package data;

public class Main {

    public static void main(String[] args) {
        Parquimetro elParquimetro = new Parquimetro("San José", "2000", "Andrés Artavia");
        Parquimetro elParquimetro2 = new Parquimetro("Heredia", "8000", "Jesús Jimenez");
        Parquimetro elParquimetro3 = new Parquimetro("Alajuela", "1000", "Carlos Badilla");
        Parquimetro elParquimetro4 = new Parquimetro("Limón", "500", "Daniel Gutiérrez");

        System.out.println("El parquiemtro 1 está ubicado en: " + elParquimetro.getLocalizacion());
        System.out.println("El precio x hora es de: " + elParquimetro.getPrecioxhora());
        System.out.println("El supervisor del parqueo es: " + elParquimetro.getSupervisor());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("El parquiemtro 1 está ubicado en: " + elParquimetro2.getLocalizacion());
        System.out.println("El precio x hora es de: " + elParquimetro2.getPrecioxhora());
        System.out.println("El supervisor del parqueo es: " + elParquimetro2.getSupervisor());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("El parquiemtro 1 está ubicado en: " + elParquimetro3.getLocalizacion());
        System.out.println("El precio x hora es de: " + elParquimetro3.getPrecioxhora());
        System.out.println("El supervisor del parqueo es: " + elParquimetro3.getSupervisor());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("El parquiemtro 1 está ubicado en: " + elParquimetro4.getLocalizacion());
        System.out.println("El precio x hora es de: " + elParquimetro4.getPrecioxhora());
        System.out.println("El supervisor del parqueo es: " + elParquimetro4.getSupervisor());
    }
}
