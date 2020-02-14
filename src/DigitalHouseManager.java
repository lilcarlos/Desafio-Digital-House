import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAluno = new ArrayList<>();
    private List<Professor> listaProfessor = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();
    private List<Matricula> listaMatricula = new ArrayList<>();


    public DigitalHouseManager() {
    }

    public DigitalHouseManager(List<Aluno> listaAluno, List<Professor> listaProfessor, List<Curso> listaCurso, List<Matricula> listaMatricula) {
        this.listaAluno = listaAluno;
        this.listaProfessor = listaProfessor;
        this.listaCurso = listaCurso;
        this.listaMatricula = listaMatricula;
    }


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        int contador = 0;
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        for (Curso curso1 : listaCurso) {
            if (curso1.getCodigoCurso() == codigoCurso) {
                contador += 1;
            }
        }
        if (contador == 0){
            listaCurso.add(curso);
            System.out.println("Curso adicionado!");
        } else {
            System.out.println("Curso nao adicionado!");
        }
    }





    public void excluirCurso(Integer codigoCurso) {

        try {
            for (Curso curso : listaCurso) {
                if (curso.getCodigoCurso() == codigoCurso) {
                    listaCurso.remove(curso);
                    System.out.println("Curso removido!");
                } else {
                    System.out.println("Código não encontrado");
                }
            }
        } catch (ConcurrentModificationException e) {}
    }


    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto professoradjunto = new ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras);
        listaProfessor.add(professoradjunto);
        System.out.println("Professor " + professoradjunto.getNome() + " registrado!");
    }

    public void registrarProfessorTitular (String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professortitular = new ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade);
        listaProfessor.add(professortitular);
        System.out.println("Professor " + professortitular.getNome() + " registrado!");
    }


    public void excluirProfessor(Integer codigoProfessor) {
        for (Professor professor : listaProfessor) {
            if (professor.getCodigoProfessor() == codigoProfessor) {
                listaProfessor.remove(professor);
                System.out.println("Professor excluido!");
            }
        }
    }


    public void matricularAluno(String nome, String sobrenome,Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaAluno.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " criado!");
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        for (Aluno aluno : listaAluno) {
            if (aluno.getCodigoAluno() == codigoAluno) {
                for (Curso curso : listaCurso) {
                    if (curso.getCodigoCurso() == codigoCurso) {
                        if (curso.adicionarUmAluno(aluno)) {
                            Matricula matricula = new Matricula(aluno, curso);
                            listaMatricula.add(matricula);
                            System.out.println("Matricula realizada para o aluno: " + aluno.getNome());
                        } else {
                            System.out.println("Não há vagas para o aluno: " + aluno.getNome());
                        }
                    }
                }
            }
        }
    }


    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        for (Curso curso : listaCurso) {
            if (curso.getCodigoCurso() == codigoCurso) {
                for (Professor professor : listaProfessor) {

                    if (professor.getCodigoProfessor() == codigoProfessorAdjunto) {
                        curso.setProfessorAdjunto(professor);
                        System.out.println("Professor " + professor.getNome() +" Adicionado!");
                    }
                    else if (professor.getCodigoProfessor() == codigoProfessorTitular) {
                        curso.setProfessorTitular(professor);
                        System.out.println("Professor Adicionado!");
                    }
                }
            }
        }
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
