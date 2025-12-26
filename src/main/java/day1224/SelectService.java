package day1224;

import org.apache.ibatis.exceptions.PersistenceException;

public class SelectService {
	private static SelectService ss;
	
	private SelectService() {
		
	}
	
	public static SelectService getInstance() {
		if(ss==null) {
			ss=new SelectService();
		}//end if
		return ss;
	}//getInstance
	
	public String scsr(int deptno) {
	    String dname = "";
	    SelectDAO sDAO = SelectDAO.getInstance();

	    try {
	        dname = sDAO.scsr(deptno);
	    } catch (PersistenceException pe) {
	        pe.printStackTrace();
	    } // end catch

	    return dname;
	} // scsr

	} // class

