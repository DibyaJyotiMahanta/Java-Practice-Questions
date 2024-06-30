// package com.dibya.shape;

//rectangle
class Rectangle{
    private int i = 9, j=10, k=20;
    public int getI() {
        return i;
    }
    public int getJ() {
        return j;
    }
    public int getK() {
        return k;
    }
    void Recvolume(){
    System.out.println("REC Volume is: "+(getI()*getJ()*getK()));
    }
    void RecsurfaceArea(){
        System.out.println("REC Surface Area is: " + (2 * (getI() * getI()) + 2 * (getI() * getJ())));

}
}

//square
class Square extends Rectangle{
    void Sqvolume(){
    System.out.println("SQVolume is: "+(getI()*getI()*getI()));
    }
    void SqsurfaceArea(){
        System.out.println("SQSurface Area is: " + (6 * (getI() * getI())));


}
}

//circle
class Circle extends Square{
    void Civolume(){
        System.out.println("CIVolume is: " + ((4.0 / 3.0) * Math.PI * Math.pow(getI(), 3)));

    }
    void CisurfaceArea(){
        System.out.println("CISurface Area is: " + (4.0 * Math.PI * Math.pow(getI(), 2)));
}
}

//cylinder
class Cylinder extends Circle{
    void Cyvolume(){
    System.out.println("CYVolume is: "+(Math.PI*Math.pow(getI(), 2)*getK()));
    }
    void CysurfaceArea(){
        System.out.println("CYSurface Area is: " + ((2*Math.PI*getI()*getJ())+(2*Math.PI*Math.pow(getI(), 2))));

}
}



public class Shapes {
   public static void main(String[] args) {
    Cylinder c =new Cylinder();
    c.getI();
    c.getJ();
    c.getK();

    c.RecsurfaceArea();
    c.Recvolume();

    c.SqsurfaceArea();
    c.Sqvolume();

    c.CisurfaceArea();
    c.Civolume();

    c.CysurfaceArea();
    c.Cyvolume();
   } 
}
