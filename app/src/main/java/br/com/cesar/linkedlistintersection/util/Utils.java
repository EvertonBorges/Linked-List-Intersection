package br.com.cesar.linkedlistintersection.util;

import java.util.ArrayList;
import java.util.List;

import br.com.cesar.linkedlistintersection.model.Email;

public class Utils {

    public static List<Email> getIntersection(List<Email> firstList, List<Email> secondList) {
        List<Email> newList = new ArrayList<>();

        if (firstList != null && !firstList.isEmpty() && secondList != null && !secondList.isEmpty()) {
            for(Email email: firstList) {
                if (secondList.contains(email)) newList.add(email);
            }
        }

        return newList;
    }

}