import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAluno;
    private List<Professor> listaProfessor;
    private List<Curso> listaCurso;
    private List <Matricula> listaMatricula;


    public DigitalHouseManager() {
    }

    public DigitalHouseManager(List<Aluno> listaAluno, List<Professor> listaProfessor, List<Curso> listaCurso, List<Matricula> listaMatricula) {
        this.listaAluno = listaAluno;
        this.listaProfessor = listaProfessor;
        this.listaCurso = listaCurso;
        this.listaMatricula = listaMatricula;
    }


    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public List<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(List<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }
}
