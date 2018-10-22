package EC;
	
	import java.util.Set;

	import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

	@Entity 
	public class Turma implements Identificavel {
       @Id
       private Long id;
       @ManyToMany(mappedBy="turmas")
       private Set<Professor> professores;
       @ManyToMany(mappedBy="turmas")
       private Set<Disciplina> disciplinas;
       @OneToMany(mappedBy="turma")
       private Set<Aluno> alunos;
       
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Professor>  getProfessores() {
		return professores;
	}
	public void setProfessores(Set<Professor>  professores) {
		this.professores = professores;
	}
	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public Turma(Long id, Set<Professor> professores, Set<Disciplina> disciplinas, Set<Aluno> alunos) {
		super();
		this.id = id;
		this.professores = professores;
		this.disciplinas = disciplinas;
		this.alunos = alunos;
	}
	
	public Turma () {
		super();
	

}
	}
