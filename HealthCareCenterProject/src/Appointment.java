import java.time.LocalDate;
import java.util.Objects;

public class Appointment {
	
	private Patient patient;
	private LocalDate appointmentDate;
	
	//constructor

	public Appointment(Patient patient, LocalDate appointmentDate) {
		setPatient(patient);
		setAppointmentDate(appointmentDate);
	}
	
	//getter
	
	/*
	 * @return patient
	 */
	public Patient getPatient() {
		return patient;
	}
	/*
	 * @return appointmentDate
	 */
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	
	//setter
	
	/*
	 * @param patient
	 */
	public void setPatient(Patient patient) {
		if(Objects.nonNull(patient)) {
			this.patient = patient;
		}
	}
	/*
	 * @param appointmentDate
	 */
	public void setAppointmentDate(LocalDate appointmentDate) {
		if (Objects.nonNull(appointmentDate)) {
			this.appointmentDate = appointmentDate;
		} else {
			this.appointmentDate = LocalDate.now();
		}		
	}
	
	@Override
	public String toString() {
		return "\n*** Patient Appointment Date ***" +
				"\nPatient Name : " + patient.getFirstName() + " " + patient.getLastName() +
				"\nAppointment date : " + appointmentDate;
	}
}