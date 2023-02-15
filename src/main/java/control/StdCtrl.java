package control;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.StdDao;
import dto.StdDto;

public class StdCtrl extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String s = arg0.getParameter("stdid");
		int stdid = Integer.parseInt(s);
		String stdname = arg0.getParameter("stdname");
		String dob = arg0.getParameter("dob");
		String gender =arg0.getParameter("gender");
		
		StdDto stdDto = new StdDto();
		stdDto.setStdid(stdid);
		stdDto.setStdname(stdname);
		stdDto.setDate(dob);
		stdDto.setGender(gender);
		
		StdDao stdDao = new StdDao();
		stdDao.insert(stdDto);
		
	}

}
