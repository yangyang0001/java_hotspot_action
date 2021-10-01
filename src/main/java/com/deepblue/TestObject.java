package com.deepblue;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import lombok.*;
import org.apache.commons.collections4.CollectionUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class TestObject {

    public static void main(String[] args) throws Exception{

//        long JNI_VERSION_1_1 = 0x00010001;
//        long JNI_VERSION_1_2 = 0x00010002;
//        long JNI_VERSION_1_4 = 0x00010004;
//        long JNI_VERSION_1_6 = 0x00010006;
//
//        System.out.println("JNI_VERSION_1_1 = " + JNI_VERSION_1_1);
//        System.out.println("JNI_VERSION_1_2 = " + JNI_VERSION_1_2);
//        System.out.println("JNI_VERSION_1_4 = " + JNI_VERSION_1_4);
//        System.out.println("JNI_VERSION_1_6 = " + JNI_VERSION_1_6);

//        List<Integer> allCodes0 = Lists.newArrayList(1, 2, 3);
//        List<Integer> allCodes1 = Lists.newArrayList();
//
//        List<Integer> codes0 = Lists.newArrayList(1);
//        List<Integer> codes1 = Lists.newArrayList(1, 2);
//        List<Integer> codes2 = Lists.newArrayList(1, 2, 3);
//        List<Integer> codes3 = Lists.newArrayList(2, 4);
//        List<Integer> codes4 = Lists.newArrayList();
//        List<Integer> codes5 = null;
//
//        System.out.println(allCodes0.containsAll(codes0));
//        System.out.println(allCodes0.containsAll(codes1));
//        System.out.println(allCodes0.containsAll(codes2));
//        System.out.println(allCodes0.containsAll(codes3));
//        System.out.println(allCodes0.containsAll(codes4));
//        System.out.println(allCodes0.containsAll(codes5));

//        System.out.println("1------------------------------------------------------");
//
//        System.out.println(allCodes1.containsAll(codes0));
//        System.out.println(allCodes1.containsAll(codes1));
//        System.out.println(allCodes1.containsAll(codes2));
//        System.out.println(allCodes1.containsAll(codes3));
//        System.out.println(allCodes1.containsAll(codes4));
////        System.out.println(allCodes1.containsAll(codes5));
//
//        System.out.println("2------------------------------------------------------");


//        List<Integer> resultList = Lists.newArrayList(1, 3, 5, 7, 9, 11, 10);
//        System.out.println("resultList before :" + JSON.toJSONString(resultList));
//        List<Integer> expireList = Lists.newArrayList(2, 3, 5);
//        resultList.removeAll(expireList);
//        System.out.println("resultList after  :" + JSON.toJSONString(resultList));

//        User user0 = new User(10, "");
//        User user1 = new User(14, "");
//        User user2 = new User(62, "");
//        User user3 = new User(33, "");
//        User user4 = new User(55, "");
//        User user5 = new User(33, "");

//        List<User> users = Lists.newArrayList(user0, user1, user2, user3, user4, user5);
//        System.out.println("users before :" + JSON.toJSONString(users));

//        decorate(users);
//        System.out.println("users after  :" + JSON.toJSONString(users));

//        sortedNobleUserList(users);
//        System.out.println("users sorted :" + JSON.toJSONString(users));

//        int pageSize = 4;
//        for(int i = 0; i < 10; i++) {
//            int pageIndex = i;
//            List<User> list  = getPageList(users, pageIndex, pageSize);
//
//            System.out.println("list :" + JSON.toJSONString(list));
//        }
//        Long timeMillis = System.currentTimeMillis();
//        Long currentSecond = timeMillis / 1000;
//        System.out.println("timeMillis    :" + timeMillis);
//        System.out.println("currentSecond :" + currentSecond);

//        User user = new User();
//        System.out.println("user :" + JSON.toJSONString(user));
//        decorateUser(user);
//        System.out.println("user :" + JSON.toJSONString(user));

//        List<Long> list = Lists.newArrayList();
//        System.out.println(list.contains(200L));
//        System.out.println(list.size());
//        list.add(1000000L);
//        list.add(2000000L);
//        System.out.println(JSON.toJSONString(list));
//
//        String a = "[1000000,2000000]";
//        List<Long> longs = JSONObject.parseArray(null, Long.class);
//        System.out.println(JSON.toJSONString(longs));

//        SimpleDateFormat defaultSDF = new SimpleDateFormat("yyyy-MM-dd");
//        String contractEffectiveTimeStr = defaultSDF.format(new Date());
//        Date contractEffectiveTime = null;
//        try {
//            contractEffectiveTime = defaultSDF.parse(contractEffectiveTimeStr);
//        } catch (ParseException pe) {
//            pe.printStackTrace();
//        }
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(contractEffectiveTime);
//        calendar.add(Calendar.YEAR, 1);
//        calendar.add(Calendar.DATE, -1);
//        Date contractExpirationTime = calendar.getTime();
//
//        SimpleDateFormat mineSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println("contractEffectiveTime  :" + mineSDF.format(contractEffectiveTime));
//        System.out.println("contractExpirationTime :" + mineSDF.format(contractExpirationTime));

//        KlassUser klassUser = new KlassUser();
//        klassUser.userList = Lists.newArrayList();
//        klassUser.getUserList().add(new User(100, "100"));
//        klassUser.getUserList().add(new User(200, "200"));
//        klassUser.getUserList().add(new User(300, "300"));
//
//        klassUser.strList  = Lists.newArrayList();
//        klassUser.getStrList().add("11111");
//        klassUser.getStrList().add("22222");
//        klassUser.getStrList().add("33333");
//
//        System.out.println("klassUser :" + JSON.toJSONString(klassUser));

//        ClassState classState = ClassState.OTHER;
//        switch (classState) {
//            case UNPARSABLE_BY_GC:
//                System.out.println("UNPARSABLE_BY_GC");
//                break;
//            case ALLOCATED:
//                System.out.println("ALLOCATED");
//                break;
//            case LOADED:
//                System.out.println("LOADED");
//                break;
//            case LINKED:
//                System.out.println("LINKED");
//                break;
//            case BEING_INITIALIZED:
//                System.out.println("BEING_INITIALIZED");
//                break;
//            case FULLY_INITIALIZED:
//                System.out.println("FULLY_INITIALIZED");
//                break;
//            case INITIALIZATION_ERROR:
//                System.out.println("INITIALIZATION_ERROR");
//                break;
//            default:
//                System.out.println("DEFAULT");
//                break;
//        }

//        List<User> userList = Lists.newArrayList();
//        List<User> otheList = null;
//        userList.addAll(otheList);


//        long seconds = TimeUnit.DAYS.toSeconds(1);
//
//        long day_sec = 60 * 60 * 24;
//        System.out.println(seconds);
//        System.out.println(day_sec);

//        SimpleDateFormat defaultSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        String effectiveTimeStr = "2021-07-22 15:58:08";
//        Date effectiveTime = defaultSDF.parse(effectiveTimeStr);
//        Integer duration = 10;
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(effectiveTime);
//        calendar.add(Calendar.DATE, duration);
//        Date expirationTime = calendar.getTime();
//
//        System.out.println(defaultSDF.format(effectiveTime));
//        System.out.println(defaultSDF.format(expirationTime));
//        GameFreeConfigParam update = GameFreeConfigParam.builder()
//                .id()
//                .gameKey()
//                .excelURL()
//                .freeCount()
//                .personCount()
//                .effectiveTime()
//                .duration()
//                .stationCopy()
//                .status()
//                .deleteFlag()
//                .operator()
//                .build();

//        String aaa = "sun/misc/BASE64Encoder";
//        String bbb = "encodeBuffer";
//        String ccc = "([B)Ljava/lang/String;";
//
//        System.out.println(aaa.length());
//        System.out.println(bbb.length());
//        System.out.println(ccc.length());

//        SimpleDateFormat defaultSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String start = "2021-08-09 16:16:22";
//        String end   = "2021-08-09 16:16:22";
//
//        Date startDate = defaultSDF.parse(start);
//        Date endDate = defaultSDF.parse(start);
//
//        if(startDate.before(endDate)) {
//            System.out.println("start before end");
//        } else {
//            System.out.println("start not before end");
//        }
//        if(startDate.after(endDate)) {
//            System.out.println("start after end");
//        } else {
//            System.out.println("start not after end");
//        }
//
//        String body = "{\"notification_type\":\"REFUND\", \"environment\":\"PROD\", \"unified_receipt\":{\"status\":0, \"environment\":\"Production\", \"latest_receipt_info\":[{\"quantity\":\"1\", \"product_id\":\"com.laifeng.12000star.v1\", \"transaction_id\":\"400000917716668\", \"purchase_date\":\"2021-08-11 16:46:29 Etc/GMT\", \"purchase_date_ms\":\"1628700389000\", \"purchase_date_pst\":\"2021-08-11 09:46:29 America/Los_Angeles\", \"original_purchase_date\":\"2021-08-11 16:46:29 Etc/GMT\", \"original_purchase_date_ms\":\"1628700389000\", \"original_purchase_date_pst\":\"2021-08-11 09:46:29 America/Los_Angeles\", \"is_trial_period\":\"false\", \"original_transaction_id\":\"400000917716668\", \"cancellation_date\":\"2021-08-13 07:15:28 Etc/GMT\", \"cancellation_date_ms\":\"1628838928000\", \"cancellation_date_pst\":\"2021-08-13 00:15:28 America/Los_Angeles\", \"cancellation_reason\":\"0\", \"in_app_ownership_type\":\"PURCHASED\"}, {\"quantity\":\"1\", \"product_id\":\"com.laifeng.6000star.v1\", \"transaction_id\":\"400000917660546\", \"purchase_date\":\"2021-08-11 14:41:25 Etc/GMT\", \"purchase_date_ms\":\"1628692885000\", \"purchase_date_pst\":\"2021-08-11 07:41:25 America/Los_Angeles\", \"original_purchase_date\":\"2021-08-11 14:41:25 Etc/GMT\", \"original_purchase_date_ms\":\"1628692885000\", \"original_purchase_date_pst\":\"2021-08-11 07:41:25 America/Los_Angeles\", \"is_trial_period\":\"false\", \"original_transaction_id\":\"400000917660546\", \"cancellation_date\":\"2021-08-13 07:15:30 Etc/GMT\", \"cancellation_date_ms\":\"1628838930000\", \"cancellation_date_pst\":\"2021-08-13 00:15:30 America/Los_Angeles\", \"cancellation_reason\":\"0\", \"in_app_ownership_type\":\"PURCHASED\"}, {\"quantity\":\"1\", \"product_id\":\"com.laifeng.6000star.v1\", \"transaction_id\":\"400000917660158\", \"purchase_date\":\"2021-08-11 14:40:37 Etc/GMT\", \"purchase_date_ms\":\"1628692837000\", \"purchase_date_pst\":\"2021-08-11 07:40:37 America/Los_Angeles\", \"original_purchase_date\":\"2021-08-11 14:40:37 Etc/GMT\", \"original_purchase_date_ms\":\"1628692837000\", \"original_purchase_date_pst\":\"2021-08-11 07:40:37 America/Los_Angeles\", \"is_trial_period\":\"false\", \"original_transaction_id\":\"400000917660158\", \"cancellation_date\":\"2021-08-13 07:13:18 Etc/GMT\", \"cancellation_date_ms\":\"1628838798000\", \"cancellation_date_pst\":\"2021-08-13 00:13:18 America/Los_Angeles\", \"cancellation_reason\":\"0\", \"in_app_ownership_type\":\"PURCHASED\"}, {\"quantity\":\"1\", \"product_id\":\"com.laifeng.6000star.v1\", \"transaction_id\":\"400000917658797\", \"purchase_date\":\"2021-08-11 14:37:34 Etc/GMT\", \"purchase_date_ms\":\"1628692654000\", \"purchase_date_pst\":\"2021-08-11 07:37:34 America/Los_Angeles\", \"original_purchase_date\":\"2021-08-11 14:37:34 Etc/GMT\", \"original_purchase_date_ms\":\"1628692654000\", \"original_purchase_date_pst\":\"2021-08-11 07:37:34 America/Los_Angeles\", \"is_trial_period\":\"false\", \"original_transaction_id\":\"400000917658797\", \"cancellation_date\":\"2021-08-13 07:15:33 Etc/GMT\", \"cancellation_date_ms\":\"1628838933000\", \"cancellation_date_pst\":\"2021-08-13 00:15:33 America/Los_Angeles\", \"cancellation_reason\":\"0\", \"in_app_ownership_type\":\"PURCHASED\"}], \"latest_receipt\":\"MIISkwYJKoZIhvcNAQcCoIIShDCCEoACAQExCzAJBgUrDgMCGgUAMIICNAYJKoZIhvcNAQcBoIICJQSCAiExggIdMAoCARQCAQEEAgwAMAsCARkCAQEEAwIBAzAMAgEOAgEBBAQCAgCKMAwCARMCAQEEBAwCMjcwDQIBAwIBAQQFDAM0MTYwDQIBCgIBAQQFFgMxNyswDQIBDQIBAQQFAgMCJZ0wDgIBAQIBAQQGAgQ15PhoMA4CAQkCAQEEBgIEUDI1NjAOAgELAgEBBAYCBAcMRzswDgIBEAIBAQQGAgQyRX+8MBQCAQACAQEEDAwKUHJvZHVjdGlvbjAYAgEEAgECBBDnm+EKTp0p26wb8jVstZUpMBsCAQICAQEEEwwRY29tLnlvdWt1LkxhaUZlbmcwHAIBBQIBAQQUnS5gUm54fNs20jEVOqnyrEu89cowHgIBCAIBAQQWFhQyMDIxLTA4LTExVDE0OjQwOjM3WjAeAgEMAgEBBBYWFDIwMjEtMDgtMTNUMDc6Mjg6MjVaMB4CARICAQEEFhYUMjAyMS0wOC0xMVQxNDo0MDozN1owTwIBBwIBAQRHfO4JQlUWBnu0XYhHzf7Lqao26646JxveF8IsYjg/1HSGbU7lnYQoE2FtisO8ByEiI54DieH71P+zvWwTzJwFqk7OFgJTw94wXQIBBgIBAQRVN83HgjDOsRPv0JOi5fozLZCw38RoXrreG3GAYOLlId6zG36NX8ImDFBy2q5XMYxoOxxcs1WDZnsi0ftgG49a7qQWHBiiEo/8yvXnYlR+QwJop3khsKCCDmUwggV8MIIEZKADAgECAggO61eH554JjTANBgkqhkiG9w0BAQUFADCBljELMAkGA1UEBhMCVVMxEzARBgNVBAoMCkFwcGxlIEluYy4xLDAqBgNVBAsMI0FwcGxlIFdvcmxkd2lkZSBEZXZlbG9wZXIgUmVsYXRpb25zMUQwQgYDVQQDDDtBcHBsZSBXb3JsZHdpZGUgRGV2ZWxvcGVyIFJlbGF0aW9ucyBDZXJ0aWZpY2F0aW9uIEF1dGhvcml0eTAeFw0xNTExMTMwMjE1MDlaFw0yMzAyMDcyMTQ4NDdaMIGJMTcwNQYDVQQDDC5NYWMgQXBwIFN0b3JlIGFuZCBpVHVuZXMgU3RvcmUgUmVjZWlwdCBTaWduaW5nMSwwKgYDVQQLDCNBcHBsZSBXb3JsZHdpZGUgRGV2ZWxvcGVyIFJlbGF0aW9uczETMBEGA1UECgwKQXBwbGUgSW5jLjELMAkGA1UEBhMCVVMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQClz4H9JaKBW9aH7SPaMxyO4iPApcQmyz3Gn+xKDVWG/6QC15fKOVRtfX+yVBidxCxScY5ke4LOibpJ1gjltIhxzz9bRi7GxB24A6lYogQ+IXjV27fQjhKNg0xbKmg3k8LyvR7E0qEMSlhSqxLj7d0fmBWQNS3CzBLKjUiB91h4VGvojDE2H0oGDEdU8zeQuLKSiX1fpIVK4cCc4Lqku4KXY/Qrk8H9Pm/KwfU8qY9SGsAlCnYO3v6Z/v/Ca/VbXqxzUUkIVonMQ5DMjoEC0KCXtlyxoWlph5AQaCYmObgdEHOwCl3Fc9DfdjvYLdmIHuPsB8/ijtDT+iZVge/iA0kjAgMBAAGjggHXMIIB0zA/BggrBgEFBQcBAQQzMDEwLwYIKwYBBQUHMAGGI2h0dHA6Ly9vY3NwLmFwcGxlLmNvbS9vY3NwMDMtd3dkcjA0MB0GA1UdDgQWBBSRpJz8xHa3n6CK9E31jzZd7SsEhTAMBgNVHRMBAf8EAjAAMB8GA1UdIwQYMBaAFIgnFwmpthhgi+zruvZHWcVSVKO3MIIBHgYDVR0gBIIBFTCCAREwggENBgoqhkiG92NkBQYBMIH+MIHDBggrBgEFBQcCAjCBtgyBs1JlbGlhbmNlIG9uIHRoaXMgY2VydGlmaWNhdGUgYnkgYW55IHBhcnR5IGFzc3VtZXMgYWNjZXB0YW5jZSBvZiB0aGUgdGhlbiBhcHBsaWNhYmxlIHN0YW5kYXJkIHRlcm1zIGFuZCBjb25kaXRpb25zIG9mIHVzZSwgY2VydGlmaWNhdGUgcG9saWN5IGFuZCBjZXJ0aWZpY2F0aW9uIHByYWN0aWNlIHN0YXRlbWVudHMuMDYGCCsGAQUFBwIBFipodHRwOi8vd3d3LmFwcGxlLmNvbS9jZXJ0aWZpY2F0ZWF1dGhvcml0eS8wDgYDVR0PAQH/BAQDAgeAMBAGCiqGSIb3Y2QGCwEEAgUAMA0GCSqGSIb3DQEBBQUAA4IBAQANphvTLj3jWysHbkKWbNPojEMwgl/gXNGNvr0PvRr8JZLbjIXDgFnf4+LXLgUUrA3btrj+/DUufMutF2uOfx/kd7mxZ5W0E16mGYZ2+FogledjjA9z/Ojtxh+umfhlSFyg4Cg6wBA3LbmgBDkfc7nIBf3y3n8aKipuKwH8oCBc2et9J6Yz+PWY4L5E27FMZ/xuCk/J4gao0pfzp45rUaJahHVl0RYEYuPBX/UIqc9o2ZIAycGMs/iNAGS6WGDAfK+PdcppuVsq1h1obphC9UynNxmbzDscehlD86Ntv0hgBgw2kivs3hi1EdotI9CO/KBpnBcbnoB7OUdFMGEvxxOoMIIEIjCCAwqgAwIBAgIIAd68xDltoBAwDQYJKoZIhvcNAQEFBQAwYjELMAkGA1UEBhMCVVMxEzARBgNVBAoTCkFwcGxlIEluYy4xJjAkBgNVBAsTHUFwcGxlIENlcnRpZmljYXRpb24gQXV0aG9yaXR5MRYwFAYDVQQDEw1BcHBsZSBSb290IENBMB4XDTEzMDIwNzIxNDg0N1oXDTIzMDIwNzIxNDg0N1owgZYxCzAJBgNVBAYTAlVTMRMwEQYDVQQKDApBcHBsZSBJbmMuMSwwKgYDVQQLDCNBcHBsZSBXb3JsZHdpZGUgRGV2ZWxvcGVyIFJlbGF0aW9uczFEMEIGA1UEAww7QXBwbGUgV29ybGR3aWRlIERldmVsb3BlciBSZWxhdGlvbnMgQ2VydGlmaWNhdGlvbiBBdXRob3JpdHkwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDKOFSmy1aqyCQ5SOmM7uxfuH8mkbw0U3rOfGOAYXdkXqUHI7Y5/lAtFVZYcC1+xG7BSoU+L/DehBqhV8mvexj/avoVEkkVCBmsqtsqMu2WY2hSFT2Miuy/axiV4AOsAX2XBWfODoWVN2rtCbauZ81RZJ/GXNG8V25nNYB2NqSHgW44j9grFU57Jdhav06DwY3Sk9UacbVgnJ0zTlX5ElgMhrgWDcHld0WNUEi6Ky3klIXh6MSdxmilsKP8Z35wugJZS3dCkTm59c3hTO/AO0iMpuUhXf1qarunFjVg0uat80YpyejDi+l5wGphZxWy8P3laLxiX27Pmd3vG2P+kmWrAgMBAAGjgaYwgaMwHQYDVR0OBBYEFIgnFwmpthhgi+zruvZHWcVSVKO3MA8GA1UdEwEB/wQFMAMBAf8wHwYDVR0jBBgwFoAUK9BpR5R2Cf70a40uQKb3R01/CF4wLgYDVR0fBCcwJTAjoCGgH4YdaHR0cDovL2NybC5hcHBsZS5jb20vcm9vdC5jcmwwDgYDVR0PAQH/BAQDAgGGMBAGCiqGSIb3Y2QGAgEEAgUAMA0GCSqGSIb3DQEBBQUAA4IBAQBPz+9Zviz1smwvj+4ThzLoBTWobot9yWkMudkXvHcs1Gfi/ZptOllc34MBvbKuKmFysa/Nw0Uwj6ODDc4dR7Txk4qjdJukw5hyhzs+r0ULklS5MruQGFNrCk4QttkdUGwhgAqJTleMa1s8Pab93vcNIx0LSiaHP7qRkkykGRIZbVf1eliHe2iK5IaMSuviSRSqpd1VAKmuu0swruGgsbwpgOYJd+W+NKIByn/c4grmO7i77LpilfMFY0GCzQ87HUyVpNur+cmV6U/kTecmmYHpvPm0KdIBembhLoz2IYrF+Hjhga6/05Cdqa3zr/04GpZnMBxRpVzscYqCtGwPDBUfMIIEuzCCA6OgAwIBAgIBAjANBgkqhkiG9w0BAQUFADBiMQswCQYDVQQGEwJVUzETMBEGA1UEChMKQXBwbGUgSW5jLjEmMCQGA1UECxMdQXBwbGUgQ2VydGlmaWNhdGlvbiBBdXRob3JpdHkxFjAUBgNVBAMTDUFwcGxlIFJvb3QgQ0EwHhcNMDYwNDI1MjE0MDM2WhcNMzUwMjA5MjE0MDM2WjBiMQswCQYDVQQGEwJVUzETMBEGA1UEChMKQXBwbGUgSW5jLjEmMCQGA1UECxMdQXBwbGUgQ2VydGlmaWNhdGlvbiBBdXRob3JpdHkxFjAUBgNVBAMTDUFwcGxlIFJvb3QgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDkkakJH5HbHkdQ6wXtXnmELes2oldMVeyLGYne+Uts9QerIjAC6Bg++FAJ039BqJj50cpmnCRrEdCju+QbKsMflZ56DKRHi1vUFjczy8QPTc4UadHJGXL1XQ7Vf1+b8iUDulWPTV0N8WQ1IxVLFVkds5T39pyez1C6wVhQZ48ItCD3y6wsIG9wtj8BMIy3Q88PnT3zK0koGsj+zrW5DtleHNbLPbU6rfQPDgCSC7EhFi501TwN22IWq6NxkkdTVcGvL0Gz+PvjcM3mo0xFfh9Ma1CWQYnEdGILEINBhzOKgbEwWOxaBDKMaLOPHd5lc/9nXmW8Sdh2nzMUZaF3lMktAgMBAAGjggF6MIIBdjAOBgNVHQ8BAf8EBAMCAQYwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUK9BpR5R2Cf70a40uQKb3R01/CF4wHwYDVR0jBBgwFoAUK9BpR5R2Cf70a40uQKb3R01/CF4wggERBgNVHSAEggEIMIIBBDCCAQAGCSqGSIb3Y2QFATCB8jAqBggrBgEFBQcCARYeaHR0cHM6Ly93d3cuYXBwbGUuY29tL2FwcGxlY2EvMIHDBggrBgEFBQcCAjCBthqBs1JlbGlhbmNlIG9uIHRoaXMgY2VydGlmaWNhdGUgYnkgYW55IHBhcnR5IGFzc3VtZXMgYWNjZXB0YW5jZSBvZiB0aGUgdGhlbiBhcHBsaWNhYmxlIHN0YW5kYXJkIHRlcm1zIGFuZCBjb25kaXRpb25zIG9mIHVzZSwgY2VydGlmaWNhdGUgcG9saWN5IGFuZCBjZXJ0aWZpY2F0aW9uIHByYWN0aWNlIHN0YXRlbWVudHMuMA0GCSqGSIb3DQEBBQUAA4IBAQBcNplMLXi37Yyb3PN3m/J20ncwT8EfhYOFG5k9RzfyqZtAjizUsZAS2L70c5vu0mQPy3lPNNiiPvl4/2vIB+x9OYOLUyDTOMSxv5pPCmv/K/xZpwUJfBdAVhEedNO3iyM7R6PVbyTi69G3cN8PReEnyvFteO3ntRcXqNx+IjXKJdXZD9Zr1KIkIxH3oayPc4FgxhtbCS+SsvhESPBgOJ4V9T0mZyCKM2r3DYLP3uujL/lTaltkwGMzd/c6ByxW69oPIQ7aunMZT7XZNn/Bh1XZp5m5MkL72NVxnn6hUrcbvZNCJBIqxw8dtk2cXmPIS4AXUKqK1drk/NAJBzewdXUhMYIByzCCAccCAQEwgaMwgZYxCzAJBgNVBAYTAlVTMRMwEQYDVQQKDApBcHBsZSBJbmMuMSwwKgYDVQQLDCNBcHBsZSBXb3JsZHdpZGUgRGV2ZWxvcGVyIFJlbGF0aW9uczFEMEIGA1UEAww7QXBwbGUgV29ybGR3aWRlIERldmVsb3BlciBSZWxhdGlvbnMgQ2VydGlmaWNhdGlvbiBBdXRob3JpdHkCCA7rV4fnngmNMAkGBSsOAwIaBQAwDQYJKoZIhvcNAQEBBQAEggEATUlbRlIk6mSTRS9dzULddr6Rxyw+rkptOS7MQYPdOE0XCnOaT8v+VyuGXxMbbD6GGFKQqMtmbfQFcUyBXaAjmZnXaQx9dkbBQ2q5SllhfO07ZSPlbCIwaOgFn9eaDB8Rz+9d/vvgVQdki+znbate/rW/T7s+P61YvvgGHeVlaNyRaBHBMXrc/A5zVlkU3Yo9zU2lGI+oxAH4WuStOPEzmO+yH7nsZcG4C2ARUvFSNxHxHLsRKHFnWFv8Y287aFXatzI0QYH7xCNA6+yXX9b16bFCKQ2HYaJyKQH/pW61BZ+/SZQjwB+jOwB9SomfpF2xbxF0/hEkBBqaxyOqvS7Xag==\"}, \"bid\":\"com.youku.LaiFeng\", \"bvrs\":\"416\"}";
//        JSONObject message = JSON.parseObject(body);
//        JSONObject message = JSONObject.parseObject(body);
//        System.out.println(message);

        int a = 0x0200;
        System.out.println(a);
        System.out.println(Math.pow(2, 8));

        List<String> list = Arrays.asList("AAA", "BBB", "CCC");
        list.stream().forEach(System.out::println);


        // 字节数量: 2097152 byte = X * 1024 byte;
        Integer KB = 2097152000 / 1024;
        Integer MB = 2097152000 / 1024 / 1024;
        System.out.println(KB + "KB, " + MB + "MB");


    }


    public static void decorateUser(User user) {
        user.setCode(1111);
        user.setDesc("1111");
    }

    public static void decorate(List<User> users) {
        for(User user: users) {
            user.setDesc("user_" + user.getCode());
        }
    }

    public static void sortedNobleUserList(List<User> users) {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getCode() - o1.getCode();
            }
        });
    }

    public static List<User> getPageList(List<User> users, int pageIndex, int pageSize) {
        int fromIndex = pageIndex * pageSize;
        if (fromIndex >= users.size()) {
            return Collections.emptyList();
        }

        int toIndex = (pageIndex + 1) * pageSize;
        if (toIndex >= users.size()) {
            toIndex = users.size();
        }
        return users.subList(fromIndex, toIndex);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class User {
        private Integer code;
        private String  desc;
        private Date time;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class KlassUser {
        private List<User> userList = Lists.newArrayList();
        private List<String> strList = Lists.newArrayList();
    }

    public enum ClassState {
        UNPARSABLE_BY_GC(1,"UNPARSABLE_BY_GC"),
        ALLOCATED(2,"ALLOCATED"),
        LOADED(3,"LOADED"),
        LINKED(4,"LINKED"),
        BEING_INITIALIZED(5,"BEINGINITIALIZED"),
        FULLY_INITIALIZED(6,"FULLYINITIALIZED"),
        INITIALIZATION_ERROR(7,"INITIALIZATIONERROR"),
        OTHER(8,"OTHER"),
        ;

        private int code;
        private String desc;

        ClassState(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
