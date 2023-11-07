import java.util.Arrays;

public class Main {
    public static int luckyNumber(String fecha ){
String[] fechas=fecha.split("-");


int suma=0;
        for (int i = 0; i <fechas.length ; i++) {
            suma += Integer.parseInt(fechas[i]);

        }
        String temp =String.valueOf(suma);
        fechas=temp.split("");
        suma=0;
        for (int i = 0; i < fechas.length ; i++) {
            suma += Integer.parseInt(fechas[i]);
        }
        temp= String.valueOf(suma);
        fechas=temp.split("");
        suma=0;
        for (int i = 0; i < fechas.length ; i++) {
            suma += Integer.parseInt(fechas[i]);
        }System.out.println(suma);
        return suma;

    }
    public static void main(String[] args) {
        luckyNumber("16-08-1973");
    }
}