/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentsapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristy
 */

    
 public class AppointmentAppJUnitTesterIT {
    
    AppointmentsApp myAppts = new AppointmentsApp();  //instantiate the driver class (main class)
    
   
    public void testOccursOn()
    {
        //Create the Appointments array with 3 types of appointments:
         myAppts.myAppointments = new Appointment[3];
         myAppts.myAppointments[0] = new OneTimeAppointment(2018, 10, 19, "Birthday Celebration");
         myAppts.myAppointments[1] = new DailyAppointment("Trainer Workout");
         myAppts.myAppointments[2] = new MonthlyAppointment(15, "manicure");
         
         //Create tests for occursOn() method, and then do Assertions to test if the results are as expected:
         boolean expectedResult = true;
         boolean result = myAppts.myAppointments[0].occursOn(2018, 10, 19);
         assertEquals(expectedResult, result);
         fail("This test failed to show oneTime appointment occursOn() method is working correctly.");
         
         boolean expectedResult = false;
         boolean result = myAppts.myAppointments[0].occursOn(2018, 10, 21);
         assertEquals(expectedResult, result);
         fail("This test failed to show oneTime appointment occursOn() method is working correctly.");
         
         expectedResult = true;
         result = myAppts.myAppointments[1].occursOn(2018, 11, 15);
         assertEquals(expectedResult, result);
         fail("This test failed to show daily appointment occursOn() method is working correctly.");
         
                  
         expectedResult = true;
         result = myAppts.myAppointments[2].occursOn(2018, 10, 15);
         assertEquals(expectedResult, result);
         fail("This test failed to show monthly appointment occursOn() method is working correctly.");
         
         expectedResult = false;
         result = myAppts.myAppointments[2].occursOn(2018, 10, 19);
         assertEquals(expectedResult, result);
         fail("This test failed to show monthly appointment occursOn() method is working correctly.");
         
    }
    }
    