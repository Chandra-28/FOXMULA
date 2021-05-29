package assignment_1;

public class Square extends Quadrilateral {
	Square(double  x1,double  y1,double  x2,double  y2,double  x3,double  y3,double  x4,double  y4)
    {
        super(x1,x2,x3,x4,y1,y2,y3,y4);
    }
    public double getArea()
    {
        return getDistance(super.getX1(),super.getX2(),super.getY1(),super.getY2())*getDistance(super.getX1(),super.getX2(),super.getY1(),super.getY2());
    }
}
