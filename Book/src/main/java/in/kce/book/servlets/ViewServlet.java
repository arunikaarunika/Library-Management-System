package in.kce.book.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.kce.book.bean.BookBean;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();
			BookBean bookbean = (BookBean)session.getAttribute("book");
			out.print("<html><body>");
			out.print("Book Title: "+bookbean.getBookName());
			out.print("Author Name:"+bookbean.getAuthor().getAuthorName());
			out.print("Author Contact:"+bookbean.getAuthor().getContactNo());
			out.print("Book Price:"+bookbean.getCost());
			out.print("Book ISBN:"+bookbean.getIsbn());
			out.print("</body></html>");
		}

	}