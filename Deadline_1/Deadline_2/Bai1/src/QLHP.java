import java.util.Scanner;

class Student {
    private String name, id;
    private int numberOfCredits, numberOfCourses;
    private Course[] arrCourses;

    Student() {
        name = null;
        id = null;
        numberOfCredits = numberOfCourses = 0;
        arrCourses = new Course[100];
    }

    Student(String name, String id, int numberOfCredits, int numberOfCourses, Course[] courses) {
        this.name = name;
        this.id = id;
        this.numberOfCourses = numberOfCourses;
        this.numberOfCredits = numberOfCredits;
        this.arrCourses = courses;
    }

    public void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, id of student: ");
        name = scanner.nextLine();
        id = scanner.nextLine();
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;

    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public int getNumberOfCourse() {
        return numberOfCourses;
    }

    public Course[] getCourses() {
        return arrCourses;
    }

    public void setNumberOfCredits(int n) {
        numberOfCredits = n;
    }

    public void addCourse(Course a) {
        arrCourses[numberOfCourses] = new Course(a);
        numberOfCourses++;
        numberOfCredits += a.getCredit();
    }

    public void displayCourses() {
        if (numberOfCourses != 0) {
            for (int i = 0; i < numberOfCourses; i++) {
                System.out.println(arrCourses[i].getName() + "");
            }
        }

    }

}

class Course {
    private String name, id;
    private int credit;
    public Time time;
    private String startTime, endTime;
    private int numberOfStudents;

    public Course() {
        name = id = null;
        credit = 0;
        time = new Time();
        startTime = endTime = null;
        numberOfStudents = 0;
    }

    public Course(Course a) {
        this.name = a.getName();
        this.credit = a.getCredit();
        this.time = new Time(a.time.getStartPeriod(), a.time.getEndPeriod(), a.time.getDayOfWeek());
        this.startTime = a.getStartTime();
        this.endTime = a.getEndTime();
    }

    public void inputCourse() {
        System.out.println("Input new course:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter ID: ");
        id = scanner.nextLine();
        System.out.println("Enter credit: ");
        credit = scanner.nextInt();
        time.inputTime();
        scanner.nextLine();
        System.out.println("Enter start time: ");
        startTime = scanner.nextLine();
        System.out.println("Enter end time: ");
        endTime = scanner.nextLine();

    }

    public void displayCourse() {
        System.out.println("Course Name: " + name);
        System.out.println("Course ID: " + id);
        System.out.println("Credit: " + credit);
        System.out.println("Start Period: " + time.getStartPeriod());
        System.out.println("End Period: " + time.getEndPeriod());
        System.out.println("Day of Week: " + time.getDayOfWeek());
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
    }

    public String getEndTime() {
        return endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public void increaseNumberOfStudent() {
        numberOfStudents++;
    }

    public int getNumberOfStudent() {
        return numberOfStudents;
    }

    public class Time {
        int startPeriod, endPeriod;
        String dayOfWeek;

        Time() {
            startPeriod = endPeriod = 0;
            dayOfWeek = null;
        }

        Time(int startPeriod, int endPeriod, String dayOfWeek) {
            this.startPeriod = startPeriod;
            this.endPeriod = endPeriod;
            this.dayOfWeek = dayOfWeek;
        }

        public void inputTime() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter start period, end period: ");
            startPeriod = scanner.nextInt();
            endPeriod = scanner.nextInt();
            System.out.println("Enter day of week: ");
            scanner.nextLine();
            dayOfWeek = scanner.nextLine();
        }

        public int getStartPeriod() {
            return startPeriod;
        }

        public int getEndPeriod() {
            return endPeriod;
        }

        public String getDayOfWeek() {
            return dayOfWeek;
        }

    }

}

public class QLHP {
    private static int n;
    private static int m;
    private static Student[] students;
    private static Course[] courses;

    public static void inputCourses() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of courses: ");
        m = scanner.nextInt();
        courses = new Course[100];
        for (int i = 0; i < m; i++) {
            courses[i] = new Course();
            courses[i].inputCourse();
        }
        for (int i = 0; i < m; i++) {
            System.out.println();
            courses[i].displayCourse();

        }
    }

    public static void inputStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        n = scanner.nextInt();
        students = new Student[100];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].inputStudent();
        }

    }

    public static void displayStudents() {
        for (int i = 0; i < n; i++) {
            System.out.println();
            students[i].displayStudent();
            students[i].displayCourses();

        }

    }

    public static void registerCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Register course");
        for (int i = 0; i < n; i++) {
            students[i].displayStudent();
            for (int j = 0; j < m; j++) {
                courses[j].displayCourse();
                System.out.println("Do you want to regiter this course? 1.Yes 0.No");
                int selection = scanner.nextInt();
                if (selection == 1) {
                    students[i].addCourse(courses[j]);
                    courses[j].increaseNumberOfStudent();
                }
            }

        }
    }

    public static int findTheMostRegisters() {
        int max = 0;
        for (int i = 1; i < m; i++) {
            if (courses[i].getNumberOfStudent() > courses[max].getNumberOfStudent())
                max = i;
        }
        return max;
    }

    public static int findTheMostCourses() {
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (students[i].getNumberOfCourse() > students[max].getNumberOfCourse())
                max = i;
        }
        return max;
    }

    public static int findTheMostCredits() {
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (students[i].getNumberOfCredits() > students[max].getNumberOfCredits())
                max = i;
        }
        return max;
    }

    public static void displayDaySchedule(Student student, String dayOfWeek) {
        System.out.println(dayOfWeek);
        boolean hasClass = false;

        for (int i = 0; i < student.getNumberOfCourse(); i++) {
            Course[] courses = student.getCourses();
            Course.Time courseTime = courses[i].time;
            if (courseTime.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
                System.out.println("Course: " + courses[i].getName());
                System.out.println("Time: " + courseTime.getStartPeriod() + " - " + courseTime.getEndPeriod());
                hasClass = true;
            }
        }

        if (!hasClass) {
            System.out.println("No classes scheduled for this day.");
        }
    }

    public static void displayStudentSchedule(String studentId) {
        Student student = new Student();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (students[i].getId().equals(studentId)) {
                student = students[i];
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Can find this student");
        } else {
            System.out.println();
            System.out.println("The schedule of " + student.getName());
            displayDaySchedule(student, "Monday");
            displayDaySchedule(student, "Tuesday");
            displayDaySchedule(student, "Wednesday");
            displayDaySchedule(student, "Thurday");
            displayDaySchedule(student, "Friday");
            displayDaySchedule(student, "Saturday");

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        inputStudents();
        inputCourses();
        registerCourse();
        System.out.println("The course has the most register is " + courses[findTheMostRegisters()].getName() + " with "
                + courses[findTheMostRegisters()].getNumberOfStudent() + " registers");
        System.out.println("The studen has the most course is " + students[findTheMostCourses()].getName() + " with "
                + students[findTheMostCourses()].getNumberOfCourse() + " courses");
        System.out.println("The studen has the most credit is " + students[findTheMostCredits()].getName() + " with "
                + students[findTheMostCredits()].getNumberOfCredits() + " credits");

    }

}
