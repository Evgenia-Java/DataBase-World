import by.belhard.hibernate.HibernateUtil;
import by.belhard.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
//
//
            //Native query selecting all columns
            List<Object[]> departments = session.createNativeQuery("SELECT * FROM department").list();
            for (Object[] objects : departments) {
                Integer id=(Integer)objects[0];
                String name=(String)objects[1];
                System.out.println("Department["+id+","+name+"]");
            }


            //Native query with custom column selection (scaler query)
//            System.out.println("--------------------------------------------------------------");
//            List<Object[]> employees = session.createNativeQuery("SELECT * FROM employee")
//                    .addScalar("emp_id", IntegerType.INSTANCE)
//                    .addScalar( "name", StringType.INSTANCE )
//                    .addScalar( "designation", StringType.INSTANCE )
//                    .list();
//            for (Object[] objects : employees) {
//                Integer id=(Integer)objects[0];
//                String name=(String)objects[1];
//                String designation=(String)objects[2];
//                System.out.println("Employee["+id+","+name+","+designation+"]");
//            }


            //Native query with JOIN
//            System.out.println("--------------------------------------------------------------");
//            List<Object[]> empDepts=session.createNativeQuery(""
//                    + "select e.name as emp_name, e.designation, d.name as dep_name "
//                    + "from DB2.employee e inner join DB2.department d "
//                    + "on e.dpt_id=d.dpt_id").list();
//            for (Object[] objects : empDepts) {
//                String employee=(String)objects[0];
//                String designation=(String)objects[1];
//                String department=(String)objects[2];
//                System.out.println("Employee["+employee+","+designation+","+department+"]");
//            }
//            transaction.commit();

//
//            session = HibernateUtil.getSessionFactory().openSession();
//            CriteriaBuilder cb = session.getCriteriaBuilder();
//            CriteriaQuery<Employee> cr = cb.createQuery(Employee.class);
//            Root<Employee> root = cr.from(Employee.class);
//            cr.select(root);
//
//            Query query = session.createQuery(cr);
//            List<Employee> result = query.getResultList();

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (session != null ){
                session.close();
            }
        }
        HibernateUtil.shutdown();

    }
    }
