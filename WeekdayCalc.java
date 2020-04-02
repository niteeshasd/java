import java.util.Scanner;

public class WeekdayCalc
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
        String weekdayname;
        String monthname;

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on ");

        System.out.println(weekday(mm,dd,yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";
        int day;

        yy = yyyy - 1900;
        System.out.println("yy="+yy);
        total = yy + yy/4 + dd + month_offset(mm);
        System.out.println("total="+total);

        if(is_leap(yyyy) && (mm==1 || mm==2))
        {
            total = total-1;
        }
        System.out.println("total="+total);

       // day= total % 7;


		// bunch of calculations go here

		date = weekday_name(total % 7) +", "  + month_name(mm) + dd +", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}

    public static int month_offset( int month )
	{
		int result;
		// Your code goes in here
        if (month==1 || month==10)
            result = 1;
        else if(month==2 || month==3 ||month==11)
            result = 4;
        else if(month==4 ||month==7) 
            result = 0;
        else if(month==5)
            result = 2;
        else if(month==6)  
            result = 5;
        else if(month==8)
            result = 3;
        else if(month==9 ||month==12)
            result = 6;
        else
            result = -1;
		
		return result;
	}

    public static String month_name( int month )
	{
        String monthname;
		switch(month){
        case 1:
            monthname = "January";
            break;
        case 2:
            monthname =  "February";
            break;
        case 3:
            monthname =  "March";
            break;
        case 4:
            monthname =  "April";
            break;
        case 5:
            monthname =  "May";
            break;
        case 6:
            monthname =  "June";
            break;
        case 7:
           monthname =  "July";
            break;
        case 8:
            monthname =  "August";
            break;
        case 9:
            monthname =  "September";
            break;
        case 10:
            monthname =  "October";
            break;
        case 11:
            monthname =  "November";
            break;
        case 12:
            monthname =  "December";
            break;
        default:
            monthname = "";}

        return monthname;
    }

    public static String weekday_name( int day )
	{
        String weekdayname;
		switch(day){
        case 2: weekdayname = "Monday";
            break;
        case 3:
            weekdayname = "Tuesday";
            break;
        case 4:
            weekdayname = "Wednesday";
            break;
        case 5:
            weekdayname = "Thursday";
            break;
        case 6:
            weekdayname = "Friday";
            break;
        case 0:
            weekdayname = "Saturday";
            break;
        case 1:
            weekdayname = "Sunday";
            break;
        default:
            weekdayname = "";}

        return weekdayname;
    }
}
