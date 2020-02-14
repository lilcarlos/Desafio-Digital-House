import java.util.Objects;

public class Curso {

    private String nome;
    private int codigoCurso;


    public Curso(){

    }

    public Curso(String nome, int codigoCurso) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
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
}
