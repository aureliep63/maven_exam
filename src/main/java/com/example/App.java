package com.example;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person("PEDRO", "Aurélie");

        // Convertir une Person en JSon
        String json = convertToJson(person);
        System.out.println("JSON: " + json);

        // Capitaliser une chaine
        String str = "je suis en cours pour apprendre MAVEN";
        String capitalizedStr = capitalizeString(str);
        System.out.println("Capitalized: " + capitalizedStr);
    }

      public static String convertToJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String capitalizeString(String str) {
        return StringUtils.capitalize(str);
    }
}
