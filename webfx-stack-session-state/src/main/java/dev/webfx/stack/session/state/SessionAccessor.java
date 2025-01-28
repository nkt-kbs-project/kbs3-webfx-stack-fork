package dev.webfx.stack.session.state;

import dev.webfx.platform.util.Booleans;
import dev.webfx.stack.session.Session;

import java.util.Objects;

/**
 * @author Bruno Salmon
 */
public final class SessionAccessor {

    private final static String SERVER_SESSION_ID_ATTRIBUE_NAME = "serverSessionId"; // Used only on client side to store the sessionId generated by the server
    private final static String USER_ID_ATTRIBUE_NAME = "userId";
    private final static String RUN_ID_ATTRIBUE_NAME = "runId"; // Used only on server side to store the runId generated by the client
    private final static String BACKOFFICE_ATTRIBUE_NAME = "backoffice"; // Used only on server side to store the client type (backoffice or not)
    private final static String SERVER_SESSION_ID_SYNCED_ATTRIBUE_NAME = "serverSessionIdSynced"; // Used only on server side to store the info if the client knows the sessionId


    public static String getServerSessionId(Session session) {
        return session.get(SERVER_SESSION_ID_ATTRIBUE_NAME);
    }

    public static boolean changeServerSessionId(Session session, String sessionId, boolean skipNullValue) {
        return changeSessionAttribute(session, SERVER_SESSION_ID_ATTRIBUE_NAME, sessionId, skipNullValue);
    }

    public static Object getUserId(Session session) {
        return session.get(USER_ID_ATTRIBUE_NAME);
    }

    public static boolean changeUserId(Session session, Object userId, boolean skipNullValue) {
        return changeSessionAttribute(session, USER_ID_ATTRIBUE_NAME, userId, skipNullValue);
    }

    public static String getRunId(Session session) {
        return session.get(RUN_ID_ATTRIBUE_NAME);
    }

    public static boolean changeRunId(Session session, String runId, boolean skipNullValue) {
        return changeSessionAttribute(session, RUN_ID_ATTRIBUE_NAME, runId, skipNullValue);
    }

    public static Boolean isBackoffice(Session session) {
        return Booleans.toBoolean(session.get(BACKOFFICE_ATTRIBUE_NAME));
    }

    public static boolean changeBackoffice(Session session, Boolean backoffice, boolean skipNullValue) {
        return changeSessionAttribute(session, BACKOFFICE_ATTRIBUE_NAME, backoffice, skipNullValue);
    }

    public static boolean isServerSessionIdSynced(Session session) {
        return Boolean.TRUE.equals(session.get(SERVER_SESSION_ID_SYNCED_ATTRIBUE_NAME));
    }

    public static boolean changeServerSessionIdSynced(Session session, boolean serverSessionIdSynced) {
        return changeSessionAttribute(session, SERVER_SESSION_ID_SYNCED_ATTRIBUE_NAME, serverSessionIdSynced, false);
    }

    static boolean changeSessionAttribute(Session session, String key, Object value, boolean skipNullValue) {
        if (skipNullValue && value == null || session == null || Objects.equals(value, session.get(key)))
            return false;
        //System.out.println("session(" + session.id() + ")." + key + " = " + value);
        if (value == null)
            session.remove(key);
        else
            session.put(key, value);
        return true;
    }
}
