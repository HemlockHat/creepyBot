package org.vashonsd;

import java.util.HashMap;
import java.util.Map;

public class Node {
    Map<String, Node> connectedNodes;
    String prompt;

    public Node(String prompt) {
        connectedNodes = new HashMap<String, Node>();
        this.prompt = prompt;
    }

    public void addResponse(String key, Node whereToGo) {
        connectedNodes.put(key, whereToGo);
    }

    public String getPrompt() {
        return this.prompt;
    }

    public boolean hasMoreToSay() {
        return (!connectedNodes.isEmpty());
    }

    public Node handle(String response) {
        //find the node that answers to response in the map.
        if(!connectedNodes.containsKey(response)) {
            return null;
        } else {
            return connectedNodes.get(response);
        }
    }
}
