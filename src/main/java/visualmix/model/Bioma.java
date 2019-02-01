package visualmix.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@XmlRootElement(name = "bioma")
@Entity
public class Bioma {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false)
	private String descricao;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany
	private List<Animal> animais;
	
	public Bioma(long id, String descricao, List<Animal> animais) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.animais = animais;
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

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}	

}
