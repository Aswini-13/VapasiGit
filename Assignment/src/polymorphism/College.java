package polymorphism;

public class College {
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getDegree(); //I got a degree

        Undergraduate degree1 = new Undergraduate();
        degree1.getDegree(); //I am an Undergraduate

        Postgraduate degree2 = new Postgraduate();
        degree2.getDegree(); //I am a Postgraduate

        Degree degree3 = new Undergraduate();
        degree3.getDegree(); //I am an Undergraduate

        Degree degree4 = new Postgraduate();
        degree4.getDegree(); //I am a Postgraduate
    }
}
