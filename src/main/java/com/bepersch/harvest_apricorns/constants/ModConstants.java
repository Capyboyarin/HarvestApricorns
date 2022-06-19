package com.bepersch.harvest_apricorns.constants;

import java.util.Arrays;
import java.util.List;

public class ModConstants {

    //Mod info
    public static final String MOD_ID = "harvest_apricorns";
    public static final String MOD_NAME = "Harvest Apricorns";
    public static final String MOD_VERSION = "1.0";

    //Proxy paths
    public static final String CLIENT_PROXY_PATH = "com.bepersch.harvest_apricorns.proxy.ClientProxy";
    public static final String SERVER_PROXY_PATH = "com.bepersch.harvest_apricorns.proxy.CommonProxy";

    //Mod item ids
    public static final String APRICORN_CATALYST = "apricorn_catalyst";
    public static final String GREAT_APRICORN_CATALYST = "great_apricorn_catalyst";
    public static final String ULTIMATE_APRICORN_CATALYST = "ultimate_apricorn_catalyst";
    public static final String CATALYST_DUST = "catalyst_dust";
    public static final String INFUSED_GEMSTONE = "infused_gemstone";

    //Mod block ids
    public static final String APRICORN_FARMLAND = "apricorn_farmland";
    public static final String GREAT_APRICORN_FARMLAND = "great_apricorn_farmland";
    public static final String ULTIMATE_APRICORN_FARMLAND = "ultimate_apricorn_farmland";

    //Mod recipe names
    public static final List<String> RECIPE_NAMES = Arrays.asList(
            "apricorn_catalyst_v1",
            "apricorn_catalyst_v2",
            "great_apricorn_catalyst_v1",
            "great_apricorn_catalyst_v2",
            "ultimate_apricorn_catalyst_v1",
            "ultimate_apricorn_catalyst_v2",
            "apricorn_farmland",
            "great_apricorn_farmland",
            "ultimate_apricorn_farmland",
            "catalyst_dust",
            "infused_gemstone"
    );
}
