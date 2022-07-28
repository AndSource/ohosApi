package ohos.agp.text;

import java.util.List;
import ohos.agp.components.Component;
import ohos.agp.text.richstyles.RangedRichStyle;
import ohos.agp.text.richstyles.RichStyle;
import ohos.multimodalinput.event.TouchEvent;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/RichText.class */
public final class RichText implements Appendable, CharSequence {

    @Deprecated
    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/RichText$TouchEventListener.class */
    public interface TouchEventListener {
        @Deprecated
        boolean onTouchEvent(Component component, TouchEvent touchEvent);
    }

    public RichText() {
        throw new RuntimeException("Stub!");
    }

    public RichText(String text) {
        throw new RuntimeException("Stub!");
    }

    public RichText(RichText richText) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.CharSequence
    public char charAt(int position) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int start, int end) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Appendable
    public Appendable append(char c) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void addTouchEventListener(TouchEventListener listener, int start, int end) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void setLeadingMargin(int firstMargin, int restMargin) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getLeadingMargin(boolean firstMargin) {
        throw new RuntimeException("Stub!");
    }

    public List<RangedRichStyle> getRangedRichStylesByTypeId(int start, int end, RichStyle.TypeId typeId) {
        throw new RuntimeException("Stub!");
    }

    public List<RangedRichStyle> getRangedRichStylesByCapability(int start, int end, int capability) {
        throw new RuntimeException("Stub!");
    }

    public RangedRichStyle getRangedRichStyle(RichStyle richStyle) {
        throw new RuntimeException("Stub!");
    }

    public void setRichStyle(RichStyle richStyle, int start, int end, RangedRichStyle.Flag includeFlag) {
        throw new RuntimeException("Stub!");
    }

    public void setRichStyle(RangedRichStyle rangedRichStyle) {
        throw new RuntimeException("Stub!");
    }

    public int findNextTransitionPointByTypeId(int start, int end, RichStyle.TypeId typeId) {
        throw new RuntimeException("Stub!");
    }

    public int findNextTransitionPointByCapability(int start, int end, int capability) {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> findAllTransitionPointsByTypeId(int start, int end, RichStyle.TypeId typeId) {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> findAllTransitionPointsByCapability(int start, int end, int capability) {
        throw new RuntimeException("Stub!");
    }

    public void removeRichStyle(RichStyle richStyle) {
        throw new RuntimeException("Stub!");
    }

    public void removeRichStyleByTypeId(RichStyle.TypeId typeId) {
        throw new RuntimeException("Stub!");
    }

    public void removeRichStyleByCapability(int capability) {
        throw new RuntimeException("Stub!");
    }

    public void replace(int start, int end, String text) {
        throw new RuntimeException("Stub!");
    }

    public void replace(int start, int end, RichText richText) {
        throw new RuntimeException("Stub!");
    }

    public void replace(int start, int end, String text, int textStart, int textEnd) {
        throw new RuntimeException("Stub!");
    }

    public void replace(int start, int end, RichText richText, int textStart, int textEnd) {
        throw new RuntimeException("Stub!");
    }

    public void deleteAll() {
        throw new RuntimeException("Stub!");
    }

    public void deleteRichStyles() {
        throw new RuntimeException("Stub!");
    }

    public void delete(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public void insert(int position, String text) {
        throw new RuntimeException("Stub!");
    }

    public void insert(int position, RichText richText) {
        throw new RuntimeException("Stub!");
    }

    public void insert(int position, String text, int textStart, int textEnd) {
        throw new RuntimeException("Stub!");
    }

    public void insert(int position, RichText richText, int textStart, int textEnd) {
        throw new RuntimeException("Stub!");
    }
}
