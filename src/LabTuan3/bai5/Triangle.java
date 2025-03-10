package LabTuan3.bai5;

public class Triangle {
    private int a;
    private int b;
    private int c;
    private String name;

    private Triangle() {
        
    }
    
    public Triangle(int a, int c, int b) {
        this.a = a;
        this.c = c;
        this.b = b;
        name = TriangleUtil.checkTriangleType(this.a,this.b,this.c);
    }

    public int geta() {
        return a;
    }

    public void seta(int a) {
        this.a = a;
    }

    public int getc() {
        return c;
    }

    public void setc(int c) {
        this.c = c;
    }

    public int getb() {
        return b;
    }

    public void setb(int b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", type triangle='" + name + '\'' +
                '}';
    }
}
