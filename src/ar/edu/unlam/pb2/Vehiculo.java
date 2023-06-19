package ar.edu.unlam.pb2;

public abstract class Vehiculo {
	protected Integer codigo; //cada uno de mis  hijos puede tener distinto valor en este tipo de atributo
	protected String modelo;
	
	public Vehiculo(Integer codigo, String modelo) {
		this.codigo = codigo;
		this.modelo = modelo;
	}

	public Integer getCodigo() { //public: todos pueden invocar este metodo para saber el color de un hijo Vehiculo que se comporta como vehiculo
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Vehiculo other = (Vehiculo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	/* Me estaba agregando todos los 26 vehiculos porque no habia comentado el get class
	 * */
	
	
	
	
	
}
