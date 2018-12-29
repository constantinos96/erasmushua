package gr.hua.dit.testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import gr.hua.dit.hibernate.Student;
import gr.hua.dit.hibernate.Universities;
import gr.hua.dit.hibernate.Users;
import gr.hua.dit.hibernate.Application;

public class TestDb {
    static java.sql.Connection con = null;

	public static void init() {
		String jdbcUrl = "jdbc:mysql://sql7.freesqldatabase.com/sql7270646";
        String user = "sql7270646";
        String pass = "QVXcwh2xqC";
        try {
                System.out.println("Connecting to database: " + jdbcUrl);
                con=(Connection) DriverManager.getConnection(jdbcUrl, user, pass);
                System.out.println("Connection success");

        } catch (Exception e) {
                e.printStackTrace();
        }

	}
	
	public static Users Login (String username, String password ) {
		String query = "select * from user where username='" + username + "' and password='" + password + "' ";
		Users user = new Users();
		 	int id = 0;
			String user_name=null;
			String pwd=null;
			String role=null;
	        try {    
	            PreparedStatement stmt = con.prepareStatement(query);    
	            ResultSet rs = stmt.executeQuery(query);
	            //μηπως θελει αυτακια
				id = rs.getInt(id);
				user_name=rs.getString("username");
				pwd=rs.getString("password");
				role=rs.getString("role");
				System.out.println(rs);
			} catch (SQLException e) {
				System.out.print(e);
				e.printStackTrace();
			}
	        user.setId(id);
	        user.setUsername(user_name);
	        user.setPassword(pwd);
	        user.setRole(role);
			return user;
	    }
	
	public static String deleteUser(String user){
		String query="delete from users where username='"+user+"'";
		String msg=null;
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.executeUpdate(query);
			msg="Succefull Delete";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(msg);
		return msg;
	}
		
	public static String Register(Users u) throws SQLException {
    	int id = u.getId();
    	String username = u.getUsername();
    	String pwd = u.getPassword();
    	String role = u.getRole();
		String query = "insert into users (id, username, password, role) values ('"+id+"','"
			+ username + "', '" + pwd + "','"+role+"'";
		String msg = null;
		try {
			PreparedStatement stmt = con.prepareStatement(query);    
			stmt.executeUpdate(query);
			msg = "Successfull register";
			
        } catch (SQLException e) {
			System.out.print(e);
			e.printStackTrace();
		} 
		System.out.println(msg);
        return msg; 
    }
	
	public static Users find(String username){
    	String query = "select * from users where username='" + username + "'";
        Users user = new Users();
        String pwd = null;
        int id = 0;
 		String role = null;
        try {    
             PreparedStatement stmt = con.prepareStatement(query);    
             ResultSet rs = stmt.executeQuery(query);
 			id = rs.getInt("id");
 			pwd = rs.getString("password");
 			role=rs.getString("role");
 			System.out.println(rs);
 		} catch (SQLException e) {
 			System.out.print(e);
 			e.printStackTrace();
 		}
        user.setUsername(username);
        user.setPassword(pwd);
        user.setId(id);
  
        user.setRole(role);
 		return user;
     }
	
	public static String modify(int id, String user, String pwd, String fname, String lname, String role){
		String query="update users set username='"+user+"' password='"+pwd+"' firstname='"+fname+"' lastname='"+lname+
				"' role='"+role+"' where id='"+id+"'";
		String msg=null;
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(query);
			stmt.executeUpdate(query);
			msg="Successfull update";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(msg);
		return msg;
	}
	
	public static String makeApp(Application a){
		String user_name = a.getUsername();
		String fchoice = a.getFirstChoice();
		String schoice = a.getSecondChoice();
		String tchoice = a.getThirdChoice(); 
		Student st = new Student();
	    Universities u = new Universities();
	    int sem = st.getSemester();
	    int les = st.getLessons();
	    int cap = u.getCapacity();
	    String ulang = u.getLanguage();
	    String stlang = st.getlanguages();
	    String query = null ;
	     if( sem>4 && sem<9 && les<=5){
	     System.out.println("you can make an application");
	     	
	        if(stlang.equals(ulang) && cap > 0 ){
	        	 query = "insert into applications (user_name, first_choice, second_choice, third_choice) values('"+user_name+"','"+fchoice+"','"
	    				+schoice+"','"+tchoice+"'";
	            
	        }
	     }else{
	         System.out.println("you cannot make an application");
	     }
		
		String msg = null;
		PreparedStatement stmt;	
		try {
			stmt = con.prepareStatement(query);
			stmt.executeUpdate(query);
			msg="YOUR APPLICATION IS SAVED!!";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			user_name=null;
			e.printStackTrace();
		}
		System.out.println(msg);
		return user_name;
		
	}
	
	}

