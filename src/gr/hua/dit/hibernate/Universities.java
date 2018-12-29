package gr.hua.dit.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Universities")
public class Universities {
	 @Column(name = "languages")
	 public String languages;
	 @Column(name = "capacity")
	 public int capacity;
	 @Column(name = "name")
	 public String name;
	 @Column(name = "country")
	 public String country;
	 
	 
	    public void setCapacity(int capacity){
	        this.capacity = capacity;
	    }
	    public int getCapacity(){
	        return capacity;
	    }
	    public void setLanguage(String languages){
	        this.languages = languages;
	    }
	    public String getLanguage(){
	        return languages;
	    }
	    public void setName(String name){
	        this.name = name;
	    }
	    public String getName(){
	        return name;
	    }
	    public void setCountry(String country){
	        this.country = country;
	    }
	    public String getCountry(){
	        return country;
	    }
	    
	    
}
