package EC;

	import java.util.Set;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity 
	public class Aluno implements Identificavel {
        @Id
        private Long id;
        private String nome;
        
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
		
		public Aluno(Long id, String nome) {
			super();
			this.id = id;
			this.nome = nome;
		}

		public Aluno() {
			super();
		}

	}





