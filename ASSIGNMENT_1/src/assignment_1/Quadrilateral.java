package assignment_1;

abstract class Quadrilateral {

	
	
	    private double  x1,y1;
	    private double  x2,y2;
	    private double  x3,y3;
	    private double  x4,y4;

	    Quadrilateral(){
	        x1=0;
	        x2=0;
	        x3=0;
	        x4=0;
	        y1=0;
	        y2=0;
	        y3=0;
	        y4=0;
	    }
	    Quadrilateral(double  x1,double  y1,double  x2,double  y2,double  x3,double  y3,double  x4,double  y4)
	    {
	        
	        this.x2=x2;
	        this.x3=x3;
	        this.x4=x4;
	        this.y1=y1;
	        this.y2=y2;
	        this.y3=y3;
	        this.y4=y4;
	    }
	    public double getX1() {
	        return x1;
	    }
	    public void setX1(double x1) {
	    	this.x1=x1;
	    	
	    }
	    public double getY1() {
	        return y1;
	    }
	    public void setY1(double y1) {
	    	this.y1=y1;
	    	
	    }
	    public double getX2() {
	        return x2;
	    }
	    public void setX2(double x2) {
	    	this.x2=x2;
	    	
	    }
	    public double getY2() {
	        return y2;
	    }
	    public void setY2(double y2) {
	    	this.y2=y2;
	    	
	    }
	    public double getX3() {
	        return x3;
	    }
	    public void setX3(double x3) {
	    	this.x3=x3;
	    	
	    }
	    public double getY3() {
	        return y3;
	    }
	    public void setY3(double y3) {
	    	this.y3=y3;
	    	
	    }
	    public double getX4() {
	        return x4;
	    }
	    public void setX4(double x4) {
	    	this.x4=x4;
	    	
	    }
	    public double getY4() {
	        return y4;
	    }
	    public void setY4(double y4) {
	    	this.y4=y4;
	    	
	    }
	    public double getDistance(double x1,double x2,double y1,double y2)
	    {
	        double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	        return distance;
	    }
	    abstract double getArea();
	
}
