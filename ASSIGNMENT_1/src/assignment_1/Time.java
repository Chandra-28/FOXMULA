package assignment_1;

public class Time {
	 private int hour, min, sec;

	    Time(int hr, int mn, int sc) {
	        hour = hr;min = mn;sec = sc;
	        }

	    Time() {
	        hour = 0;min = 0;sec = 0;
	        }

	    public Time add(Time tt)
	    {
	        Time tm = new Time();
	        tm.sec = this.sec + tt.sec;
	        if(tm.sec>60)
	        {
	            tm.sec -= 60;
	            tm.min++;
	        }
	        tm.min += this.min + tt.min;
	        if(tm.min>60)
	        {
	            tm.min -= 60;
	            tm.hour++;
	        }
	        tm.hour += this.hour + tt.hour;
	        if(tm.hour>24)
	        {
	            tm.hour -= 24;
	        }
	        return tm;
	    }
	    void display(String str)
	    {
	        System.out.println(str + " " + hour + ":" + min + ":" + sec);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(4,18,12);
        Time t2 = new Time(7,35,50);
        Time t3 = t1.add(t2);
        t1.display("Time 1 : ");
        t2.display("Time 2 : ");
        t3.display("Time after addition : ");
	}

}
