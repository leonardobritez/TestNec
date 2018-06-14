package model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matriz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@Column(columnDefinition = "int")
	private int valido;
	
	@Column(columnDefinition = "int")
	private int NoValido;
	
	@Column
	private BigDecimal ratio;

	
	
	
	
	public Matriz(int valido, int noValido, BigDecimal ratio) {
		this.valido = valido;
		this.NoValido = noValido;
		this.ratio = ratio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getValido() {
		return valido;
	}

	public void setValido(int valido) {
		this.valido = valido;
	}

	public int getNoValido() {
		return NoValido;
	}

	public void setNoValido(int noValido) {
		NoValido = noValido;
	}

	public BigDecimal getRatio() {
		return ratio;
	}

	public void setRatio(BigDecimal ratio) {
		this.ratio = ratio;
	}

	
	
	
	
	
}
