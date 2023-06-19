package com.kk.tajniacy.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Word {
    private String word;
    private boolean inUse;
}
