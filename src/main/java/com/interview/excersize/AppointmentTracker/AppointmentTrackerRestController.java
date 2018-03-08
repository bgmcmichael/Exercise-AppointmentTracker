package com.interview.excersize.AppointmentTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by fenji on 3/7/2018.
 */
@RestController
public class AppointmentTrackerRestController {
    @Autowired
    AppointmentsRepository AppsRepo;

    @RequestMapping(path = "/appointments.json", method = RequestMethod.POST)
    public ArrayList<Appointment> getAppointments(HttpSession session, @RequestBody Search search) throws Exception{
        System.out.println("this is the contents of searchText: " + search.searchText);
        ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
        if(search.searchText == "") {
            Iterable<Appointment> appointments = AppsRepo.findAll();
            for (Appointment appointment : appointments) {
                appointmentList.add(appointment);
                System.out.println(appointment.description);
            }
        } else{
            appointmentList = new ArrayList<>(AppsRepo.findByDescriptionContaining(search.searchText));
        }

        return appointmentList;
    }

    @RequestMapping(path = "/addAppointment", method = RequestMethod.POST)
    public String addAppointment(HttpSession session, @RequestBody Appointment newAppointment) throws Exception {
        System.out.println(newAppointment.getDescription() + " attempting to save");
        AppsRepo.save(newAppointment);

        return "redirect:/";
    }
}
