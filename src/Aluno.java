import java.util.Objects;

public class Aluno {

    private String nome;
    private String sobrenome;
    private  int codigoAluno;

    public Aluno(){

    }

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

//    @Override
//    public int hashCode() {
//        return Objects.hash(codigoAluno);
//    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }
}
