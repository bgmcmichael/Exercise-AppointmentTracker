package com.interview.excersize.AppointmentTracker;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fenji on 3/7/2018.
 */
public interface AppointmentsRepository extends CrudRepository<Appointment, Integer> {
    List<Appointment> findByDescriptionContaining(String description);
}
