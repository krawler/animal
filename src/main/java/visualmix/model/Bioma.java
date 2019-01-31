package visualmix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
@XmlRootElement(name = "bioma")
@Entity
public class Bioma {
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column(nullable=false)
	private String descricao;
	
	public Bioma(long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Bioma() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
