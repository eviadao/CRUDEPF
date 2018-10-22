package EC;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Professor implements Identificavel {
	@Id
	private Long id;
	private String nome;
	private String username;
	private String password;
	@OneToOne
	private Disciplina disciplina;
	@ManyToMany
	private Set<Turma> turmas;

	public Set<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(Set<Turma> turmas) {
		this.turmas = turmas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Professor(Long id, String nome, String username, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.password = password;
	}

	public Professor() {
		super();

	}
}
