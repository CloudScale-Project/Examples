package fibonacci;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FibonacciServlet
 */
@WebServlet(description = "Simple fibonacci example", urlPatterns = { "/" })
public class FibonacciServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;   
	
    public FibonacciServlet() {
        super();
    }

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
			res.setContentType("text/html");
		
			long f1 = 1;
			long f2 = 1;
			long size = 28;

			PrintWriter pw = res.getWriter();
			
			pw.println("Fibonacci: ");

			long value = calcFibonacci(pw, size, f1, f2);
			
			pw.println("");
			pw.println("Fibonacci value at index " + size + " is: " + value);
			
			pw.close();
	}
	
	private long calcFibonacci(PrintWriter pw, long size, long f1, long f2){
		
		pw.print(f1 + " ");
		pw.print(f2 + " ");

		return doCalcFibonacci(pw, 2, size, f1, f2);
	}
	
	private long doCalcFibonacci(PrintWriter pw, long current, long size, long f1, long f2){
		
		long newf1 = f1 + f2;
		long newf2 = f1;
		
		current++;
		pw.print(newf1 + " ");
		
		if(current == size){
			return newf1;
		}
		
		return doCalcFibonacci(pw, current, size, newf1, newf2);
	}

}
