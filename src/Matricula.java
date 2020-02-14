import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula;


    Matricula(){
    }




    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        dataMatricula = new Date();
    }


}
