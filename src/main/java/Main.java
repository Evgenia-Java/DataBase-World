import entity.City;
import org.hibernate.Session;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        Session session = null;
        try{
            session = SessionFactoryUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(City);
            session.getTransaction().commit();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(), "Error insert", JOptionPane.OK_CANCEL_OPTION);
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }


    }
}
