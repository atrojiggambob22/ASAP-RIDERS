package com.asapRiders.user;


import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="riders")
public class Riders 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String firstname;
	
	@Column(nullable = false)
	private String lastname;
        
        @Column(nullable = false, unique = true)
	private String email;
	
        @Column(nullable = false)
	private String password;
        
        @Column(nullable = false, unique = true)
        private String username;
    private String homeadress;
        
	public Riders()
	{
	}

	public Riders(String firstname, String lastname, String email,String username, String password,String homeadress)
	{
		this.firstname = firstname;
		this.lastname = lastname;
               this.email = email;
               this.username = username;
               this.password = password;
               this.homeadress= homeadress;
	}

    Riders(String firstName, String lastName, String username, String phonenumber, String email, String homeAddress, String hashPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
        
        public String getFirstName()
	{
		return firstname;
	}

	public void setFirstName(String firstName)
	{
		this.firstname = firstName;
	}

	public String getLastName()
	{
		return lastname;
	}

	public void setLastName(String lastName)
	{
		this.lastname = lastName;
	}

        public String getEmail()
        {
            return email;
        }
        
        public void setEmail(String email)
        {
            this.email = email;
        }
        
        public String getUsername()
        {
            return username;
        }

        public void setUsername(String username)
        {
            this.username = username;
        }
         public String getHomeAdress()
        {
            return homeadress();
        }
        
        public void setHomeAdress(String homeadress)
        {
            this.homeadress= homeadress;
        }
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
       
       
        
	@Override
	public String toString()
	{
		return username;
	}

    private String homeadress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
