package com.alphawallet.ethereum;

/* Weiwu 12 Jan 2020: This class eventually will replace the EthereumNetworkBase class in :app
 * one all interface methods are implemented.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class EthereumNetworkBase
{ // implements EthereumNetworkRepositoryType
    // Only BSC and XLAYER are supported
    public static final long BINANCE_MAIN_ID = 56;
    public static final long XLAYER_MAINNET_ID = 196;


    // BSC RPC URLs with smart switching
    public static final String BINANCE_MAIN_RPC_URL = "https://bsc.eagleswap.io";
    public static final String BINANCE_MAIN_BACKUP_RPC_URL = "https://bsc.eagleswap.llc/26119c762d57f906602c2d4bed374e05bab696dccdd2c8708cfacd4303f71c5f";
    
    // XLAYER RPC URL
    public static final String XLAYER_MAINNET_RPC_URL = "https://rpc.xlayer.tech";


    static Map<Long, NetworkInfo> networkMap = new LinkedHashMap<Long, NetworkInfo>()
    {
        {
            put(XLAYER_MAINNET_ID, new NetworkInfo("X Layer", "OKB", XLAYER_MAINNET_RPC_URL, "https://www.oklink.com/xlayer/tx/",
                    XLAYER_MAINNET_ID, false));
            put(BINANCE_MAIN_ID, new NetworkInfo("Binance (BSC)", "BNB", BINANCE_MAIN_RPC_URL, "https://bscscan.com/tx/",
                    BINANCE_MAIN_ID, false, BINANCE_MAIN_BACKUP_RPC_URL));
        }
    };

    public static NetworkInfo getNetworkByChain(long chainId)
    {
        return networkMap.get(chainId);
    }

    public static String getShortChainName(long chainId)
    {
        NetworkInfo info = networkMap.get(chainId);
        if (info != null)
        {
            String shortName = info.name;
            int index = shortName.indexOf(" (Test)");
            if (index > 0) shortName = info.name.substring(0, index);
            // Remove parenthetical info like " (BSC)"
            int parenIndex = shortName.indexOf(" (");
            if (parenIndex > 0) shortName = shortName.substring(0, parenIndex);
            return shortName;
        }
        else
        {
            return networkMap.get(BINANCE_MAIN_ID).name;
        }
    }

    public static String getChainSymbol(long chainId)
    {
        NetworkInfo info = networkMap.get(chainId);
        if (info != null)
        {
            return info.symbol;
        }
        else
        {
            return networkMap.get(BINANCE_MAIN_ID).symbol;
        }
    }
}
