package dev.julia;



public class MesInfo {

    public static String obtenerNombreDelMes(int numeroDeMes) {
        return switch (numeroDeMes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Mes inválido";
        };
    }

    public static int obtenerDiasDelMes(int numeroDeMes) {
        return switch (numeroDeMes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int numeroDeMes = 4; 
        System.out.println("Mes: " + obtenerNombreDelMes(numeroDeMes));
        System.out.println("Días: " + obtenerDiasDelMes(numeroDeMes));
    }
}


