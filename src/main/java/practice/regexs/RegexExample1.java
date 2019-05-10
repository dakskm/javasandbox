package practice.regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String args[]) {
        String str = "2018-08-08 15:35:40,996 INFO  content-service-dispatcher.input-27 [c.a.i.c.i.r.BundleHandler @ akka://content-service/user/cs/input/commits-queue-listener/037cec59-f0c4-48a0-b18f-2333d6af6bdb] - {\"message\":\"got bundle\",\"eventId\":\"037cec59-f0c4-48a0-b18f-2333d6af6bdb\",\"revision\":\"17868\",\"host\":\"iapps-10-140-251-31.rno.apple.com\",\"projectType\":\"PUBLISH\",\"projectId\":\"65767054\",\"locale\":\"src_ja_JP\",\"files\":[\"65880553.xml\",\"65850722.xml\",\"65848253.xml\",\"65843569.xml\",\"65879749.xml\"],\"wwFiles\":[\"65848253.xml\",\"65880553.xml\",\"65879749.xml\",\"65843569.xml\",\"65850722.xml\"]}";

        Pattern p = Pattern.compile(".*(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}).*\"got bundle\".*");
        Matcher m = p.matcher(str);

        if(m.find()) {
            System.out.println(m.groupCount());
            System.out.println(m.group(1));
        }
    }
}
