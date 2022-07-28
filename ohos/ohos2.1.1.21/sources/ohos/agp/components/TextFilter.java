package ohos.agp.components;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/TextFilter.class */
public abstract class TextFilter {
    protected abstract FilterResults executeFiltering(CharSequence charSequence);

    protected abstract void publishFilterResults(CharSequence charSequence, FilterResults filterResults);

    public TextFilter() {
        throw new RuntimeException("Stub!");
    }

    public void filter(CharSequence constraint) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/TextFilter$FilterResults.class */
    protected static class FilterResults {
        public Object results;
        public int size;

        public FilterResults() {
            throw new RuntimeException("Stub!");
        }
    }
}
