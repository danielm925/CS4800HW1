package Aggregation;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        Instructor instructor1 = new Instructor();
        Textbook textbook1 = new Textbook();
        Instructor instructor2 = new Instructor();
        Textbook textbook2 = new Textbook();

        course1.setCourseName("CS 4800");

        instructor1.setFirstName("Nima");
        instructor1.setLastName("Davarpanah");
        instructor1.setOfficeNumber("Office 3-2636");

        textbook1.setTitle("Clean Code");
        textbook1.setAuthor("Robert C. Martin");
        textbook1.setPublisher("Prentice Hall");

        instructor2.setFirstName("Ben");
        instructor2.setLastName("Miller");
        instructor2.setOfficeNumber("Office 2-1424");

        textbook2.setTitle("The Product");
        textbook2.setAuthor("Dave G. Hall");
        textbook2.setPublisher("Makazi");

        course1.instructor1 = instructor1;
        course1.textbook1 = textbook1;
        course1.instructor2 = instructor2;
        course1.textbook2 = textbook2;

        course1.displayCourseInfo();
    }
}

class Instructor {
    String firstName;
    String lastName;
    String officeNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}

class Textbook {
    String title;
    String author;
    String publisher;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}

class Course {
    private String courseName;
    Textbook textbook1;
    Textbook textbook2;
    Instructor instructor1;
    Instructor instructor2;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayCourseInfo() {
        System.out.println("Course Info\n" + "Course Name: " + courseName + "\nInstructor 1: " + instructor1.getFirstName() + " " +
                instructor1.getLastName() + "\nOffice Number: " + instructor1.getOfficeNumber() + "\nTextBook: " + textbook1.getTitle()
                + "\nAuthor: " + textbook1.getAuthor() + "\nPublisher: " + textbook1.getPublisher() + "\nInstructor 2: " +
                instructor2.getFirstName() + " " + instructor2.getLastName() + "\nOffice Number: " + instructor2.getOfficeNumber()
                + "\nTextBook: " + textbook2.getTitle() + "\nAuthor: " + textbook2.getAuthor() + "\nPublisher: " + textbook2.getPublisher());
    }
}
