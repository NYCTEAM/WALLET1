package com.alphawallet.app.entity;

import android.content.Context;
import android.text.TextUtils;

public class MediaLinks
{
    // Update these media platform links and ids to target your media groups,
    // then update the MEDIA_TARGET_APPLICATION to match your applicationId
    public static final String MEDIA_TARGET_APPLICATION = "io.stormbird.wallet";
    public static final String AWALLET_DISCORD_URL = null;
    public static final String AWALLET_TWITTER_ID = null;
    public static final String AWALLET_FACEBOOK_ID = null;
    public static final String AWALLET_TWITTER_URL = "https://x.com/EagleswapLLC";
    public static final String AWALLET_FACEBOOK_URL = null;
    public static final String AWALLET_LINKEDIN_URL = null;
    public static final String AWALLET_REDDIT_URL = null;
    public static final String AWALLET_INSTAGRAM_URL = null;
    public static final String AWALLET_BLOG_URL = "https://eagleswap.llc/";
    public static final String AWALLET_FAQ_URL = "https://eagleswap.llc/";
    public static final String AWALLET_GITHUB = "https://github.com/horizontalsystems/unstoppable-wallet-android";
    public static final String AWALLET_EMAIL1 = "support";
    public static final String AWALLET_EMAIL2 = "eagleswap.llc";
    public static final String AWALLET_SUBJECT = "Eagle Swap Android Help";

    public static boolean isMediaTargeted(Context context)
    {
        if (!TextUtils.isEmpty(MEDIA_TARGET_APPLICATION))
        {
            return context.getPackageName().equals(MEDIA_TARGET_APPLICATION);
        }
        else
        {
            return false;
        }
    }
}
