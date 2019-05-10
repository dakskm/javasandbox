package practice.regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String args[]) {
        String taskFinishedLogLine = "2018-03-29 23:28:07,983 INFO  build-scheduler-akka.actor.default-dispatcher-53 " +
                "[c.a.i.b.d.DbMongoImpl @ DbMongoImpl] - {\"message\":\"stats\",\"call\":\"update.done\",\"eventId\":" +
                "\"a81ba34d-82cb-437e-9ee5-39c93e1b1b72:0\",\"success\":true,\"millis\":4,\"msgMillis\":15223," +
                "\"commitMillis\":15326,\"disposition\":\"TASK_FINISHED\"}";

        Pattern p = Pattern.compile("(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{3}).*\"message\":\"stats\".*(\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}:\\d).*\"millis\":(\\d+).*\"msgMillis\":(\\d+).*\"commitMillis\":(\\d+).*(TASK_FINISHED).*");
        Matcher m = p.matcher(taskFinishedLogLine);

        System.out.println(m.groupCount());
        if(m.find()) {
            for(int i = 1; i <= m.groupCount(); i++)
                System.out.println(m.group(i));
        } else {
            System.out.println("no matching line");
        }
    }
}
