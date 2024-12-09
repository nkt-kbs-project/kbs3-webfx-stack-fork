package dev.webfx.stack.authn;

/**
 * @author Bruno Salmon
 */
public final class InitiateAccountCreationCredentials {

    private final String email;
    private final String clientOrigin; // ex: https://mydomain.com The magic link will start with the same origin, so it goes back to the same server
    private final Object language;
    private final Object context; // ex: ModalityContext with organization & event => used to select the correct mailbox and magic link letter template

    public InitiateAccountCreationCredentials(String email, String clientOrigin, Object language, Object context) {
        this.email = email;
        this.clientOrigin = clientOrigin;
        this.language = language;
        this.context = context;
    }

    public String getEmail() {
        return email;
    }

    public String getClientOrigin() {
        return clientOrigin;
    }

    public Object getLanguage() {
        return language;
    }

    public Object getContext() {
        return context;
    }
}

