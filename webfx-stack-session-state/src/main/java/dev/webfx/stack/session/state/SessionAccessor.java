package dev.webfx.stack.session.state;

import dev.webfx.stack.session.Session;

import java.util.Objects;

/**
 * @author Bruno Salmon
 */
public final class SessionAccessor {

    private final static String SESSION_ID_ATTRIBUE_NAME = "sessionId"; // Used only on client side to store the sessionId generated by the server
    private final static String USER_ID_ATTRIBUE_NAME = "userId";
    private final static String RUN_ID_ATTRIBUE_NAME = "runId"; // Used only on server side to store the runId generated by the client
    private final static String SESSION_ID_SYNCED_ATTRIBUE_NAME = "sessionIdSynced"; // Used only on server side to store the info if the client knows the sessionId


    public static String getSessionId(Session session) {
        return session.get(SESSION_ID_ATTRIBUE_NAME);
    }

    public static boolean changeSessionId(Session session, String sessionId, boolean skipNullValue) {
        return changeSessionAttribute(session, SESSION_ID_ATTRIBUE_NAME, sessionId, skipNullValue);
    }

    public static String getUserId(Session session) {
        return session.get(USER_ID_ATTRIBUE_NAME);
    }

    public static boolean changeUserId(Session session, String sessionId, boolean skipNullValue) {
        return changeSessionAttribute(session, USER_ID_ATTRIBUE_NAME, sessionId, skipNullValue);
    }

    public static String getRunId(Session session) {
        return session.get(RUN_ID_ATTRIBUE_NAME);
    }

    public static boolean changeRunId(Session session, String sessionId, boolean skipNullValue) {
        return changeSessionAttribute(session, RUN_ID_ATTRIBUE_NAME, sessionId, skipNullValue);
    }

    public static boolean isSessionIdSynced(Session session) {
        return Boolean.TRUE.equals(session.get(SESSION_ID_SYNCED_ATTRIBUE_NAME));
    }

    public static boolean changeSessionIdSynced(Session session, boolean clientKnowsSessionId) {
        return changeSessionAttribute(session, SESSION_ID_SYNCED_ATTRIBUE_NAME, clientKnowsSessionId, false);
    }

    static boolean changeSessionAttribute(Session session, String key, Object value, boolean skipNullValue) {
        if (skipNullValue && value == null || session == null || Objects.equals(value, session.get(key)))
            return false;
        //System.out.println("session(" + session.id() + ")." + key + " = " + value);
        session.put(key, value);
        return true;
    }
}
