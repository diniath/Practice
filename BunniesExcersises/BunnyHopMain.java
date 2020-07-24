/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nande
 */
public class BunnyHopMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bunny b1 = new Bunny(1);
        Bunny b2 = new Bunny(2);
        Bunny b3 = new Bunny(3);
        Bunny b4 = new Bunny(4);
        Bunny b5 = new Bunny(5);

        List<Bunny> listOfBunnies = new ArrayList();
        listOfBunnies.add(b1);
        listOfBunnies.add(b2);
        listOfBunnies.add(b3);
        listOfBunnies.add(b4);
        listOfBunnies.add(b5);
        
        for (int i = 0; i < listOfBunnies.size(); i++) {
            System.out.println(listOfBunnies.get(i).hop());
        }

        Iterator<Bunny> itBun = listOfBunnies.iterator();
        while (itBun.hasNext()) {
            System.out.println("Looping through the bunny list, this is bunny number " + itBun.next().getBunnyNumber());
        }
        
        Map<String, Integer> bunMap = new HashMap();
        bunMap.put("Smiley", b1.getBunnyNumber());
        bunMap.put("Petunia", b2.getBunnyNumber());
        bunMap.put("Roger", b3.getBunnyNumber());
        bunMap.put("Kitty", b4.getBunnyNumber());
        bunMap.put("Saloon", b5.getBunnyNumber());
        
        Set<String> keys = bunMap.keySet();
        for (String key : keys){
            System.out.println(key + " is bunny number " + bunMap.get(key));
        }

    }
}
