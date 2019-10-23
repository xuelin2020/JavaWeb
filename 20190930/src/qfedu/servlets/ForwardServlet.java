package qfedu.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * req.getRequestDispatcher(url).forward(req, resp);
		 * ������url  /��Դ
		 * ��ַ��������ʾurl
		 * ����1�� ��Ӧ1��
		 * */
		
		req.getRequestDispatcher("/test.html").forward(req, resp);
	}
}