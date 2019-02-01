package visualmix.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

import visualmix.enums.StatusAnimal;

@Entity
@XmlRootElement
public class Animal implements Serializable {
		
	private static final long serialVersionUID = -5675030526873789749L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	
	public Animal() {
		super();	
	}



	public Animal(long id, String nome, String nomeCientifico, Classe classe, Bioma bioma, StatusAnimal status,
			String nomeImagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeCientifico = nomeCientifico;
		this.classe = classe;
		this.bioma = bioma;
		this.status = status;
		this.nomeImagem = nomeImagem;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNomeCientifico() {
		return nomeCientifico;
	}



	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}



	public Classe getClasse() {
		return classe;
	}



	public void setClasse(Classe classe) {
		this.classe = classe;
	}



	public Bioma getBioma() {
		return bioma;
	}



	public void setBioma(Bioma bioma) {
		this.bioma = bioma;
	}



	public StatusAnimal getStatus() {
		return status;
	}



	public void setStatus(StatusAnimal status) {
		this.status = status;
	}



	public String getNomeImagem() {
		return nomeImagem;
	}



	public void setNomeImagem(String nomeImagem) {
		this.nomeImagem = nomeImagem;
	}



	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + ", nomeCientifico=" + nomeCientifico + ", classe=" + classe
				+ ", bioma=" + bioma + ", status=" + status + ", nomeImagem=" + nomeImagem + "]";
	}	
	
}
