package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Model.InsurancePolicy;
import in.ineuron.util.HibernateUtil;

public class FirstLevelCacheTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		boolean flag= false;
		
		session = HibernateUtil.getSession();
        InsurancePolicy policy=new InsurancePolicy();
		policy.setCompany("ICICI");
		policy.setPolicyName("Minlife");
		policy.setPolicyType("monthly");
		policy.setTenure(8);
        
        
        try {
			transaction = session.beginTransaction();
			session.save(policy);
			flag=true;
		}catch(Exception e) {
			flag=false;
		}finally {
			if(flag) {
			  transaction.commit();
			  System.out.println("Object saved to database...");
				}
			else {
				transaction.rollback();
				System.out.println("Object failed to save to database..");
				}
			HibernateUtil.closeSession(session);
			}
		}
	}


