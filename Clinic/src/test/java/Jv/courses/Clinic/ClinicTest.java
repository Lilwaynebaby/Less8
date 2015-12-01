package Jv.courses.Clinic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владимир on 30.11.2015.
 */
public class ClinicTest {

    @Test
    public void testAddClient() throws Exception {
        Clinic clinic  = new Clinic();
        clinic.addClient("Mark","Bars","cat");
        Assert.assertNotNull(clinic.clients[0]);
    }

    @Test
    public void testDeletePatient() throws Exception {
        Clinic clinic = new Clinic();
        clinic.addClient("Mark","Bars","dog");
        clinic.deletePatient(0);
        Assert.assertNull(clinic.clients[0]);

    }

    @Test
    public void testRename() throws Exception {
        Clinic clinic = new Clinic();
        /**
         * changes name client . Client have cat;
         */
        clinic.addClient("Mark","Bars","cat");
        clinic.addClient("Stiven","Bars","cat");
        clinic.rename("1","Stiven",0);
        Assert.assertEquals(clinic.clients[0].getName(),clinic.clients[1].getName());

        /**
         * changes name of pet . Pet - cat;
         */
        clinic.rename("2","Arsik",0);
        clinic.rename("2","Arsik",1);
        Assert.assertEquals(clinic.clients[0].getNamePet(),clinic.clients[1].getNamePet());

        /**
         * Change name of pet . Pet - dog
         */
        clinic.addClient("Nick","Sharik","dog");
        clinic.addClient("John","Rex","dog");
        clinic.rename("2","Rex",2);
        Assert.assertEquals(clinic.clients[2].getNamePet(),clinic.clients[3].getNamePet());

        /**
         * Change name of client , owner of dog
         */

        clinic.rename("1","Nick",3);
        Assert.assertEquals(clinic.clients[2].getName(),clinic.clients[3].getName());

    }

    @Test
    public void testSearch() throws Exception {
        Clinic clinic = new Clinic();
        clinic.addClient("Mark","Bars","cat");

        /**
         * Search for an existing owner name
         */
        clinic.search("Mark","1");
        Assert.assertTrue(clinic.inList);

        /**
         * Search for an existing  pet name
         */
        clinic.search("Bars","2");
        Assert.assertTrue(clinic.inList);
    }

}