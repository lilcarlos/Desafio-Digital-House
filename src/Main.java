import java.util.Date;

public class Main {


    public static void main(String[] args) {


        DigitalHouseManager digital = new DigitalHouseManager();

        digital.registrarProfessorAdjunto("Joao", "Carlos",123,0);
        digital.registrarProfessorTitular("Felipe", "Martins", 321, "Matematica");


        digital.registrarCurso("Full Stack", 20001, 2);


        digital.alocarProfessores(20001,321,123);

        digital.matricularAluno("Kawe","Santos",666);
        digital.matricularAluno("Fabio","Pereira", 222);
        digital.matricularAluno("Vini","Fonc",333);


        digital.matricularAluno(666,20001);
        digital.matricularAluno(222,20001);
        digital.matricularAluno(333,20001);












    }
}
