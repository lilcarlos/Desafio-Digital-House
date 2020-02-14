import java.util.Objects;

public class Aluno {

    private String nome;
    private String sobrenome;
    private  int codigoAluno;

    public Aluno(String nome, String sobrenome, int codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigoAluno == aluno.codigoAluno;
    }
    
}
