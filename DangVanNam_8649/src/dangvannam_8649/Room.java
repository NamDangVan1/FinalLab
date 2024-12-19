package dangvannam_8649;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Room implements IRoom {

    private String id, name;
    private double baseCost;
    private Date checkinDate, checkoutDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public Room() {
    }

    public Room(String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    @Override
    public abstract double calculateCost();

    @Override
    public void enterRoomInfo() {
        try {
            System.out.print("ID: ");
            id = sc.next();
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Base cost: ");
            baseCost = sc.nextDouble();
            sc.nextLine();
            System.out.print("Checkin date (dd/MM/yyyy): ");
            String stringCheckinDate = sc.nextLine();
            System.out.print("Checkout date (dd/MM/yyyy): ");
            String stringCheckoutDate = sc.nextLine();
            checkinDate = sdf.parse(stringCheckinDate);
            checkoutDate = sdf.parse(stringCheckoutDate);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateRoomById(String id) {
        if (this.id.equals(id)) {
            try {
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("Base cost: ");
                baseCost = sc.nextDouble();
                sc.nextLine();
                System.out.print("Checkin date (dd/MM/yyyy): ");
                String stringCheckinDate = sc.nextLine();
                System.out.print("Checkout date (dd/MM/yyyy): ");
                String stringCheckoutDate = sc.nextLine();
                checkinDate = sdf.parse(stringCheckinDate);
                checkoutDate = sdf.parse(stringCheckoutDate);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("1. ID: " + id);
        System.out.println("2. Name: " + name);
        System.out.println("3. Base cost: " + baseCost);
        System.out.println("4. Checkin date: " + sdf.format(checkinDate));
        System.out.println("5. Checkout date: " + sdf.format(checkoutDate));
    }

    long caculateCaculateDayStays() {
        return (checkoutDate.getTime() - checkinDate.getTime()) / (1000 * 60 * 60 * 24);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
}
