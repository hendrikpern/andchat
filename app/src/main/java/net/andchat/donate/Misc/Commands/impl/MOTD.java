// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.andchat.donate.Misc.Commands.impl;

import net.andchat.donate.Backend.ServerConnection;
import net.andchat.donate.Misc.Commands.Command;

public class MOTD extends Command
{

    public MOTD(String s)
    {
        super(s);
    }

    protected void execute(String s, String s1, net.andchat.donate.Misc.CommandParser.Helper helper)
    {
        s = helper.getServerConnection();
        if (s != null)
        {
            s.addServerConnnectionFlag(2);
        }
        helper.writeToServer("MOTD\r\n");
    }
}