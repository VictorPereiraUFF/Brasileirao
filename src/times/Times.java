package times;

public class Times implements Comparable<Times>{

	private String time;
	private Integer pontos;
	
	
	public Times(String time, Integer pontos) {
		this.time = time;
		this.pontos = pontos;
		
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

	
	@Override
	public String toString() {
		return time + " (" + pontos + " pontos)";
	}

	@Override
	public int compareTo(Times o) {
		// TODO Auto-generated method stub
		return 0;
	}

}		
