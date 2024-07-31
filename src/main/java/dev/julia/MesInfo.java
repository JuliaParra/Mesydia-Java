package dev.julia;



public class MesInfo {

    public static String obtenerNombreDelMes(int numeroDeMes) {
        switch (numeroDeMes) {
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Mes inválido";
        }
    }

    public static int obtenerDiasDelMes(int numeroDeMes) {
        switch (numeroDeMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; 
            default:
                return -1; 
        }
    }

    public static void main(String[] args) {
        int numeroDeMes = 4; 
        System.out.println("Mes: " + obtenerNombreDelMes(numeroDeMes));
        System.out.println("Días: " + obtenerDiasDelMes(numeroDeMes));
    }
}


