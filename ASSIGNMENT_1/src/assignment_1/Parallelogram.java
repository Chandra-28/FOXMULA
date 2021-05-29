package assignment_1;

public class Parallelogram extends Quadrilateral{
	private double height;
    Parallelogram(double  x1,double  y1,double  x2,double  y2,double  x3,double  y3,double  x4,double  y4,double height)
    {
        super(x1,x2,x3,x4,y1,y2,y3,y4);
        this.height=height;
    }
    public double getArea()
    {
        return height*getDistance(super.getX1(),super.getX2(),super.getY1(),super.getY2());
    }
}
