package org.ravi.client;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class BeanClient {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		System.out.println(session.isConnected());
		Query q = session.createQuery("select max(name) from BeanClass");
		System.out.println(q.list());

	}
}
