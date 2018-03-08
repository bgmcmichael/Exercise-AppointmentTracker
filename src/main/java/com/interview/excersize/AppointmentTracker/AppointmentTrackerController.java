package com.interview.excersize.AppointmentTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fenji on 3/7/2018.
 */
@Controller
public class AppointmentTrackerController {
    @Autowired
    AppointmentsRepository AppsRepo;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String landing() {
        return "redirect:/home.html";
    }
}
