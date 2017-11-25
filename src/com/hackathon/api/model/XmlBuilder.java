package com.hackathon.api.model;

public class XmlBuilder {

    public static String makeErrorXmlString(Errors error){
        StringBuilder str = new StringBuilder();
        str.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        str.append("<HACKATHON>");
        str.append("<ERROR>");
        str.append("<ERROR_ID>").append(String.valueOf(error.getErrorId())).append("</ERROR_ID>");
        str.append("<ERROR_MESSAGE>").append(error.getErrorMessage()).append("</ERROR_MESSAGE>");
        str.append("</ERROR>");
        str.append("</HACKATHON>");
        return  str.toString();
    }

    public static String makeUserProfileXmlString(User user){
        StringBuilder str = new StringBuilder();
        str.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        str.append("<HACKATHON>");
        str.append("<USER_INFO>");

        str.append("<NAME>").append(user.getName()).append("</NAME>");
        str.append("<SURNAME>").append(user.getSurname()).append("</SURNAME>");
        str.append("<LANGUAGE_ONE>").append(user.getLanguageOne()).append("</LANGUAGE_ONE>");
        str.append("<LANGUAGE_TWO>").append(user.getLanguageTwo()).append("</LANGUAGE_TWO>");

        str.append("<WORKING_DAYS>");
        for (Day day : user.getWorkingDays()) {
            str.append("<Day>");
            str.append("<Name>").append(day.getName()).append("</Name>");
            str.append("<TIME_FROM>").append(day.getTimeFrom()).append("</TIME_FROM>");
            str.append("<TIME_TO>").append(day.getTimeTo()).append("</TIME_TO>");
            str.append("</Day>");
        }
        str.append("</WORKING_DAYS>");

        str.append("<RATING>").append(String.valueOf(user.getRating())).append("</RATING>");
        str.append("<HOURS_WORKED>").append(String.valueOf(user.getHoursWorked())).append("</HOURS_WORKED>");
        str.append("<MONEY_EARNED>").append(String.valueOf(user.getMoneyEarned())).append("</MONEY_EARNED>");

        str.append("</USER_INFO>");
        str.append("</HACKATHON>");
        return  str.toString();
    }

}
