/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

/**
 *
 * @author mikeg
 */
public class Employee {
private int id;  
private String firstName,lastName, middleInitial, position;  
  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getFirstName() {  
    return firstName;  
}  
public void setFirstName(String firstName) {  
    this.firstName = firstName;  
}  
public String getLastName() {  
    return lastName;  
}  
public void setLastName(String lastName) {  
    this.lastName = lastName;  
}  
public String getMiddleInitial() {  
    return middleInitial;  
}  
public void setMiddleInitial(String middleInitial) {  
    this.middleInitial = middleInitial;  
}  

public String getPosition() {  
    return position;  
}  
public void setPosition(String position) {  
    this.position = position;  
}     
}
