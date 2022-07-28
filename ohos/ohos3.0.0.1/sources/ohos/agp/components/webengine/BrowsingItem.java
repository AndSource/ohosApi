package ohos.agp.components.webengine;

import ohos.media.image.PixelMap;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/BrowsingItem.class */
public interface BrowsingItem {
    PixelMap getFavicon();

    String getTitle();

    String getFirstRequestUrl();

    String getCurrentUrl();
}
