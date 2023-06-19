package com.kk.tajniacy.dto;

import com.kk.tajniacy.model.Word;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WordsDto {
    private List<Word> words;
}
