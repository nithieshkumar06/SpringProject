package com.zifo.myproject.DBConnection.hybernate;
import org.hibernate.service.ServiceRegistry;

import com.zifo.myproject.DBConnection.pojo.EmpDetail;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
public class HybernateUtil {
	private static SessionFactory sessionFactory;
    
	public SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
        	
            try {
            	            	
                Configuration configuration = new Configuration();
                
                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                
                Properties settings = new Properties();
                settings.put(Environment.DRIVER,"oracle.jdbc.driver.OracleDriver" );
                settings.put(Environment.URL,"jdbc:oracle:thin:@Zifocorp49:1521:orclzifo49" );
                settings.put(Environment.USER,"training" );
                settings.put(Environment.PASS,"training" );
     
                
                //Enable Hibernate's automatic session context management
                
                settings.put(Environment.STATEMENT_BATCH_SIZE, "50");
                
                //TODO:
                settings.put(Environment.ORDER_UPDATES, "true");
                settings.put(Environment.ORDER_INSERTS, "true");
                
                //TODO:
                settings.put(Environment.BATCH_VERSIONED_DATA, "true");
                
             
           
                configuration.setProperties(settings);
                
                configuration.addAnnotatedClass(EmpDetail.class);
               
                
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception ex) {
              System.out.println("conncection failed");
                throw new ExceptionInInitializerError(ex);
            }
        }
        return sessionFactory;
    }
}
