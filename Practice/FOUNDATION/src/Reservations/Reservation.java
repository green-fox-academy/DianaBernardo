package Reservations;

import java.util.ArrayList;
import java.util.List;

public class Reservation implements Reservationy {

  private String code = "";
  private String days;

  @Override
  public String getDowBooking() {
    String[] daysArray = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int random = (int) (Math.random() * 7);
    days = daysArray[random];
    return days;
    }

  @Override
  public String getCodeBooking() {
    String sourceCode = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i < 8 ; i++) {
      int random = (int) (Math.random() * sourceCode.length());
      code += sourceCode.charAt(random);
    }
    return code;
  }

  public void booking() {
      System.out.printf("Booking# %s for %s%n", getCodeBooking(), getDowBooking());
    }
  }