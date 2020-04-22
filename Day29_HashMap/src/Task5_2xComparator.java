import java.util.*;
import  java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;

class TicketBooking{
	private String show;
	private LocalDate time;
	private String num;
	private double price;

	public TicketBooking()
	{

	}

	public TicketBooking(String show, LocalDate time, String num, double price)
	{
		this.show = show;
		this.time = time;
		this.num = num;
		this.price = price;
	}


	public String getShow() {
		return show;
	}
	public void setShow(String show) {
		this.show = show;
	}
	public LocalDate getTime() {
		return time;
	}
	public void setTime(LocalDate time) {
		this.time = time;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

class PriceAndBookingTimeComparator implements Comparator<TicketBooking>{

	@Override
	public int compare(TicketBooking o1, TicketBooking o2) {
		if(o1.getPrice() > o2.getPrice())
		{
			return 1;
		}
		else if(o1.getPrice() < o2.getPrice())
		{
			return -1;
		}
		else 
		{
			return o1.getTime().compareTo(o2.getTime());
		}
		
	}
	
}


public class Task5_2xComparator {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of TicketBookings ");
		int n = input.nextInt();
		
		List<TicketBooking> lt2 = new ArrayList<TicketBooking>();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		for(int i=0; i<n; i++)
		{
//			System.out.println("Enter the details of Booking "+ (i+1));
			String s[] = br.readLine().split(",");
			lt2.add(new TicketBooking(s[0], LocalDate.parse(s[1], df), s[2], Double.parseDouble(s[3])));
		}
		
//		System.out.println();
		Collections.sort(lt2, new PriceAndBookingTimeComparator());
		Iterator<TicketBooking> it = lt2.iterator();
		System.out.format("%-20s%-20s%-20s%-20s\n","Name","Date", "Number", "Price");
		while(it.hasNext())
		{
			TicketBooking s = it.next();
			System.out.format("%-20s%-20s%-20s%-20s\n",s.getShow(), s.getTime(), s.getNum(),s.getPrice());
		}
			
	}

}

/*
magic show,01-01-2018,10,200.0
cricket match,02-01-2018,25,200.0
seminar,02-01-2018,150,2500.0
*/
