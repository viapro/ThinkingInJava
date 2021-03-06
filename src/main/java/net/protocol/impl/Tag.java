package net.protocol.impl;

import net.protocol.SCObject;

/**
 * Created with IntelliJ IDEA.
 * User: ViaPro
 * Date: 13-11-28
 * Time: AM 9:55
 * To change this template use File | Settings | File Templates.
 */

public class Tag implements SCObject {

    public static final byte CARD_ID = (byte) 0x91;
    public static final byte CARD_PROGRAM_VERSION = (byte) 0x92;
    public static final byte PHONE_NUMBER = (byte) 0x93;
    public static final byte SE_KEY = (byte) 0x94;
    public static final byte AC_KEY = (byte) 0x95;
    public static final byte SA_KEY = (byte) 0x96;
    public static final byte CARD_STATUS = (byte) 0x97;
    public static final byte DEVICE_INFORMATION = (byte) 0x98;
    public static final byte BACKUP = (byte) 0x99;
    public static final byte RECOVER = (byte) 0x9A;
    public static final byte SPACE_INFORMATION = (byte) 0x9B;
    public static final byte SYNC_INFORMATION = (byte) 0x9C;

    private byte id;
    private byte length;
    private byte[] content;

    public byte getId() {
        return id;
    }

    public Tag setId(byte id) {
        this.id = id;
        return this;
    }

    public byte getLength() {
        return length;
    }

    public Tag setLength(byte length) {
        this.length = length;
        return this;
    }

    public byte[] getContent() {
        return content;
    }

    public Tag setContent(byte[] content) {
        this.content = content;
        return this;
    }

}
