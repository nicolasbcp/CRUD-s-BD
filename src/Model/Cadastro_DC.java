package Model;

abstract class Cadastro_DC {
	// Atributos
	private String nome, departamento, natureza;
	private int duracao;
	
	// Métodos Especiais
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public String getNatureza() {
        return natureza;
    }
    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }  
}
