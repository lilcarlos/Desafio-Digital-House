import java.util.Date;

public class Main {


    public static void main(String[] args) {


        DigitalHouseManager digital = new DigitalHouseManager();

        digital.registrarProfessorAdjunto("Joao", "Carlos",123,0);
        digital.registrarProfessorTitular("Felipe", "Martins", 321, "Matematica");


        digital.registrarCurso("Full Stack", 20001, 2);
        digital.registrarCurso("Full Stack", 20001, 2);
        digital.registrarCurso("Android", 20002, 2);

        System.out.println(digital.getListaCurso());


















    }
}
