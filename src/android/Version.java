package com.vaenow.appupdate.android;

/**
 * Created by LuoWen on 2015/12/14.
 */
public class Version {

    public Version(int local, int remote) {
        this.local = local;
        this.remote = remote;
    }

    public Version(String localName, String remoteNmae) {
        this.localName = localName;
        this.remoteNmae = remoteNmae;
    }

    private int local;

    private int remote;

    private String localName;

    private String remoteNmae;

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getRemoteNmae() {
        return remoteNmae;
    }

    public void setRemoteNmae(String remoteNmae) {
        this.remoteNmae = remoteNmae;
    }


    public int getLocal() {
        return local;
    }

    public int getRemote() {
        return remote;
    }
}
