import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// task 1: implement method to parse textual representation into LocalDateTime
class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        // define format
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");

        // parse text into LocalDateTime
        LocalDateTime  parsedDate = LocalDateTime.parse(appointmentDateDescription, inputFormatter);
        return parsedDate;    
    }
    
    // task 2: check if appointment has passed
    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(appointmentDate);
    }
    // task 3: check if appointment is in the afternoon
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }
    // task 4: describe time, date of appointment
    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter usFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a", Locale.US);
        return "You have an appointment on " + appointmentDate.format(usFormatter) + ".";
    }

    // return anniversary date
    public LocalDate getAnniversaryDate() {
        LocalDate now = LocalDate.now();
        int currentYear = now.getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
