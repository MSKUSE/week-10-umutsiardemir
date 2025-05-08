public class StackItem {
    private Object item = "NULL";
    private StackItem next;


    public StackItem(Object item) {
        this.item = item;
    }


    public Object getItem() {

        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }

    public StackItem getNext() {
        return next;
    }
}
