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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Cristy
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({appointmentsapp.AppointmentAppJUnitTesterIT.class, appointmentsapp.DailyAppointmentIT.class, appointmentsapp.AppointmentsAppIT.class, appointmentsapp.MonthlyAppointmentIT.class, appointmentsapp.AppointmentIT.class, appointmentsapp.OneTimeAppointmentIT.class})
public class AppointmentsappITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
