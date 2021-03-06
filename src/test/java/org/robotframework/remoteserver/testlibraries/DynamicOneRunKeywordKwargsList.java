package org.robotframework.remoteserver.testlibraries;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DynamicOneRunKeywordKwargsList extends StaticOne {

    public String[] getKeywordNames() {
        return new String[] {"getArgs"};
    }

    public Object runKeyword(String name, List<?> args, Map kwargs) {
        if (name.equals("getArgs")) {
            return getArgs(args.toArray(), kwargs);
        } else {
            throw new RuntimeException();
        }
    }

    public List<String> getKeywordArguments(String name) {
        return Arrays.asList(new String[] {"*args", "**kwargs"}); 
    }

}
