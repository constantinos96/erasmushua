package gr.hua.dit.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
@Entity
@Table(name="applications")
public class Application {
	@Column(name = "user_name")
	public String user_name;
	@Column(name = "first_choice")
	public String first_choice;
	@Column(name = "second_choice")
	public String second_choice;
	@Column(name = "third_choice")
	public String third_choice;
	
	public void setUsername(String user_name) {
		this.user_name = user_name;
	}

	public String getUsername() {
		return user_name;
	}
	
	public void setFirstChoice(String first_choice) {
		this.first_choice = first_choice;
	}

	public String getFirstChoice() {
		return first_choice;
	}
	
	public void setSecondChoice(String second_choice) {
		this.second_choice = second_choice;
	}

	public String getSecondChoice() {
		return second_choice;
	}

	public void setThirdChoice(String third_choice) {
		this.third_choice = third_choice;
	}

	public String getThirdChoice() {
		return third_choice;
	}


}

