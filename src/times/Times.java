package times;

public class Times implements Comparable<Times>{

	private String time;
	private Integer pontos;
	private Integer vitórias;
	private Integer empates;
	private Integer derrotas;
	private Integer ataque;
	private Integer defesa;
	private Integer saldo;
	
	
	public Times(String time, Integer pontos, Integer vitórias, Integer empates, Integer derrotas, Integer ataque, Integer defesa, Integer saldo) {
		this.time = time;
		this.pontos = pontos;
		this.vitórias = vitórias;
		this.empates = empates;
		this.derrotas = derrotas;
		this.ataque = ataque;
		this.defesa = defesa;
		this.saldo = saldo;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Integer getVitórias() {
		return vitórias;
	}

	public void setVitórias(Integer vitórias) {
		this.vitórias = vitórias;
	}

	public Integer getEmpates() {
		return empates;
	}

	public void setEmpates(Integer empates) {
		this.empates = empates;
	}

	public Integer getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	@Override
	public int compareTo(Times other) {
		// TODO Auto-generated method stub
		return 0;
	}

}		
