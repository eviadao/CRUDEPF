package EC;

	import java.util.List;

	import javax.enterprise.context.ApplicationScoped;
	import javax.inject.Inject;
	import javax.persistence.EntityManager;
	import javax.persistence.Query;


	@ApplicationScoped
	public abstract class DAO<E extends Identificavel> {

		@Inject
		private EntityManager ec;

		private Class<E> classe;

		public DAO(Class<E> classe) {
			this.classe = classe;
		}

		public void save(E obj) {
			if(obj.getId() == null) {
				ec.persist(obj);
			} else {
				update(obj);
			}
		}

		public E update(E obj) {
			E resultado = obj;
			resultado = ec.merge(obj);
			return resultado;
		}

		public void remove(E obj) {
			obj = getByID(obj.getId());
			ec.remove(obj);
		}

		public E getByID(Long objId) {
			return ec.find(classe, objId);
		}

		public List<E> getAll() {
			Query query = ec.createQuery("from " + classe.getSimpleName());
			return query.getResultList();
		}

	}

