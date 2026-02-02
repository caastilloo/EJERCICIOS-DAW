package TipoExamen1;

import java.lang.classfile.attribute.ModuleAttribute;
import java.time.LocalDate;

public class ProgramaMeLoApp {

    static void main() {

        Concurso iesmutxamel = new Concurso();
        System.out.println(iesmutxamel);

        Equipo maquinistas = new Equipo("Los maquinistas");
        System.out.println(maquinistas);

        System.out.println(maquinistas);

        maquinistas.añadirMiembros("Juan", "Alvaro");
        System.out.println(maquinistas);

        iesmutxamel.insertarEquipo(maquinistas);
        System.out.println(iesmutxamel);

        maquinistas.añadirMiembros("Jose", "Pablo");
        System.out.println(maquinistas);

        Equipo triunfitos = new Equipo("Los triunfitos");
        triunfitos.añadirMiembros("Elena", "Alberto", "Alejandro", "Maria");

        System.out.println();

        maquinistas.setProblemas_resueltos(3);
        System.out.println(maquinistas);

        triunfitos.setProblemas_resueltos(2);
        System.out.println(triunfitos);

        maquinistas.calcularPuntuacion();
        triunfitos.calcularPuntuacion();




//        maquinistas.añadirMiembros("Pablo", "Jose", "Alberto");
//        System.out.println(maquinistas);

    }

}
