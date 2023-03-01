public class Alunos extends Professor {
    private String nome;
    private int matricula;
    private String turma;

    private String turno;


    public Alunos(String nome, int matricula, String turma, String turno) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }







}
