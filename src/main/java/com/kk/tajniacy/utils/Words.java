package com.kk.tajniacy.utils;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class Words {
    public static final List<String> words = List.of(
        "przerzutka", ,"szprycha", "rama", "siodło", "włos", "torba", "kwiat", "pindol", "koło", "wituś", "księżniczka", 
        "betoniarka", "łopata", "telefon", "rabarbar", "kibelek" , "biegunka", "tabletka", "bączek" , "piwo", "lufa", 
        "oliwa" , "pieprz", "jebanko", "frytka", "krejzega", "ściana", "grzmot", "krata", "smar", "wódeczka",
        "konfitura", "zamek", "skarb", "chujek", "oszustka"
        //    "AFRYKA","AGENT","POWIETRZE","OBCY","ALPY","AMAZONKA","KARETKA","AMERYKA","ANIOŁ","ANTARKTYDA",
        //    "JABŁKO","RAMIĘ","ATLANTYDA","AUSTRALIA","AZTEK","PLECY","PIŁKA","ZESPÓŁ","BANK","BAR","KORA","NIETOPERZ",
        //    "BATERIA","PLAŻA","NIEDŹWIEDŹ","ŁÓŻKO","PEKIN","DZWON","PASEK","BERLIN","BERMUDY","JAGODA",
        //    "RACHUNEK","BLOK","DESKA","ŚRUBA","BOMBA","OBLIGACJA","BUM","BAGAŻNIK","BUTELKA","UKŁON","SKRZYNKA","MOST",
        //    "SZCZOTKA","BAWÓŁ","BŁĄD","PRZYCISK","ŁYDKA","KANADA","CZAPKA","STOLICA","SAMOCHÓD",
       //     "KARTA","MARCHEWKA","KASYNO","RZUCAĆ","KOT","KOMÓRKA","CENTAUR","CENTRUM","KRZESŁO","OPŁATA",
       //     "SKRZYNIA","PISKLĘ","CHINY","CZEKOLADA","KOŚCIÓŁ","OKRĄG","KLIF","PŁASZCZ","KLUB","KOD",
        //    "PRZEZIĘBIENIE","KOMICZNY","MIESZANINA","KONCERT","KONDUKTOR","KONTRAKT","MIEDŹ","BAWEŁNA","SĄD",
        //    "POKRYWA","DŹWIG","KRYKIET","KRZYŻ","KORONA","CYKL","CZECH","TANIEC","DATA","DZIEŃ","ŚMIERĆ",
       //     "STOPIEŃ","DIAMENT","DINOZAUR","CHOROBA","LEKARZ","PIES","PROJEKT","SMOK",
        //    "SUKIENKA","WIERTARKA","KROPLA","KACZKA","KRASNOLUD","ORZEŁ","EGIPT","AMBASADA","SILNIK","ANGLIA","EUROPA",
      //      "OKO","TWARZ","SPADEK","WENTYLATOR","PŁOT","POLE","WOJOWNIK","POSTAĆ","PLIK","FILM","OGIEŃ",
       //    "RYBA","FLET","LATAĆ","STOPA","LAS","WIDELEC","FRANCJA","GRA","GAZ","GENIUSZ","NIEMCY",
      //      "DUCH","OGROMNY","SZKŁO","RĘKAWICA","ZŁOTO","WDZIĘK","TRAWKA","GRECJA","ZIELONY","GRUNT","SZYNKA","RĘKA",
       //     "JASTRZĄB","GŁOWA","SERCE","ŚMIGŁOWIEC","HIMALAJE","OTWÓR","HOLLYWOOD","MIÓD","KAPTUR","HAK","KLAKSON",
      //      "KOŃ","PODKOWA","SZPITAL","HOTEL","LÓD","INDIE","ŻELAZO","JACEK","DŻEM","STRUMIEŃ",
     //     "JOWISZ","KANGUR","KECZUP","KLUCZ","DZIECKO","KRÓL","KIWI","NÓŻ","RYCERZ","LABORATORIUM","OKRĄŻENIE",
       //     "LASER","PRAWNIK","OŁÓW","CYTRYNOWY","KRASNOLUDEK","ŻYCIE","ŚWIATŁO","LIMUZYNA","LINIA","LEW",
       //     "ŚMIECI","LOCH NESS","ZAMEK","DZIENNIK","LONDYN","SZCZĘŚCIE","POCZTA","MAMUT","KLON","MARMUR","MARSZ",
      //     "MASA","RTĘĆ","MEKSYK","MIKROSKOP","MILIONER","MOJE","MENNICA","POCISK","MODEL","KRET",
      //      "KSIĘŻYC","MOSKWA","UCHWYT","MYSZ","USTA","KUBEK","GWÓŹDŹ","IGŁA","INTERNET","NOWY JORK","NOC","NINJA",
      //      "UWAGA","POWIEŚĆ","PIELĘGNIARKA","ORZECH","OŚMIORNICA","OLEJ","OLIWA","OPERA","POMARAŃCZA",
      //    "ORGAN","PALMA","PATELNIA","SPODNIE","PAPIER","SPADOCHRON","PARK","CZĘŚĆ","PRZECHODZIĆ","PASTA","PINGWIN",
      //      "FENIKS","FORTEPIAN","CIASTO","PILOT","SZPILKA","RURA","PIRAT","PISTOLET","DÓŁ","POZIOM","SAMOLOT",
       //     "PLASTIKOWY","TALERZ","DZIOBAK","INTRYGOWAĆ","PUNKT","POLAK","POLICJA","BASEN",
     //       "PORT","POCZTA","FUNT","KSIĘŻNICZKA","DYNIA","UCZEŃ","PIRAMIDA","KRÓLOWA","KRÓLIK","RAKIETA",
      //      "PROMIEŃ","REWOLUCJA","ROBOT","GŁAZ","RZYM","ŹRÓDŁO","RÓŻA","RULETKA","WIERSZ",
      //      "LINIJKA","SATELITA","SATURN","SZKOŁA","NAUKOWIEC","SKORPION","EKRAN","NUREK","FOKA","SERWER","CIEŃ",
      //      "REKIN","STATEK","BUT","SKLEP","STRZAŁ","ŚLIMAK","PRZEMYTNIK",
     //     "ŚNIEG","BAŁWAN","SKARPETKA","ŻOŁNIERZ","DUSZA","DŹWIĘK","PRZESTRZEŃ","ZAKLĘCIE","PAJĄK","KOLEC","KRĘGOSŁUP",
      //      "MIEJSCE","WIOSNA","SZPIEG","KWADRAT","STADION","PERSONEL","GWIAZDA","PAŃSTWO","SŁOMA",
      //      "STRUMIEŃ","STRAJK","GARNITUR","SUPERBOHATER","HUŚTAWKA","PRZEŁĄCZNIK","TABELA","TABLET",
       //     "ETYKIETKA","OGON","NAUCZYCIEL","TELESKOP","ŚWIĄTYNIA","TEATR","ZŁODZIEJ","KCIUK","KLESZCZ",
      //      "KRAWAT","CZAS","TOKIO","ZĄB","LATARKA","WIEŻA","ŚCIEŻKA","POCIĄG","TRÓJKĄT","WYJAZD","PIEŃ","RURA","INDYK",
       //     "TRUMNA","JEDNOROŻEC","PRÓŻNIA","WETERYNARZ","BUDZIK","ŚCIANA","WOJNA",
      //      "PRALKA","WASZYNGTON","ZEGAREK","WODA","FALA","SIEĆ","WIELORYB","BICZ","WIATR","CZAROWNICA","ROBAK",
      //      "DZIEDZINIEC"
    );
}
