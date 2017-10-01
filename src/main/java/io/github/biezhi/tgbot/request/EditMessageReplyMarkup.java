package io.github.biezhi.tgbot.request;

import io.github.biezhi.tgbot.api.request.InlineKeyboardMarkup;
import io.github.biezhi.tgbot.response.BotResponse;

/**
 * Stas Parshin
 * 07 May 2016
 */
public class EditMessageReplyMarkup extends BotRequest<EditMessageReplyMarkup, BotResponse> {

    public EditMessageReplyMarkup(Object chatId, int messageId, String text) {
        super(BotResponse.class);
        add("chat_id", chatId).add("message_id", messageId).add("text", text);
    }

    public EditMessageReplyMarkup(String inlineMessageId, String text) {
        super(BotResponse.class);
        add("inline_message_id", inlineMessageId).add("text", text);
    }

    public EditMessageReplyMarkup replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

}
