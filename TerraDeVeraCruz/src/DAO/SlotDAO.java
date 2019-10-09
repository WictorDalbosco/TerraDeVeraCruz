package DAO;


import java.util.List;

import org.hibernate.Session;

import model.Slot;

public class SlotDAO {
	private static SlotDAO instance;
	protected Session session;

	public static SlotDAO getInstance(Session session) {
		if (instance == null) {
			instance = new SlotDAO(session);
		}
		return instance;
	}

	private SlotDAO(Session session) {
		this.session = session;
	}

	//Retrieve (Recuperar) do cRud
	public Slot getById(final int l) {
		return (Slot) session.load(Slot.class, l);
	}

	//Retrieve (Recuperar) do cRud, mas retorna todas as linhas da tabela
	@SuppressWarnings("unchecked")
	public List<Slot> findAll() {
		return session.createCriteria(Slot.class).list();
	}

	//Create do Crud
	public void save(Slot slot) {
		try {
			session.getTransaction().begin();
			session.save(slot);
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	//Update do crUd
	public void merge(Slot slot) {
		try {
			session.getTransaction().begin();
			session.merge(slot);
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	//Delete do cruD
	public void remove(Slot slot) {
		try {
			session.getTransaction().begin();
			slot = (Slot) session.load(Slot.class, slot.getId());
			session.delete(slot);
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	//Delete do cruD, passando o id ao invês do objeto
	public void removeById(final int id) {
		try {
			Slot slot = getById(id);
			remove(slot);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
