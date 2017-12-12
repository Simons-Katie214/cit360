/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojos.Dogs;

/**
 *
 * @author klsim
 */
public class HibernateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.setId(1);
        dog.setBreed("Great Dane");
        dog.setSize("Large");
        dog.setLifespan(8);
        
        Dogs dog2 = new Dogs();
        dog.setId(2);
        dog.setBreed("Irish Wolfhound");
        dog.setSize("Large");
        dog.setLifespan(10);
        
        Dogs dog3 = new Dogs();
        dog.setId(3);
        dog.setBreed("Chihuahua");
        dog.setSize("Small");
        dog.setLifespan(20);
        
        Dogs dog4 = new Dogs();
        dog.setId(4);
        dog.setBreed("Pug");
        dog.setSize("Small");
        dog.setLifespan(15);
        
        Dogs dog5 = new Dogs();
        dog.setId(5);
        dog.setBreed("Blue Heeler");
        dog.setSize("Medium");
        dog.setLifespan(15);
        
        Dogs dog6 = new Dogs();
        dog.setId(7);
        dog.setBreed("Bull Dog");
        dog.setSize("Medium");
        dog.setLifespan(10);
        
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(dog);
        session.getTransaction().commit();    // TODO code application logic here
    }
    
}
