package net.emerald0s.nodumbc.logic;

import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChatListener {
    private static final Logger LOGGER = LoggerFactory.getLogger("NoDumbC");
    private static final String[] BLOCKED_MESSAGES = {"c", "cs", "r"};

    public static void register() {
        ServerMessageEvents.ALLOW_CHAT_MESSAGE.register((message, sender, params) -> {
            String msg = message.getSignedContent().trim().toLowerCase();

            for (String blocked : BLOCKED_MESSAGES) {
                if (msg.equals(blocked)) {
                    LOGGER.info("[NoDumbC blocked] " + sender.getName().getString() + ": " + msg);
                    return false;
                }
            }

            return true;
        });
    }
}
