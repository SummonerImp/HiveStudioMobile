package com.example.projetotcc.models;

import org.json.JSONObject;

public interface AsyncResponse {
    void processFinished(JSONObject jsonObject);
}
