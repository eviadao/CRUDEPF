package EC;

	import java.util.Set;
	import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

	@Entity
	public class Disciplina implements Identificavel {
		@Id 
		private Long id;
		private String tipoDisciplina;
		@ManyToMany
		private Set<Turma> turmas;
		@OneToOne
		private Professor professor;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTipoDisciplina() {
			return tipoDisciplina;
		}
		public void setTipoDisciplina(String tipoDisciplina) {
			this.tipoDisciplina = tipoDisciplina;
		}
		
		public Disciplina(Long id, String tipoDisciplina) {
			super();
			this.id = id;
			this.tipoDisciplina = tipoDisciplina;
		}
		
		public Disciplina () {
			super();
	    } 
	}
		



