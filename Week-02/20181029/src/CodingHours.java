public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int hoursPerDay = 6;
        int totalWorkingDays = 17 * 5;
        int totalCodingHours = hoursPerDay * totalWorkingDays;

        System.out.println("Hours coding in a semester: " + totalCodingHours);

        int totalWorkingHours = 52 * 17;
        int hoursCoding = totalCodingHours * 100 / totalWorkingHours;

        System.out.println("Percentage of coding hours: " + hoursCoding + "%");
    }
}
