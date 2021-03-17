package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "T_kindergarten")
public class Kindergarten implements Serializable{
		
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name="Kindergarten_Id")
			private long id;
			
			@Column(name="Kindergarten_Name")
			private String name;
			
			@Column(name="Kindergarten_Address")
			private String adress;
			
			@Column(name="Kindergarten_Email")
			private String email;
			
			@Column(name="Employee_number_phone")
			private long number_phone;
			
			@ManyToMany(mappedBy="parent", cascade = CascadeType.ALL)
			private Set<Parent> parent;
			
			@OneToMany(cascade = CascadeType.ALL, mappedBy="kindergarten")

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAdress() {
				return adress;
			}

			public void setAdress(String adress) {
				this.adress = adress;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public long getNumber_phone() {
				return number_phone;
			}

			public void setNumber_phone(long number_phone) {
				this.number_phone = number_phone;
			}

}
