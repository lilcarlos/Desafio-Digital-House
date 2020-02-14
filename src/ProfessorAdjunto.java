public class ProfessorAdjunto extends Professor {

    private int horasDeMonitoria;


    public ProfessorAdjunto () {

    }

    public ProfessorAdjunto(String nome, String sobrenome, int tempoDeCasa, int codigoProfessor, int horasDeMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.horasDeMonitoria = horasDeMonitoria;
    }


    public int getHorasDeMonitoria() {
        return horasDeMonitoria;
    }

    public void setHorasDeMonitoria(int horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }
}
