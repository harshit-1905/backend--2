package com.example.findR.testing_api_fields;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.*;

public class missingFields {

    // Main method: compares multiple JsonNodes (e.g., 3 responses)
    public static List<List<String>> diff( List<JsonNode> nodes) {
        List<List<String>> diffs = new  ArrayList<>();

        // 1) Collect union of all keys across all JSONs
        Set<String> allKeys = new LinkedHashSet<>();
        for (JsonNode node : nodes) {
            node.fieldNames().forEachRemaining(allKeys::add);
        }

        // 2) find missing fields
        List<List<String>> values = new ArrayList<>();

       // Initialize inner lists dynamically for each JsonNode
        for (int i = 0; i < nodes.size(); i++) {
            values.add(new ArrayList<>());  // each API gets its own list
        }
         // Iterate over all keys
        for (String key : allKeys) {
            for (int i = 0; i < nodes.size(); i++) {
                JsonNode node = nodes.get(i);
                if (!node.has(key)) {
                    values.get(i).add(key); // record missing field
                }
            }
        }
        return values;
    }
}
