package homework;

//Interface
interface ProgressTrackable {
 void trackProgress();
}

//Abstract Class
abstract class User {
 private String name;
 private String email;
 private String userId;

 public User(String name, String email, String userId) {
     this.name = name;
     this.email = email;
     this.userId = userId;
 }

 public String getName() {
     return name;
 }

 public String getEmail() {
     return email;
 }

 public String getUserId() {
     return userId;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public void setUserId(String userId) {
     this.userId = userId;
 }

 public final void displayWelcome() {
     System.out.println("Welcome to EduSmart LMS, " + name + "!");
 }

 public abstract void viewProfile();
}

//Student Class
class Student extends User implements ProgressTrackable {
 private String enrolledCourse1;
 private String enrolledCourse2;

 public Student(String name, String email, String userId) {
     super(name, email, userId);
     this.enrolledCourse1 = null;
     this.enrolledCourse2 = null;
 }

 // Overloaded method
 public void enrollCourse(String courseName) {
     if (this.enrolledCourse1 == null) {
         this.enrolledCourse1 = courseName;
     } else if (this.enrolledCourse2 == null) {
         this.enrolledCourse2 = courseName;
     } else {
         System.out.println(getName() + " cannot enroll in more than 2 courses.");
     }
 }

 @Override
 public void trackProgress() {
     System.out.println(getName() + " is tracking progress in: ");
     if (enrolledCourse1 != null) System.out.println("- " + enrolledCourse1);
     if (enrolledCourse2 != null) System.out.println("- " + enrolledCourse2);
 }

 @Override
 public void viewProfile() {
     System.out.println("\n--- Student Profile ---");
     displayWelcome();
     System.out.println("Name: " + getName());
     System.out.println("Email: " + getEmail());
     System.out.println("User ID: " + getUserId());
     System.out.println("Courses Enrolled: ");
     if (enrolledCourse1 != null) System.out.println("- " + enrolledCourse1);
     if (enrolledCourse2 != null) System.out.println("- " + enrolledCourse2);
 }
}

//Instructor Class
class Instructor extends User {
 private String createdCourse1;
 private String createdCourse2;

 public Instructor(String name, String email, String userId) {
     super(name, email, userId);
     this.createdCourse1 = null;
     this.createdCourse2 = null;
 }

 public void createCourse(String courseName) {
     if (this.createdCourse1 == null) {
         this.createdCourse1 = courseName;
     } else if (this.createdCourse2 == null) {
         this.createdCourse2 = courseName;
     } else {
         System.out.println(getName() + " cannot create more than 2 courses.");
     }
 }

 @Override
 public void viewProfile() {
     System.out.println("\n--- Instructor Profile ---");
     displayWelcome();
     System.out.println("Name: " + getName());
     System.out.println("Email: " + getEmail());
     System.out.println("Courses Created: ");
     if (createdCourse1 != null) System.out.println("- " + createdCourse1);
     if (createdCourse2 != null) System.out.println("- " + createdCourse2);
 }
}

//Admin Class
class Admin extends User {
 public Admin(String name, String email, String userId) {
     super(name, email, userId);
 }

 public void removeUser(User user) {
     System.out.println("Admin removed user: " + user.getName());
 }

 @Override
 public void viewProfile() {
     System.out.println("\n--- Admin Profile ---");
     displayWelcome();
     System.out.println("Name: " + getName());
     System.out.println("Email: " + getEmail());
 }
}

//Course Class
class Course {
 private String title;
 private int durationInHours;
 private final int maxStudents;

 // Constructor 1
 public Course(String title, int durationInHours, int maxStudents) {
     this.title = title;
     this.durationInHours = durationInHours;
     this.maxStudents = maxStudents;
 }

 // Constructor 2 (Overloaded)
 public Course(String title) {
     this(title, 0, 50); // Default duration and max students
 }

 public void showCourseDetails() {
     System.out.println("\nCourse Title: " + title);
     System.out.println("Duration: " + durationInHours + " hours");
     System.out.println("Max Students: " + maxStudents);
 }
}

//Main class
public class EduSmartLMS {
 public static void main(String[] args) {
     // Step 1: Create 2 students, 2 instructors, and 1 admin
     Student s1 = new Student("Alice", "alice@gmail.com", "S101");
     Student s2 = new Student("Bob", "bob@gmail.com", "S102");

     Instructor i1 = new Instructor("Prof. John", "john@edu.com", "I201");
     Instructor i2 = new Instructor("Prof. Smith", "smith@edu.com", "I202");

     Admin admin = new Admin("SuperAdmin", "admin@edusmart.com", "A001");

     // Step 2: Instructors create two courses each
     i1.createCourse("Java Programming");
     i1.createCourse("Data Structures");

     i2.createCourse("Web Development");
     i2.createCourse("Database Systems");

     // Step 3: Students enroll in available courses
     s1.enrollCourse("Java Programming");
     s1.enrollCourse("Web Development");

     s2.enrollCourse("Data Structures");
     s2.enrollCourse("Database Systems");

     // Step 4: Display user profiles
     s1.viewProfile();
     s2.viewProfile();
     i1.viewProfile();
     i2.viewProfile();
     admin.viewProfile();

     // Step 5: Students track progress
     s1.trackProgress();
     s2.trackProgress();

     // Step 6: Admin removes a user
     admin.removeUser(s2);

     // Step 7: Display course details
     Course c1 = new Course("Java Programming", 40, 100);
     Course c2 = new Course("Web Development");

     c1.showCourseDetails();
     c2.showCourseDetails();
 }
}