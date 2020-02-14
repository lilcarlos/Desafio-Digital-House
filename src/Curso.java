import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private int codigoCurso;
    private ProfessorAdjunto professorAdjunto;
    private  ProfessorTitular professorTitular;
    private int quantidadeMaxAlunos;
    private List<Aluno> listaAlunos;


    public Curso(){
    }

    public Curso(String nome, int codigoCurso, ProfessorAdjunto professorAdjunto, ProfessorTitular professorTitular, int quantidadeMaxAlunos, List<Aluno> listaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.professorAdjunto = professorAdjunto;
        this.professorTitular = professorTitular;
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
        this.listaAlunos = listaAlunos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigoCurso == curso.codigoCurso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public int getQuantidadeMaxAlunos() {
        return quantidadeMaxAlunos;
    }

    public void setQuantidadeMaxAlunos(int quantidadeMaxAlunos) {
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
