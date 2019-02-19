package com.cg.payroll.client;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservice.AssociateDAO;
import com.cg.payroll.daoservice.AssociateDAOImpl;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.util.PayrollDBUtil;

public class TestMain {

	public static void main(String[] args) {
		PayrollDBUtil.getDBConnection();
		System.out.println("Yes Done");
	
	PayrollServices payroll = new PayrollServicesImpl();
	int associateid=payroll.acceptAssociateDetails("hjhjhn","Ankush","Bathla","JEE","JFS","ab@gmail.com",100000,200000,50000,50000,151721,"ICICI","ICIC4545");
	System.out.println(associateid);
    
	}

}
