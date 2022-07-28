package ohos.nfc.tag;

/* loaded from: ohos2.0.1.95.jar:ohos/nfc/tag/MifareClassicTag.class */
public class MifareClassicTag extends TagManager {
    public static final int BLOCK_BYTES = 16;
    public static final int MIFARE_CLASSIC = 0;
    public static final int MIFARE_PLUS = 1;
    public static final int MIFARE_PRO = 2;
    public static final int MIFARE_UNKNOWN = -1;
    public static final int TAG_ROM_1K = 1024;
    public static final int TAG_ROM_2K = 2048;
    public static final int TAG_ROM_4K = 4096;
    public static final int TAG_ROM_MINI = 320;
    public static final byte USE_KEY_A = 96;
    public static final byte USE_KEY_B = 97;

    MifareClassicTag(TagInfo tagInfo) {
        super(null, 0);
        throw new RuntimeException("Stub!");
    }

    public static MifareClassicTag getInstance(TagInfo tagInfo) {
        throw new RuntimeException("Stub!");
    }

    public int getMifareType() {
        throw new RuntimeException("Stub!");
    }

    public int getTagSize() {
        throw new RuntimeException("Stub!");
    }

    public int getSectorsNum() {
        throw new RuntimeException("Stub!");
    }

    public int getBlocksNum() {
        throw new RuntimeException("Stub!");
    }

    public int getBlocksNumForSector(int sectorId) {
        throw new RuntimeException("Stub!");
    }

    public int getSectorId(int blockId) {
        throw new RuntimeException("Stub!");
    }

    public int getFirstBlockId(int sectorId) {
        throw new RuntimeException("Stub!");
    }

    public boolean authenSectorUseKey(int sectorId, byte[] key, byte keyType) {
        throw new RuntimeException("Stub!");
    }

    public byte[] readBlock(int blockId) {
        throw new RuntimeException("Stub!");
    }

    public void writeBlock(int blockId, byte[] data) {
        throw new RuntimeException("Stub!");
    }

    public void incBlock(int blockId, int value) {
        throw new RuntimeException("Stub!");
    }

    public void decBlock(int blockId, int value) {
        throw new RuntimeException("Stub!");
    }

    public void restoreBlock(int blockId) {
        throw new RuntimeException("Stub!");
    }
}
