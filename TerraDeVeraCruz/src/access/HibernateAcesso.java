package access;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateAcesso {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		try{
			final StandardServiceRegistry registry= new StandardServiceRegistryBuilder()
																	.configure().build();
			return new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}catch(Exception ex){
			System.err.println("SessionFactory creation failed." + ex);
		}
		return null;
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
