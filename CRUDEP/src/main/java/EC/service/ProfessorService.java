package EC.service;
	
	import java.io.Serializable;
	import java.security.MessageDigest;
	import java.util.Base64;
	import java.util.List;

	import javax.enterprise.context.ApplicationScoped;
	import javax.inject.Inject;

	import EC.Professor;
	import EC.ProfessorDAO;
    import util.TransacionalCdi;

	@ApplicationScoped
	public class ProfessorService implements Serializable, Service<Professor> {

		@Inject
		private ProfessorDAO professorDAO;

		@Override
		@TransacionalCdi
		public void save(Professor professor) {
			professor.setPassword(hash(professor.getPassword()));
			professorDAO.save(professor);
		}

		private String hash(String password) {
			try {
				MessageDigest md;
				md = MessageDigest.getInstance("SHA-256");
				md.update(password.getBytes("UTF-8"));
				byte[] digest = md.digest();
				String output = Base64.getEncoder().encodeToString(digest);
				return output;
			} catch (Exception e) {
				return password;
			}
		}

		@Override
		@TransacionalCdi
		public void update(Professor professor) {
			professorDAO.update(professor);
		}

		@Override
		@TransacionalCdi
		public void remove(Professor professor) {
			professorDAO.remove(professor);
		}


		@Override
		public Professor getByID(long professorId) {
			return professorDAO.getByID(professorId);
		}

		
		@Override
		public List<Professor> getAll() {
			return professorDAO.getAll();
		}

	}

