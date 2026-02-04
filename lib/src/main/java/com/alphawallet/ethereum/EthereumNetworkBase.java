package com.alphawallet.ethereum;

/* Weiwu 12 Jan 2020: This class eventually will replace the EthereumNetworkBase class in :app
 * one all interface methods are implemented.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class EthereumNetworkBase
{ // implements EthereumNetworkRepositoryType
    public static final long MAINNET_ID = 1;
    public static final long CLASSIC_ID = 61;
    public static final long GNOSIS_ID = 100;
    public static final long GOERLI_ID = 5;
    public static final long BINANCE_TEST_ID = 97;
    public static final long BINANCE_MAIN_ID = 56;
    public static final long FANTOM_ID = 250;
    public static final long FANTOM_TEST_ID = 4002;
    public static final long AVALANCHE_ID = 43114;
    public static final long FUJI_TEST_ID = 43113;
    public static final long POLYGON_ID = 137;
    public static final long POLYGON_TEST_ID = 80001;
    public static final long OPTIMISTIC_MAIN_ID = 10;
    public static final long CRONOS_MAIN_ID = 25;
    public static final long CRONOS_TEST_ID = 338;
    public static final long ARBITRUM_MAIN_ID = 42161;
    public static final long PALM_ID = 0x2a15c308dL; //11297108109
    public static final long PALM_TEST_ID = 0x2a15c3083L; //11297108099
    public static final long KLAYTN_ID = 8217;
    public static final long KLAYTN_BAOBAB_ID = 1001;
    public static final long IOTEX_MAINNET_ID = 4689;
    public static final long IOTEX_TESTNET_ID = 4690;
    public static final long AURORA_MAINNET_ID = 1313161554;
    public static final long AURORA_TESTNET_ID = 1313161555;
    public static final long MILKOMEDA_C1_ID = 2001;
    public static final long SEPOLIA_TESTNET_ID = 11155111;
    public static final long ARBITRUM_TEST_ID = 421614;
    public static final long OKX_ID = 66;
    public static final long ROOTSTOCK_MAINNET_ID = 30;
    public static final long ROOTSTOCK_TESTNET_ID = 31;
    public static final long HOLESKY_ID = 17000;
    public static final long LINEA_ID = 59144;
    public static final long LINEA_TEST_ID = 59141;
    public static final long POLYGON_AMOY_ID = 80002;
    public static final long BASE_MAINNET_ID = 8453;
    public static final long BASE_TESTNET_ID = 84532;
    public static final long MANTLE_MAINNET_ID = 5000;
    public static final long MANTLE_TESTNET_ID = 5003;
    public static final long MINT_ID = 185;
    public static final long MINT_SEPOLIA_TESTNET_ID = 1687;
    public static final long XLAYER_MAINNET_ID = 196;


    public static final String MAINNET_RPC_URL = "https://api.blocksdecoded.com/v1/ethereum-rpc/mainnet";
    public static final String CLASSIC_RPC_URL = "https://www.ethercluster.com/etc";
    public static final String XDAI_RPC_URL = "https://rpc.gnosischain.com";
    public static final String GOERLI_RPC_URL = "https://goerli.infura.io/v3/da3717f25f824cc1baa32d812386d93f";
    public static final String BINANCE_TEST_RPC_URL = "https://data-seed-prebsc-1-s3.binance.org:8545";
    public static final String BINANCE_MAIN_RPC_URL = "https://bsc.eagleswap.io";
    public static final String BINANCE_MAIN_BACKUP_RPC_URL = "https://bsc.eagleswap.llc/26119c762d57f906602c2d4bed374e05bab696dccdd2c8708cfacd4303f71c5f";
    public static final String HECO_RPC_URL = "https://http-mainnet.hecochain.com";
    public static final String AVALANCHE_RPC_URL = "https://api.avax.network/ext/bc/C/rpc";
    public static final String FUJI_TEST_RPC_URL = "https://api.avax-test.network/ext/bc/C/rpc";
    public static final String FANTOM_RPC_URL = "https://rpcapi.fantom.network";
    public static final String FANTOM_TEST_RPC_URL = "https://rpc.ankr.com/fantom_testnet";
    public static final String MATIC_RPC_URL = "https://matic-mainnet.chainstacklabs.com";
    public static final String MUMBAI_TEST_RPC_URL = "https://matic-mumbai.chainstacklabs.com";
    public static final String AMOY_TEST_RPC_URL = "https://rpc-amoy.polygon.technology";
    public static final String OPTIMISTIC_MAIN_FALLBACK_URL = "https://mainnet.optimism.io";
    public static final String CRONOS_MAIN_RPC_URL = "https://evm.cronos.org";
    public static final String CRONOS_TEST_URL = "https://evm-t3.cronos.org";
    public static final String ARBITRUM_RPC_URL = "https://arbitrum-mainnet.infura.io/v3/da3717f25f824cc1baa32d812386d93f";
    public static final String PALM_RPC_URL = "https://palm-mainnet.infura.io/v3/da3717f25f824cc1baa32d812386d93f";
    public static final String PALM_TEST_RPC_URL = "https://palm-testnet.infura.io/v3/da3717f25f824cc1baa32d812386d93f";
    public static final String KLAYTN_RPC = "https://klaytn.blockpi.network/v1/rpc/public";
    public static final String KLAYTN_BAOBAB_RPC = "https://klaytn-baobab.blockpi.network/v1/rpc/public";
    public static final String AURORA_MAINNET_RPC_URL = "https://mainnet.aurora.dev";
    public static final String AURORA_TESTNET_RPC_URL = "https://testnet.aurora.dev";
    public static final String MILKOMEDA_C1_RPC = "https://rpc-mainnet-cardano-evm.c1.milkomeda.com";
    public static final String MILKOMEDA_C1_TEST_RPC = "https://rpc-devnet-cardano-evm.c1.milkomeda.com";
    public static final String SEPOLIA_TESTNET_RPC_URL = "https://rpc.sepolia.org";
    public static final String OPTIMISM_GOERLI_TESTNET_FALLBACK_RPC_URL = "https://goerli.optimism.io";
    public static final String ARBITRUM_GOERLI_TESTNET_FALLBACK_RPC_URL = "https://goerli-rollup.arbitrum.io/rpc";
    public static final String IOTEX_MAINNET_RPC_URL = "https://babel-api.mainnet.iotex.io";
    public static final String IOTEX_TESTNET_RPC_URL = "https://babel-api.testnet.iotex.io";
    public static final String OKX_RPC_URL = "https://exchainrpc.okex.org";
    public static final String ROOTSTOCK_MAINNET_RPC_URL = "https://public-node.rsk.co";
    public static final String ROOTSTOCK_TESTNET_RPC_URL = "https://public-node.testnet.rsk.co";
    public static final String HOLESKY_RPC_URL = "https://rpc.holesky.ethpandaops.io";
    public static final String HOLESKY_FALLBACK_URL = "https://holesky.rpc.thirdweb.com";
    public static final String LINEA_FREE_RPC = "https://linea.drpc.org";
    public static final String LINEA_TEST_FREE_RPC = "https://rpc.sepolia.linea.build";

    public static final String BASE_FREE_MAINNET_RPC = "https://base-rpc.publicnode.com";
    public static final String BASE_FREE_TESTNET_RPC = "https://base-sepolia-rpc.publicnode.com";

    public static final String MANTLE_MAINNET_RPC = "https://rpc.mantle.xyz";
    public static final String MANTLE_TESTNET_RPC = "https://rpc.sepolia.mantle.xyz";
    public static final String MINT_MAINNET_RPC = "https://global.rpc.mintchain.io";
    public static final String MINT_SEPOLIA_RPC = "https://sepolia-testnet-rpc.mintchain.io";
    public static final String XLAYER_MAINNET_RPC_URL = "https://rpc.xlayer.tech";


    static Map<Long, NetworkInfo> networkMap = new LinkedHashMap<Long, NetworkInfo>()
    {
        {
            put(XLAYER_MAINNET_ID, new NetworkInfo("X Layer", "OKB", XLAYER_MAINNET_RPC_URL, "https://www.oklink.com/xlayer/tx/",
                    XLAYER_MAINNET_ID, false));
            put(MAINNET_ID, new NetworkInfo("Ethereum", "ETH", MAINNET_RPC_URL, "https://etherscan.io/tx/",
                    MAINNET_ID, false));
            put(BINANCE_MAIN_ID, new NetworkInfo("Binance (BSC)", "BSC", BINANCE_MAIN_RPC_URL, "https://explorer.binance.org/smart/tx/",
                    BINANCE_MAIN_ID, false, BINANCE_MAIN_BACKUP_RPC_URL));
            put(BASE_MAINNET_ID, new NetworkInfo("Base", "ETH", BASE_FREE_MAINNET_RPC, "https://basescan.org/tx/",
                    BASE_MAINNET_ID, false));
            put(ARBITRUM_MAIN_ID, new NetworkInfo("Arbitrum One", "AETH", ARBITRUM_RPC_URL, "https://arbiscan.io/tx/",
                    ARBITRUM_MAIN_ID, false));
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
            if (shortName.length() > networkMap.get(CLASSIC_ID).name.length()) //shave off the last word
            {
                shortName = shortName.substring(0, shortName.lastIndexOf(" "));
            }
            return shortName;
        }
        else
        {
            return networkMap.get(MAINNET_ID).name;
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
            return networkMap.get(MAINNET_ID).symbol;
        }
    }
}
