package s1 il
‹ class member 1
protected int memberId; protected String name; protected String email; protected String phone;
protected int borrowedCount = 0;
90 public Member (int memberId, String name, String email, String phone) {
10
this.memberId = memberId;
this.name = name;
12
this.email = email;
15
160 public boolean borrow (Book book) {
170
if (book. isAvailable()) {
18
borrowedCount++; book. setAvailable(false);
20
System.out.printIn(name + " borrowed " + book.getTitle());
21
return true;
220
} else {
23
System.out.printIn(book.getTitle() + " is not available.");
24
return false;
25
26 }
27
280 public void returnBook(Book book, int daysLate) {
29
30
borrowedCount--; book.setAvailable(true);
31
double fine = calcFine(daysLate);
320 if (fine > 0) {
33
System.out.printIn(name + " returned " + book.getTitle() + " late. Fine: Rs." + fine);
340 } else {
35
System.out.printIn(name + " returned " + book getTitle() + " on time.");
36
37
38
390 public double calcFine (int daysLate) {
40
return daysLate * 1.0; |/ default fine Rs.1 per day
12 }
