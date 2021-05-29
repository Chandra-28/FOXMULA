package assignment_1;






public class Areaof_Quadrilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Trapezoid t=new Trapezoid(3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,4.0);
	        Parallelogram p = new Parallelogram(0.0,0.0,5.0,3.0,5.0,7.0,0.0,4.0,3.0);
	        Rectangle r = new Rectangle(4.0,8.0,4.0,8.0,2.0,2.0,4.0,4.0);
	        Square s = new Square(4.0,4.0,4.0,4.0,4.0,4.0,4.0,4.0);
	        System.out.println("Area of Trapezoid : "+t.getArea());
	        System.out.println("Area of Parallelogram : "+p.getArea());
	        System.out.println("Area of Rectangle : "+r.getArea());
	        System.out.println("Area of Square : "+s.getArea());
	}

}
