package com.gl.studentmanagement.entity;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Entity
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		private String firstName;
		
		private String lastName;
		
		private String course;
		
		private String country;
		
		@Column(unique = true)
		private String email;
		
		private String gender;

		public Object getFirstName() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getLastName() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getCourse() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getCountry() {
			// TODO Auto-generated method stub
			return null;
		}

}
