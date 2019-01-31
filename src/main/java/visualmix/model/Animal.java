package visualmix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import visualmix.enums.StatusAnimal;

@JsonIgnoreProperties(ignoreUnknown=true)
@XmlRootElement(name = "classe")
@Entity
public class Animal {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	@Column
	private String nome;
	@Column
	private String nomeCientifico;
	@ManyToOne
	private Classe classe;
	@ManyToOne
	private Bioma bioma;
	@Column
	private StatusAnimal status;
	@Column
	private String nomeImagem;
}
