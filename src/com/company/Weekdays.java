package com.company;

public enum Weekdays {
    MONDAY("birinchi kunu java lesson okuim"),
    TUESDAY("ekinchi kunu practice lesson okuim"),
    WEDNESDAY("uchunchu kunu english for advanced lesson okuim"),
    THURSDAY("tortunchu kunu english for beginners lesson okuim"),
    FRIDAY("beshinchi kunu soft-skills lesson okuim"),
    SATURDAY("altynchy kunu koshumcha session ozumo otkurom"),
    SUNDAY("jetinchi kunu home session otkorom");

    Weekdays() {
    }

    private String raspisanie;

    Weekdays(String raspisanie) {
        this.raspisanie = raspisanie;
    }

    public String getRaspisanie() {
        return raspisanie;
    }

    @Override
    public String toString() {
        return  getRaspisanie();
    }
}
