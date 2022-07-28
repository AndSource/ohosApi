package ohos.security.asset;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.IntentParams;

/* loaded from: ohos3.0.0.1.jar:ohos/security/asset/AssetOperatorAbs.class */
public abstract class AssetOperatorAbs {
    @Deprecated
    public abstract AssetResult assetInsert(Ability ability, IntentParams intentParams);

    @Deprecated
    public abstract AssetResult assetDelete(Ability ability, IntentParams intentParams);

    @Deprecated
    public abstract AssetResult assetUpdate(Ability ability, IntentParams intentParams);

    @Deprecated
    public abstract AssetResult assetSelect(Ability ability, IntentParams intentParams);

    public abstract AssetResult assetInsert(IntentParams intentParams);

    public abstract AssetResult assetDelete(IntentParams intentParams);

    public abstract AssetResult assetUpdate(IntentParams intentParams);

    public abstract AssetResult assetSelect(IntentParams intentParams);

    public AssetOperatorAbs() {
        throw new RuntimeException("Stub!");
    }
}
