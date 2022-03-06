package projectA;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/aboutme")
public class today extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public today() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime now = LocalDateTime.now();
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>info</title></head>");
		out.println("<body>");

		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL();
		String contentPath = request.getContextPath();
		String remoteAddr = request.getRemoteAddr();
		
		int years = now.getYear();
		int months = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int minute = now.getMinute();
		
		out.println("uri : " + uri + "<br>");
		out.println("url : " + url + "<br>");
		out.println("contentPath : " + contentPath + "<br>");
		out.println("remoteAddr : " + remoteAddr + "<br>");
		out.println("current : "+years+"/"+months+"/"+day+" "+hour+":"+minute);
		out.println("</body>");
		out.println("</html>");
	}


}