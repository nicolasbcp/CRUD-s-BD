package Model;

public class Disciplina extends Cadastro_DC {
	// Atributos
    private String nomeProfessor;
    private int cod;
    
    // Métodos Especiais
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    
}
