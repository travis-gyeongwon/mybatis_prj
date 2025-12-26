package day1224;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisHandler;

public class SelectDAO {

    private static SelectDAO sDAO;

    private SelectDAO() {
    }

    public static SelectDAO getInstance() {
    	if(sDAO == null) {
    		sDAO=new SelectDAO();
    	}//end if
    	
    	return sDAO;
    }//getInstance

    /**
     * 컬럼하나에 한행 조회
     * @param deptno 부서번호
     * @return 부서명
     */
    public String scsr(int deptno) throws PersistenceException{
    	String dname="";
    	
    	SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
    	dname=ss.selectOne("day1224.scsr",deptno);
    	if(ss != null) {ss.close();}
    	return dname;
    };
}
