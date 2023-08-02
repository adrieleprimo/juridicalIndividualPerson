package entities;

public class PessoaJuridica extends Pessoa{
	private Integer funcionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double renda, Integer funcionarios) {
		super(name, renda);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public Double rendaAnual() {
		if(funcionarios > 10) {
			return renda*0.14;
		}
		else {
			return renda*0.16;
		}
	}
	
	@Override
	public String toString() {
		return name + ": $ " + String.format("%.2f", rendaAnual()) + "\n";
	}	
}
