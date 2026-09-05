import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class bus_reservation {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 50));
        buses.add(new Bus(3, true, 56));
        buses.add(new Bus(4, true, 60));
        buses.add(new Bus(5, false, 66));
        Scanner s1 = new Scanner(System.in);
        int userOption = 1;
        for (Bus b : buses) {//each bus obj are in buses that are temperorly stoed in b variable
            b.display();
        }
        while (userOption == 1) {
            System.out.println("enter 1 to book and 2 to exit");
            userOption = s1.nextInt();
            if (userOption == 1) {
                System.out.println("starting our booking process");
                Booking bookobj = new Booking();
                if (bookobj.isAvailable(buses, bookings)) {//true
                    bookings.add(bookobj);
                    System.out.println("booking confirmed");
                } else {//false
                    System.out.println("not bookingtry another date or bus");
                }
            }
        }
    }

    public static class Bus {
        private int busNo;
        private boolean ac;
        private int capacity;

        Bus(int bus, boolean ac, int cap) {
            this.busNo = bus;
            this.ac = ac;
            this.capacity = cap;
        }
        public int getcap() {
            return capacity;
        }

        public boolean getac() {
            return ac;
        }

        public void getcap(int cap) {
            capacity = cap;
        }

        public void getac(boolean val) {
            ac = val;
        }

        public int getbusNo() {
            return busNo;
        }

        public void display() {
            System.out.println("BusNo :" + busNo + " Ac: " + ac + " capacity:" + capacity);
        }
    }

    public static class Booking {
        String passengerName;
        int busNo;
        Date date;

        public Booking() {//constructor not in static
            Scanner s1 = new Scanner(System.in);

            System.out.println("enter name of passenger:");
            passengerName = s1.next();

            System.out.println("enter Busno:");
            busNo = s1.nextInt();

            System.out.println("enter date dd-mm-yyyy format:");
            String dateip = s1.next();

            SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");

            try {
                date = dateformat.parse(dateip);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> booking) {
            int capacity = 0;

            for (Bus bus : buses) {
                if (bus.getbusNo() == busNo) {//busNo is booking ,bus.getbusNo is buses type
                    capacity = bus.getcap();
                }
            }

            int booked = 1;

            for (Booking b : booking) {
                if (b.busNo == busNo && b.date.equals(date)) {
                    booked += 1;
                }
            }

            return booked < capacity ? true : false;
        }
    }
}