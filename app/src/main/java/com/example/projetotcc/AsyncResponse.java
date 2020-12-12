package com.example.projetotcc;

import com.example.projetotcc.models.Fotografo;

import java.util.List;

public interface AsyncResponse {
    void loadlistFinished(List<Fotografo> list);
}
