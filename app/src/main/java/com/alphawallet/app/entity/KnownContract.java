package com.alphawallet.app.entity;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KnownContract {

    @SerializedName("BSC")
    @Expose
    private final List<UnknownToken> bsc = null;

    @SerializedName("XLAYER")
    @Expose
    private final List<UnknownToken> xlayer = null;

    public List<UnknownToken> getBSC() {
        return bsc;
    }

    public List<UnknownToken> getXLAYER() {
        return xlayer;
    }

    // For compatibility - return BSC as the main network
    public List<UnknownToken> getMainNet() {
        return bsc;
    }
}