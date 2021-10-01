package com.deepblue.hotspot_inaction.chapter_00_init;

/**
 * JDK1.7 以后switch 增强
 */
public class JDK_01_Switch {

    public static void main(String[] args) {
        String bankId = getBankIdByBankName("AAAA");
        System.out.println("bankId : " + bankId);
    }

    public static String getBankIdByBankName(String bankName) {
        String bankId = "";
        switch (bankName) {
            case "ICBC" :
                bankId = "B0001";
                break;
            case "ABCD" :
                bankId = "B0002";
                break;
            case "KKII" :
                bankId = "B0003";
                break;
            default :
                bankId = "B0004";

        }
        return bankId;
    }
}
