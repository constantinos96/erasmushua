package gr.hua.dit.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
@Entity
@Table(name="users")
public class Users {
		@Column(name = "id")
		public int id;
		@Column(name = "username")
	    public String username;
		@Column(name = "password")
	    public String password;
		@Column(name = "role")
	    public String role;
	    
	    public Users(){
			
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}


		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
		
}
