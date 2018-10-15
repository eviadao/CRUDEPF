package EC;
	
	import java.util.Set;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity 
	public class Turma implements Identificavel {
       @Id
       private Long id;
       private String professores;
       private String disciplinas;
       private String alunos;
       
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProfessores() {
		return professores;
	}
	public void setProfessores(String professores) {
		this.professores = professores;
	}
	public String getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getAlunos() {
		return alunos;
	}
	public void setAlunos(String alunos) {
		this.alunos = alunos;
	}
	
	public Turma(Long id, String professores, String disciplinas, String alunos) {
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
