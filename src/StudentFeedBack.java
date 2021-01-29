import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: StudentFeedBack
 *
 */
 public class StudentFeedBack extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public StudentFeedBack() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request,
	 * HttpServletResponse response)
	 */
	protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {
		
		final PrintWriter out = response.getWriter();
		try {
			final String dname = request.getParameter("dname");
			final String tname = request.getParameter("tname");
			final String sub = request.getParameter("sub");
			final String a = request.getParameter("A");
			final int a1 = Integer.parseInt(a);
			final String b = request.getParameter("B");
			final int b1 = Integer.parseInt(b);
			final String c = request.getParameter("C");
			final int c2 = Integer.parseInt(c);
			final String d = request.getParameter("D");
			final int d2 = Integer.parseInt(d);
			final String e = request.getParameter("E");
			final int e2 = Integer.parseInt(e);
			final String f = request.getParameter("F");
			final int f1 = Integer.parseInt(f);
			final String g = request.getParameter("G");
			final int g1 = Integer.parseInt(g);
			final String h = request.getParameter("H");
			final int h1 = Integer.parseInt(h);
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			final Connection c1 = DriverManager.getConnection("jdbc:odbc:abc", "root", "root");
			final Statement s = c1.createStatement();
			String sql = null;
			String sql2 = null;
			ResultSet rs = null;
			int num = 0;
			switch (a1) {
				case 1:
					sql2 = "select * from teacherreportA where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o1") + 1;
						sql = "update teacherreportA set o1=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportA values('" + dname + "','" + tname + "','" + sub + "'," + num
								+ ",0,0,0)";
					}
					break;
				case 2:
					sql2 = "select * from teacherreportA where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o2") + 1;
						sql = "update teacherreportA set o2=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportA values('" + dname + "','" + tname + "','" + sub + "',0," + num
								+ ",0,0)";
					}
					break;
				case 3:
					sql2 = "select * from teacherreportA where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o3") + 1;
						sql = "update teacherreportA set o3=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportA values('" + dname + "','" + tname + "','" + sub + "',0,0,"
								+ num + ",0)";
					}
					break;
				case 4:
					sql2 = "select * from teacherreportA where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o4") + 1;
						sql = "update teacherreportA set o4=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportA values('" + dname + "','" + tname + "','" + sub + "',0,0,0,"
								+ num + ")";
					}
					break;
			}
			s.execute(sql);
			switch (b1) {
				case 1:
					sql2 = "select * from teacherreportB where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o1") + 1;
						sql = "update teacherreportB set o1=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportB values('" + dname + "','" + tname + "','" + sub + "'," + num
								+ ",0,0,0)";
					}
					break;
				case 2:
					sql2 = "select * from teacherreportB where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o2") + 1;
						sql = "update teacherreportB set o2=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportB values('" + dname + "','" + tname + "','" + sub + "',0," + num
								+ ",0,0)";
					}
					break;
				case 3:
					sql2 = "select * from teacherreportB where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o3") + 1;
						sql = "update teacherreportB set o3=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportB values('" + dname + "','" + tname + "','" + sub + "',0,0,"
								+ num + ",0)";
					}
					break;
				case 4:
					sql2 = "select * from teacherreportB where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o4") + 1;
						sql = "update teacherreportB set o4=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportB values('" + dname + "','" + tname + "','" + sub + "',0,0,0,"
								+ num + ")";
					}
					break;
			}
			s.execute(sql);
			switch (c2) {
				case 1:
					sql2 = "select * from teacherreportC where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o1") + 1;
						sql = "update teacherreportC set o1=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportC values('" + dname + "','" + tname + "','" + sub + "'," + num
								+ ",0,0,0)";
					}
					break;
				case 2:
					sql2 = "select * from teacherreportC where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o2") + 1;
						sql = "update teacherreportC set o2=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportC values('" + dname + "','" + tname + "','" + sub + "',0," + num
								+ ",0,0)";
					}
					break;
				case 3:
					sql2 = "select * from teacherreportC where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o3") + 1;
						sql = "update teacherreportC set o3=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportC values('" + dname + "','" + tname + "','" + sub + "',0,0,"
								+ num + ",0)";
					}
					break;
				case 4:
					sql2 = "select * from teacherreportC where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o4") + 1;
						sql = "update teacherreportC set o4=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportC values('" + dname + "','" + tname + "','" + sub + "',0,0,0,"
								+ num + ")";
					}
					break;
			}
			s.execute(sql);
			switch (d2) {
				case 1:
					sql2 = "select * from teacherreportD where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o1") + 1;
						sql = "update teacherreportD set o1=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportD values('" + dname + "','" + tname + "','" + sub + "'," + num
								+ ",0,0,0)";
					}
					break;
				case 2:
					sql2 = "select * from teacherreportD where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o2") + 1;
						sql = "update teacherreportD set o2=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportD values('" + dname + "','" + tname + "','" + sub + "',0," + num
								+ ",0,0)";
					}
					break;
				case 3:
					sql2 = "select * from teacherreportD where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o3") + 1;
						sql = "update teacherreportD set o3=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportD values('" + dname + "','" + tname + "','" + sub + "',0,0,"
								+ num + ",0)";
					}
					break;
				case 4:
					sql2 = "select * from teacherreportD where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o4") + 1;
						sql = "update teacherreportD set o4=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportD values('" + dname + "','" + tname + "','" + sub + "',0,0,0,"
								+ num + ")";
					}
					break;
			}
			s.execute(sql);
			switch (e2) {
				case 1:
					sql2 = "select * from teacherreportE where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o1") + 1;
						sql = "update teacherreportE set o1=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportE values('" + dname + "','" + tname + "','" + sub + "'," + num
								+ ",0,0,0)";
					}
					break;
				case 2:
					sql2 = "select * from teacherreportE where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o2") + 1;
						sql = "update teacherreportE set o2=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportE values('" + dname + "','" + tname + "','" + sub + "',0," + num
								+ ",0,0)";
					}
					break;
				case 3:
					sql2 = "select * from teacherreportE where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o3") + 1;
						sql = "update teacherreportE set o3=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportE values('" + dname + "','" + tname + "','" + sub + "',0,0,"
								+ num + ",0)";
					}
					break;
				case 4:
					sql2 = "select * from teacherreportE where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o4") + 1;
						sql = "update teacherreportE set o4=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportE values('" + dname + "','" + tname + "','" + sub + "',0,0,0,"
								+ num + ")";
					}
					break;
			}
			s.execute(sql);
			switch (f1) {
				case 1:
					sql2 = "select * from teacherreportF where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o1") + 1;
						sql = "update teacherreportF set o1=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportF values('" + dname + "','" + tname + "','" + sub + "'," + num
								+ ",0,0,0)";
					}
					break;
				case 2:
					sql2 = "select * from teacherreportF where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o2") + 1;
						sql = "update teacherreportF set o2=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportF values('" + dname + "','" + tname + "','" + sub + "',0," + num
								+ ",0,0)";
					}
					break;
				case 3:
					sql2 = "select * from teacherreportF where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o3") + 1;
						sql = "update teacherreportF set o3=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportF values('" + dname + "','" + tname + "','" + sub + "',0,0,"
								+ num + ",0)";
					}
					break;
				case 4:
					sql2 = "select * from teacherreportF where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o4") + 1;
						sql = "update teacherreportF set o4=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportF values('" + dname + "','" + tname + "','" + sub + "',0,0,0,"
								+ num + ")";
					}
					break;
			}
			s.execute(sql);
			switch (g1) {
				case 1:
					sql2 = "select * from teacherreportG where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o1") + 1;
						sql = "update teacherreportG set o1=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportG values('" + dname + "','" + tname + "','" + sub + "'," + num
								+ ",0,0,0)";
					}
					break;
				case 2:
					sql2 = "select * from teacherreportG where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o2") + 1;
						sql = "update teacherreportG set o2=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportG values('" + dname + "','" + tname + "','" + sub + "',0," + num
								+ ",0,0)";
					}
					break;
				case 3:
					sql2 = "select * from teacherreportG where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o3") + 1;
						sql = "update teacherreportG set o3=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportG values('" + dname + "','" + tname + "','" + sub + "',0,0,"
								+ num + ",0)";
					}
					break;
				case 4:
					sql2 = "select * from teacherreportG where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o4") + 1;
						sql = "update teacherreportG set o4=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportG values('" + dname + "','" + tname + "','" + sub + "',0,0,0,"
								+ num + ")";
					}
					break;
			}
			s.execute(sql);
			switch (h1) {
				case 1:
					sql2 = "select * from teacherreportH where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o1") + 1;
						sql = "update teacherreportH set o1=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportH values('" + dname + "','" + tname + "','" + sub + "'," + num
								+ ",0,0,0)";
					}
					break;
				case 2:
					sql2 = "select * from teacherreportH where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o2") + 1;
						sql = "update teacherreportH set o2=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportH values('" + dname + "','" + tname + "','" + sub + "',0," + num
								+ ",0,0)";
					}
					break;
				case 3:
					sql2 = "select * from teacherreportH where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o3") + 1;
						sql = "update teacherreportH set o3=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportH values('" + dname + "','" + tname + "','" + sub + "',0,0,"
								+ num + ",0)";
					}
					break;
				case 4:
					sql2 = "select * from teacherreportH where tname='" + tname + "'";
					try {
						rs = s.executeQuery(sql2);
						rs.next();
						num = rs.getInt("o4") + 1;
						sql = "update teacherreportH set o4=" + num + " where tname='" + tname + "'";
					} catch (final SQLException e1) {
						num = 1;
						sql = "insert into teacherreportH values('" + dname + "','" + tname + "','" + sub + "',0,0,0,"
								+ num + ")";
					}
					break;
			}
			s.execute(sql);

		} catch (final Exception e) {
			out.println(e);
		}
		response.sendRedirect("thank.html");
	}   	  	    
}