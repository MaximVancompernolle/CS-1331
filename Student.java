// I (Maxim Vancompernolle) worked on the homework assignment alone, using only course materials.
public class Student {
    private final String name;
    private int gtid;
    private int classYear;
    private double gpa;
    private double diningDollar;
    private double buzzfund;

    public Student(String name) {
        this(name, -1, 1, 4.0, 0.0, 0.0);
    }

    public Student(String name, int gtid, int classYear) {
        this(name, gtid, classYear, 4.0, 0.0, 0.0);
    }

    public Student(String name, double diningDollar, double buzzfund) {
        this(name, -1, 1, 4.0, diningDollar, buzzfund);
    }

    public Student(String name, int gtid, int classYear, double gpa, double diningDollar, double buzzfund) {
        this.name = name;

        this.gtid = gtid;

        if (classYear >= 1 && classYear <= 4) {
            this.classYear = classYear;
        } else {
            this.classYear = 1;
        }

        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            this.gpa = 4.0;
        }

        if (diningDollar >= 0.0) {
            this.diningDollar = diningDollar;
        } else {
            this.diningDollar = 0.0;
        }

        if (buzzfund >= 0.0) {
            this.buzzfund = buzzfund;
        } else {
            this.buzzfund = 0.0;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getGtid() {
        return this.gtid;
    }

    public int getClassYear() {
        return this.classYear;
    }

    public double getGpa() {
        return this.gpa;
    }

    public double getDiningDollar() {
        return this.diningDollar;
    }

    public double getBuzzfund() {
        return this.buzzfund;
    }

    public void setGtid(int newGtid) {
        this.gtid = newGtid;
    }

    public void setClassYear(int newClassYear) {
        this.classYear = newClassYear;
    }

    public void setGpa(int newGpa) {
        this.gpa = newGpa;
    }

    public void setDiningDollar(double newDiningDollar) {
        this.diningDollar = newDiningDollar;
    }

    public void setBuzzfund(double newBuzzfund) {
        this.buzzfund = newBuzzfund;
    }

    public void purchaseMeal(double cost) {
        if (cost <= this.diningDollar) {
            System.out.printf("%s has successfully purchased the meal%n", this.name);
            this.diningDollar -= cost;
        } else if (cost <= (this.diningDollar + this.buzzfund)) {
            System.out.printf("%s has successfully purchased the meal%n", this.name);
            this.buzzfund -= (cost - this.diningDollar);
            this.diningDollar = 0.0;
        } else {
            System.out.printf("%s does not have enough funds to purchase the meal%n", this.name);
        }
    }

    public void addDiningDollars(double diningDollarVal) {
        this.diningDollar += diningDollarVal;
    }

    public void addBuzzfund(double buzzfundVal) {
        this.buzzfund += buzzfundVal;
    }

    public void increaseClassYear() {
        if (this.classYear < 4) {
            this.classYear++;
        }
    }

    public String toString() {
        return "Name: " + this.name + ", GTID: " + this.gtid + ", GPA: " + this.gpa
             + ", Class Year: " + this.classYear + ", Funds: " + (this.diningDollar + this.buzzfund);
    }

    public boolean equals(Student other) {
        return (this.gpa == other.gpa && this.classYear == other.classYear && this.name.equals(other.name));
    }
}