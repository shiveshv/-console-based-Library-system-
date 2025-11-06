package s1
2 class Book {
private int bookId; private String title; private String author; private String category;
그
private boolean available = true;
80
9
public Book(int bookId, String title, String author, String category) {
this.bookId = bookId;
10
this.title = title;
11
this.author
= author;
12
this. category = category;
}
140
public String getTitle() {
15
return title;
16
}
18
179 public boolean isAvailable() {
return available;
}
200
public void setAvailable(boolean available) {
21
this.available = available;
22
}
23
24
// Overloaded search methods
250
public boolean search (String title) {
26
return this.title.equalsIgnoreCase(title);
27 }
28
290 public boolean searchByAuthor (String author) {
30
return this.author.equalsIgnoreCase(author);
31 }
32
330 public boolean searchById(int id) {
34
return this.bookId == id;
35}
36
37
@Override
380 public String tostring()
39
return bookId +
10
}
11 }
12
+ title + " by " + author + " [" + (available ? "Avai
