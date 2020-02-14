import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private int codigoCurso;
    private Professor professorAdjunto;
    private  Professor professorTitular;
    private int quantidadeMaxAlunos;
    private List<Aluno> listaAlunos = new ArrayList<>();


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

    public Curso(String nome, int codigoCurso, int quantidadeMaxAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigoCurso == curso.codigoCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigoCurso=" + codigoCurso +
                ", professorAdjunto=" + professorAdjunto +
                ", professorTitular=" + professorTitular +
                ", quantidadeMaxAlunos=" + quantidadeMaxAlunos +
                ", listaAlunos=" + listaAlunos +
                '}';
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (listaAlunos.size() < quantidadeMaxAlunos) {
            listaAlunos.add(umAluno);
            return true;
        } else {
            return false;
        }
    }


    public void excluirAluno(Aluno umAluno) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.equals(umAluno)) {
                listaAlunos.remove(aluno);
                System.out.println("Aluno removido!");
            } else {
                System.out.println("Aluno não encontrado!");
            }

        }
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
        return (ProfessorAdjunto) professorAdjunto;
    }

    public void setProfessorAdjunto(Professor professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return (ProfessorTitular) professorTitular;
    }

    public void setProfessorTitular(Professor professorTitular) {
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
