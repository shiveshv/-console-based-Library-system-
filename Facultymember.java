package s1 ;
2
3 //FacultyMember-java
4 class FacultyMember extends Member {
private String designation;
private int borrowlimit = 5;
80
public FacultyMember (int memberId, String name, String email, String phone, String designation)
super (memberId, name, email, phone);
10
11
12
}
this. designation = designation;
13
@Override
140 public boolean borrow (Book book) {
150
if (borrowedCount ‹ borrowlimit) {
16
return super.borrow(book);
170 } else (
18
System.out.printIn(name + " has reached borrow limit.");
19
return false;
20
21
}
22
23
@Override
249 public double calcFine (int dayslate) {
25
return daysLate * 0.5; // Faculty pay less fine
26
33 1
