package com.vitthal.quotes;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import org.apache.commons.text.WordUtils;

import java.util.HashMap;
import java.util.Map;

public class QuoteApp {
    public static void main(String[] args) {
        String[] quotes = {
            "talk is cheap. show me the code.",
            "first, solve the problem. then, write the code.",
            "   any fool can write code that a computer can understand.   "
        };

        System.out.println("Using WordUtils from commons-text (declared dependency)");
        for (String q : quotes) {
            System.out.println("  " + WordUtils.capitalize(q.trim()));
        }

        System.out.println("-------------------------");

        Map<String, String> values = new HashMap<>();
        values.put("name", "Vitthal");
        values.put("tool", "Maven");
        StringSubstitutor sub = new StringSubstitutor(values);
        System.out.println("  " + sub.replace("Hi ${name}, ${tool} downloaded commons-lang3 for you automatically."));

        System.out.println("-------------------------");

        System.out.println("Using StringUtils from commons-lang3 (transitive dependency, not in pom.xml)");
        for (String q : quotes) {
            String clean = StringUtils.normalizeSpace(q);
            System.out.println("  " + StringUtils.abbreviate(clean, 30) + " | words: " + (StringUtils.countMatches(clean, " ") + 1));
        }
        System.out.println("  Reversed : " + StringUtils.reverse("Maven"));

        System.out.println("-------------------------");
        System.out.println("Run 'mvn dependency:tree' to see commons-lang3 listed under commons-text");
    }
}
