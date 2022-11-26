package dev.webfx.stack.authn;

import dev.webfx.stack.authn.spi.AuthenticationServiceProvider;
import dev.webfx.platform.async.Future;
import dev.webfx.platform.util.serviceloader.SingleServiceProvider;

import java.util.ServiceLoader;

/**
 * @author Bruno Salmon
 */
public final class AuthenticationService {

    public static Future<?> authenticate(Object userCredentials) {
        return getProvider().authenticate(userCredentials);
    }

    public static Future<?> verifyAuthenticated() {
        return getProvider().verifyAuthenticated();
    }

    public static Future<UserClaims> getUserClaims() {
        return getProvider().getUserClaims();
    }

    public static Future<Void> logout() {
        return getProvider().logout();
    }

    public static AuthenticationServiceProvider getProvider() {
        return SingleServiceProvider.getProvider(AuthenticationServiceProvider.class, () -> ServiceLoader.load(AuthenticationServiceProvider.class));
    }
}
