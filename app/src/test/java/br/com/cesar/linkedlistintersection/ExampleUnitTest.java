package br.com.cesar.linkedlistintersection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cesar.linkedlistintersection.model.Email;
import br.com.cesar.linkedlistintersection.util.Utils;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void testGetIntersection() {
        final Email email1 = new Email("test1@email.com", "title1", "message1");
        final Email email2 = new Email("test2@email.com", "title2", "message2");
        final Email email3 = new Email("test3@email.com", "title3", "message3");
        final Email email4 = new Email("test4@email.com", "title4", "message4");
        final Email email5 = new Email("test5@email.com", "title5", "message5");
        final Email email6 = new Email("test6@email.com", "title6", "message5");
        final Email email7 = new Email("test7@email.com", "title7", "message7");
        final Email email8 = new Email("test8@email.com", "title8", "message8");

        List<Email> emails1 = new ArrayList<>(Arrays.asList(email1, email2, email3, email4, email7, email8));
        List<Email> emails2 = new ArrayList<>(Arrays.asList(email1, email2, email5, email6, email7, email8));

        List<Email> intersection = Utils.getIntersection(emails1, emails2);

        assertEquals(4, intersection.size());

        assertTrue(intersection.contains(email1));
        assertTrue(intersection.contains(email2));
        assertTrue(intersection.contains(email7));
        assertTrue(intersection.contains(email8));

        assertFalse(intersection.contains(email3));
        assertFalse(intersection.contains(email4));
        assertFalse(intersection.contains(email5));
        assertFalse(intersection.contains(email6));
    }

}