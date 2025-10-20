package org.example;

public class CosasSwitch {

    static void main() {

        char dia_de_la_semana = 'X';

        switch (dia_de_la_semana){

            case 'L':
            case 'M':
            case 'X':
            case 'J':
            case 'V':
                System.out.println("Entre semana");
                break;
            case 'S':
            case 'D':
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }

//        int dia_de_la_semana = 6;
//
//        switch (dia_de_la_semana){
//
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Entre semana");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Fin de semana");
//                break;
//            default:
//                System.out.println("Día no válido");
//                break;
//        }

//        switch (dia_de_la_semana){
//
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miércoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//                break;
//            case 5:
//                System.out.println("Viernes");
//                System.out.println("Entre semana");
//                break;
//            case 6:
//                System.out.println("Sábado");
//            case 7:
//                System.out.println("Domingo");
//            default:
//                System.out.println("Día no válido");
//                break;
//        }


    }
}
