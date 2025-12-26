package day1224;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import day1219.DeptDTO;
import kr.co.sist.dao.MyBatisHandler;

public class TestMyBatisDAO2  {
   
	public void updateNonParameter()throws PersistenceException {
		//1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(true);
		//2. 쿼리문을 찾아서 parsing 한 후 실행
		int cnt=ss.update("day1224.updateNonParameter");
		//3. 실행 결과 받기
		System.out.println(cnt+" 건 변경");
		//4. MyBatis Handler 닫기
		if(ss!=null) {ss.close();}//end if
	}
	
	public void updateParameter(int num)throws PersistenceException {
		//1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(true);
		//2. 쿼리문을 찾아서 parsing 한 후 실행
		int cnt=ss.update("day1224.updateParameter",num);
		//3. 실행 결과 받기
		System.out.println(cnt+" 건 변경");
		//4. MyBatis Handler 닫기
		if(ss!=null) {ss.close();}//end if
	}
	
	public void updateParameter(DeptDTO dDTO)throws PersistenceException {
		//1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(true);
		//2. 쿼리문을 찾아서 parsing 한 후 실행
		int cnt=ss.update("day1224.updateCpDept",dDTO);
		//3. 실행 결과 받기
		System.out.println(cnt+" 건 변경");
		//4. MyBatis Handler 닫기
		if(ss!=null) {ss.close();}//end if
	}
	
	public void deleteNonParameter() throws PersistenceException{
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(true);
		int cnt=ss.delete("day1224.deleteCpDept");
		System.out.println(cnt+" 건 삭제되었습니달라");
		if(ss!=null) {ss.close();}//end if
	}
	
	public void deleteParameter(int deptno) throws PersistenceException{
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(true);
		int cnt=ss.delete("day1224.deleteCpDeptNo",deptno);
		System.out.println(cnt+" 건 삭제되었습니달라");
		if(ss!=null) {ss.close();}//end if
	}

   public static void main(String[] args) {
	    try {
	        //new TestMyBatisDAO2().updateNonParameter();
	        //new TestMyBatisDAO2().updateParameter(34);
	    	//DeptDTO dDTO= new DeptDTO(50, "SM", "할렘");
	    	//new TestMyBatisDAO2().updateParameter(dDTO);
	    	//new TestMyBatisDAO2().deleteNonParameter();
	    	new TestMyBatisDAO2().deleteParameter(50);
	    } catch (PersistenceException pe) {
	        System.err.println("문제 발생");
	        pe.printStackTrace();
	    }
	}


}// class
