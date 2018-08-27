package com.p000;

import java.util.ArrayList;

/* compiled from: MediaWrapperInterface */
/* renamed from: dkw */
public interface dkw {
    ArrayList<dkv> getImageTiles();

    dkv getImageWrapper();

    String getMp4LocalPath();

    String getMp4Url();

    boolean hasImageTiles();

    boolean isAnimated();
}
