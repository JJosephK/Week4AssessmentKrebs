package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NumMultiplier;

/**
 * Servlet implementation class firstNumServlet
 */
@WebServlet("/firstNumServlet")
public class firstNumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public firstNumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NumMultiplier newMult = new NumMultiplier();
		
		String numOne = request.getParameter("numOne");
		String numTwo = request.getParameter("numTwo");
		//PrintWriter writer = response.getWriter();
		
		int numOne1 = Integer.parseInt(numOne);
		int numTwo1 = Integer.parseInt(numTwo);
		newMult.setResult(numOne1, numTwo1);
		
		//writer.println(newMult.toString());
		
		request.setAttribute("userMult", newMult);
		
		getServletContext().getRequestDispatcher("/multResult.jsp").forward(request, response);
		
		//writer.println("You entered " + numOne.toString());
		//writer.println("You also entered " + numTwo.toString());
		//writer.close();
	}

}
