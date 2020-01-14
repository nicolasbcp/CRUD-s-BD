package Model;

public class Aluno extends Pessoa_Cadastro {
	// Atributos
    private String matricula, curso;
    
    // Métodos Especiais
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public String getCurso() {
        return curso;
    }
}
