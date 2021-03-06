package com.unionpay.session;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

public class LocalSessions {
    //存放所有局部会话
    private static Map<String, HttpSession> sessions = new HashMap<String, HttpSession>();
    public static String localSessionId = "";

    public static void addSession(String sessionId, HttpSession session) {
        sessions.put(localSessionId = sessionId, session);
    }

    public static void delSession(String sessionId) {
        sessions.remove(sessionId);
    }

    //根据id得到session
    public static HttpSession getSession(String sessionId) {
        return sessions.get(sessionId);
    }
}