package ibm.ms.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;

import ibm.ms.models.Patient;

@ApplicationScoped
public class PatientRepository {

	public List<Patient> findAll() {
		return Patient.findAll().list();
	}

	public Patient findByName(String name) {
		return Patient.find("name", name).firstResult();
	}

	public Response save(Patient patient) {
		patient.persist();
		return Response.status(201).build();
	}
	

    public Response update(String name, Patient patient) {
        patient.update();
        return Response.status(201).build();
    }

	public Response delete(String name) {		
		Patient patient = Patient.findByName(name);
		patient.delete();
		return Response.status(201).build();
	}

}