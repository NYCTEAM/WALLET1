package com.alphawallet.ethereum;

/* Weiwu 12 Jan 2020: This class eventually will replace the EthereumNetworkBase class in :app
 * one all interface methods are implemented.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class EthereumNetworkBase
{ // implements EthereumNetworkRepositoryType
    // ===== ACTIVE NETWORKS (ONLY BSC AND XLAYER MAINNET) =====
    public static final long BINANCE_MAIN_ID = 56;
    public static final long XLAYER_MAINNET_ID = 196;

    // BSC RPC URLs with smart switching
    public static final String BINANCE_MAIN_RPC_URL = "https://bsc.eagleswap.io";
    public static final String BINANCE_MAIN_BACKUP_RPC_URL = "https://bsc.eagleswap.llc/26119c762d57f906602c2d4bed374e05bab696dccdd2c8708cfacd4303f71c5f";
    
    // XLAYER RPC URL
    public static final String XLAYER_MAINNET_RPC_URL = "https://rpc.xlayer.tech";

    // ===== LEGACY NETWORK IDs (for compilation only - NOT ACTIVE) =====
    public static final long MAINNET_ID = 1;
    public static final long CLASSIC_ID = 61;
    public static final long GNOSIS_ID = 100;
    public static final long POLYGON_ID = 137;
    public static final long OPTIMISTIC_MAIN_ID = 10;
    public static final long ARBITRUM_MAIN_ID = 42161;
    public static final long AVALANCHE_ID = 43114;
    public static final long FANTOM_ID = 250;
    public static final long KLAYTN_ID = 8217;
    public static final long CRONOS_MAIN_ID = 25;
    public static final long AURORA_MAINNET_ID = 1313161554;
    public static final long MILKOMEDA_C1_ID = 2001;
    public static final long OKX_ID = 66;
    public static final long IOTEX_MAINNET_ID = 4689;
    public static final long BASE_MAINNET_ID = 8453;
    public static final long LINEA_ID = 59144;
    public static final long MANTLE_MAINNET_ID = 5000;
    public static final long PALM_ID = 11297108109L;
    public static final long ROOTSTOCK_MAINNET_ID = 30;
    public static final long MINT_ID = 185;
    
    // Test networks
    public static final long GOERLI_ID = 5;
    public static final long SEPOLIA_TESTNET_ID = 11155111;
    public static final long HOLESKY_ID = 17000;
    public static final long BINANCE_TEST_ID = 97;
    public static final long POLYGON_TEST_ID = 80001;
    public static final long POLYGON_AMOY_ID = 80002;
    public static final long ARBITRUM_TEST_ID = 421611;
    public static final long FUJI_TEST_ID = 43113;
    public static final long FANTOM_TEST_ID = 4002;
    public static final long CRONOS_TEST_ID = 338;
    public static final long AURORA_TESTNET_ID = 1313161555;
    public static final long KLAYTN_BAOBAB_ID = 1001;
    public static final long IOTEX_TESTNET_ID = 4690;
    public static final long BASE_TESTNET_ID = 84531;
    public static final long LINEA_TEST_ID = 59140;
    public static final long MANTLE_TESTNET_ID = 5001;
    public static final long PALM_TEST_ID = 11297108099L;
    public static final long ROOTSTOCK_TESTNET_ID = 31;
    public static final long MINT_SEPOLIA_TESTNET_ID = 1687;
    
    // RPC URLs (for compilation)
    public static final String SEPOLIA_TESTNET_RPC_URL = "";
    public static final String AMOY_TEST_RPC_URL = "";
    public static final String BASE_FREE_MAINNET_RPC = "";
    public static final String BASE_FREE_TESTNET_RPC = "";
    public static final String LINEA_TEST_FREE_RPC = "";
    public static final String OPTIMISTIC_MAIN_FALLBACK_URL = "";


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
