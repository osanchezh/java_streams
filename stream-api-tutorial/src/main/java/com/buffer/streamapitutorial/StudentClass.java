package com.buffer.streamapitutorial;

import java.util.Objects;

public class StudentClass {
  private String name;
  private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "StudentClass [name=" + name + ", email=" + email + "]";
}
@Override
public int hashCode() {
	return Objects.hash(email, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	StudentClass other = (StudentClass) obj;
	return Objects.equals(email, other.email) && Objects.equals(name, other.name);
}
public StudentClass(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}

}
