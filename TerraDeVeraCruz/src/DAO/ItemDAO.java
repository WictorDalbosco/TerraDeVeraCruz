package DAO;


import java.util.List;

import org.hibernate.Session;

import model.Item;

public class ItemDAO {
	private static ItemDAO instance;
	protected Session session;

	public static ItemDAO getInstance(Session session) {
		if (instance == null) {
			instance = new ItemDAO(session);
		}
		return instance;
	}

	private ItemDAO(Session session) {
		this.session = session;
	}

	//Retrieve (Recuperar) do cRud
	public Item getByNome(final String l) {
		return (Item) session.load(Item.class, l);
	}

	//Retrieve (Recuperar) do cRud, mas retorna todas as linhas da tabela
	@SuppressWarnings("unchecked")
	public List<Item> findAll() {
		return session.createCriteria(Item.class).list();
	}

	//Create do Crud
	public void save(Item item) {
		try {
			session.getTransaction().begin();
			session.save(item);
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	//Update do crUd
	public void merge(Item item) {
		try {
			session.getTransaction().begin();
			session.merge(item);
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	//Delete do cruD
	public void remove(Item item) {
		try {
			session.getTransaction().begin();
			item = (Item) session.load(Item.class, item.getNome());
			session.delete(item);
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	//Delete do cruD, passando o id ao invês do objeto
	public void removeByNome(final String nome) {
		try {
			Item item = getByNome(nome);
			remove(item);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}