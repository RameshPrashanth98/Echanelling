package prescription;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Patient.PatientDbutil;


@WebServlet("/prescriptioncontroller")
public class prescriptioncontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get details from prescription.jsp
		
		String Uname = request.getParameter("uname");
		String PId = request.getParameter("lid");
		String Address = request.getParameter("address");
		String Mobile = request.getParameter("mobile");
		String Medicine = request.getParameter("medicine");
		
		System.out.println("Servelet details");
		System.out.println(Uname+" "+PId+" " + Address + " "+ Mobile + " ");
		
		boolean result = PatientDbutil.addmedicine(Uname,PId, Address,Mobile, Medicine);
		
		if(result==true) {
		 System.out.println("Done");
		 RequestDispatcher rd = request.getRequestDispatcher("orderstatus.jsp");
		rd.forward(request, response);
		}else {
			System.out.println("False");
			request.setAttribute("Message", "Something went wrong,Try again later");
			request.getRequestDispatcher("prescription.jsp").forward(request, response);
		}
		
	}

}
