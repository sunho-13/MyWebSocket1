package com.softagape.sb3websocket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessageDto {
    public enum ChatMessageType {
        ENTER,
        MESSAGE,
        OUT,
    }
    private ChatMessageType msgType;
    private String roomId;
    private String writer;
    private String message;
}
